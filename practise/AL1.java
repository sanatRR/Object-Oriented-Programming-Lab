//Producer consumer program usign wait() & notify()
//Make a common LinkedList buffer
//Make 2 threads, i.e. Producer & Consumer
//Producer will add numbers to the LLBuffer & Consumer will remove

import java.util.LinkedList;

public class AL1{
	
	static volatile boolean produced;
	static LinkedList<Integer> linkedlist;
	
	static{
		produced=false;
		linkedlist=new LinkedList<Integer>();
	}

	synchronized void produce(int n){
		linkedlist.addLast(n);
		System.out.println(n+" produced");
		produced=true;
		notify();
	}
	
	synchronized int consume(){
		int consumed;
		while(!produced){
			try{
				wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		consumed=linkedlist.remove();
		produced=false;
		notify();
		return consumed;
	}
		
	public static void main(String[] args)
	{
	
	AL1 obj=new AL1();
	
	//The Producer Thread will produce numbers in
	//range [1,4]
	Thread producer=new Thread(new Runnable(){
		@Override
		public void run(){
			for(int i=1;i<=4;i++){
				obj.produce(i);
				try{
					Thread.sleep(1000);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	});

	//4 is the poison element for consumer
	Thread consumer=new Thread(new Runnable(){
		int consumedLocal=-1;
		@Override
		public void run(){
			while(consumedLocal!=4)
			{	
				consumedLocal=obj.consume();
				System.out.println(consumedLocal+" consumed");
			}
		}
	});

	producer.start();
	consumer.start();
	}
}