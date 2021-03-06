import java.lang.String;
public class Threads_3{
	public static void main(String[] args) {
		Thread t1 = new Thread1();	
Thread t2 = new Thread2();	
Thread t3 = new Thread3();	

t1.start();
t2.start();
t3.start();
	}
}


class Thread1 extends Thread{
	public void run(){
	try{ 
		for(int i=0;i<5;i++){
		Thread.sleep(1000);
		System.out.println("Good morning");
	}
		}catch(Exception e){}
	}
}
class Thread2 extends Thread{
	public void run(){
	try{
		for(int i=0;i<5;i++){
		Thread.sleep(2000);
		System.out.println("Hello");
	}
		}catch(Exception e){}
	}
}
class Thread3 extends Thread{
	public void run(){
	try{

		for(int i=0;i<5;i++){
		Thread.sleep(3000);
		System.out.println("Welcome");
	}
		}catch(Exception e){}
	}
}
