 abstract class Mobiles{
	 void old_phone(){
	}
}
class Inheritance extends Mobiles{
	 void old_phone(){
		System.out.println("I have only calling nd messaging and internet.");
	}

	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		obj.old_phone();
			
	}
}

