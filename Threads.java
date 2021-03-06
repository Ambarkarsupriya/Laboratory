class A implements Runnable{
	public void run(){
		for(int i =1;i<=5;i++){
			System.out.println("Java");

			try{ 
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}
class B implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("Programs");

			try{ 
				Thread.sleep(500);
			}catch(Exception e){}
		}
	}
}

class Threads{
	public static void main(String[] args) {
		A obj1= new A();
		B obj2= new B();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		try{
			t1.start();
			t2.start();
		}catch(Exception e){}
	}
}