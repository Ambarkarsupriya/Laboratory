public class Constructor_overloading{
	 
 	Constructor_overloading(int a,int b){
 		System.out.println("Add : "+(a+b));
 	}

 	Constructor_overloading(int a, int b, int c){
 		System.out.println("Add : "+(a+b+c));
 	}
 
 static void add(int a, int b){
	 	System.out.println("Addition of a and b is : "+(a+b));
	 }
	 static void add(int a,int b,int c){
	 	System.out.println("Addition of a,b,c is : "+(a+b+c));
	 }
	 public static void main(String[] args) {
	 	Constructor_overloading ad = new Constructor_overloading(2,3);
	 	Constructor_overloading ad1 = new Constructor_overloading(8,9,3);
	 	add(1,2);
		add(7,8,4);
	 }
}
