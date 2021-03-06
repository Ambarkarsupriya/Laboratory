class Section{
	void section1(){
		System.out.println("Student 1 in sec 1");

	}
}

public class Dynamic_binding extends Section{
	void section1(){
		System.out.println("Student 2 in sec 1");

	}
	public static void main(String[] args) {
		Section a = new Dynamic_binding();
		a.section1();
	}
}