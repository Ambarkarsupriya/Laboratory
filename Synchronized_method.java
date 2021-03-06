class Add{
	int count;
	 synchronized void increment(){
	 	synchronized(this){
		  count=count+1;
	 	}
	}
}
public class Synchronized_method{
	public static void main(String[] args)  {
		Add  a = new Add();
		class Method extends Thread{
			Add  a = new Add();
			Method(Add a){
				this.a = a;
			}
			public void run(){
				for (int i =1;i<=1000;i++){
					a.increment();
				}
			}
		}
		class Method1 extends Thread{
			Add  a = new Add();
			Method1(Add a){
				this.a = a;
			}
			public void run(){
				for (int i =1;i<=1000;i++){
					a.increment();
				}
			}
		}
		
		Thread a1 = new Method(a);
		Thread a2 = new Method1(a);
		
		a1.start();
		a2.start();
		try{
			a1.join();
			a2.join();
			
		}catch(Exception e){}
		System.out.println("count :" +a.count);

	}
}