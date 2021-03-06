

public class Method_overloading{
	 static void add(int a, int b){
	 	System.out.println("Addition of a and b is : "+(a+b));
	 }
	 static void add(int a,int b,int c){
	 	System.out.println("Addition of a,b,c is : "+(a+b+c));
	 }
	public static void main(String[] args) {
		add(1,2);
		add(7,8,4);
		
	}
}