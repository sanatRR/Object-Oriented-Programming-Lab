//Demonstrate isAlive() & join() to check status of Thread

import java.lang.Thread;
import java.lang.Runnable;

public class P3{
	public static void main(String[] args){
		
	Thread Timer=new Thread(new Runnable(){
		long startTime=System.currentTimeMillis();
		@Override
		public void run(){
			while(System.currentTimeMillis()-startTime<5000){}
		}
	});
	
	Timer.start();

	System.out.println("Timer running status: "+Timer.isAlive());
	try{
		Timer.join();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println("Timer Over");
	}
}