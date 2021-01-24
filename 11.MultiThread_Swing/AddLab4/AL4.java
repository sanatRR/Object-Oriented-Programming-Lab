//Java Program to illustrate thread priority
/*
* WARNING! 
* Depending on factors like OS, whether the
* program is executed from terminal/IDE. Thread 
* prioritization may or may not have any effect.
*/

import java.lang.Thread;
import java.lang.Runnable;
	

public class AL4{

	static volatile int lowPriorCount=0,defPriorCount=0,highPriorCount=0;

	public static void main(String[] args){
	long startTime=System.currentTimeMillis();
	
	
	Thread lowPrior=new Thread(new Runnable(){
		@Override
		public void run(){
			Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
			while(System.currentTimeMillis()-startTime<=5000)	
				lowPriorCount++;
		}
	});

	Thread defPrior=new Thread(new Runnable(){
		@Override
		public void run(){
			Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
			while(System.currentTimeMillis()-startTime<=5000)	
				defPriorCount++;
		}
	});

	Thread highPrior=new Thread(new Runnable(){
		@Override
		public void run(){
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			while(System.currentTimeMillis()-startTime<=5000)	
				highPriorCount++;
		}
	});
	

	lowPrior.start();
	defPrior.start();
	highPrior.start();
	
	try{
		lowPrior.join();
		defPrior.join();
		highPrior.join();
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println("* WARNING!\n*Depending on factors like OS, whether the \n*program is executed from terminal/IDE. Thread\n* prioritization may or may not have any effect.");
	System.out.println("Low prior count "+lowPriorCount+"\nDef prior count "+defPriorCount+"\nHih prior count "+highPriorCount);
	}
}
	