interface A {
	void mobile1();
	interface B{
		void mobile2();
		interface C{
			void mobile3();
		}
	}
}
class All_mobiles implements A{
	public void mobile1(){
		System.out.println("I am mobile1.");
	}
	public void mobile2(){
		System.out.println("I am mobile2.");
	}
	public void mobile3(){
		System.out.println("I am mobile3.");
	}
}
public class Nested_interface{
	public static void main(String[] args) {
		All_mobiles obj = new All_mobiles();
		obj.mobile1();
		obj.mobile2();
		obj.mobile3();
	}
}