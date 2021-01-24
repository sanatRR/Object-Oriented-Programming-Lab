//Set priority and check for InterruptedException
/*
 * Construct Two Threads.
 * One of the threads is a DownCounter
 * Set priority of DownCounter to MAX
 * Put the other thread to sleep.
 * When Counter expires, interrupt the sleeping thread
 */

public class P4{
	public static void main(String[] args){
	
	A thread1=new A();
		
	Thread Counter=new Thread(new Runnable() {
		public void run() {
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			long startTime=System.currentTimeMillis();
			while(System.currentTimeMillis()-startTime<=5000) {
				//wait till 5 second elapsed
			}
			thread1.interrupt();
		}
	});
	Counter.start();
	thread1.start();
  }
}

class A extends Thread{
	@Override
	public void run(){
		try {
			//put thread to sleep, 10 seconds
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}	