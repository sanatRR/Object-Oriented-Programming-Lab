//Program to make Thread Sleep

import java.lang.Runnable;
import java.lang.Thread;

public class AL5{
	public static void main(String[] args){
		
		Thread t1=new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Thread started\nSleeping for 5 seconds");
				try{
					Thread.sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("Thread Running Again");
			}
		});

		t1.start();
	}
}