//Java Program to Name Thread

public class AL3{
	public static void main(String[] args){
	
	Thread t1=new Thread(new Runnable(){
		@Override
		public void run(){
			Thread.currentThread().setName("Demo Thread");
		}
	});
	
	t1.start();
	try{
		t1.join();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println(t1.getName());
	}
}