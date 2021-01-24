//Java program to create multiple instances of Thread

import java.util.Scanner;
import java.lang.Thread;

public class P2{
	public static void main(String[] args){
	Scanner scan1=new Scanner(System.in);
	int choice;
	while(true){
		System.out.println("Enter Choice:\n1:Make a new Thread\n2:Quit");
		choice=scan1.nextInt();
		switch(choice){
			case 1:
				A thread=new A();
				thread.start();	
				break;
			case 2:
				System.exit(0);
			default:
				System.out.println("Invalid Choice");
		}
	}
	}
}

class A extends Thread{
	static int ThreadCount;
	int currentThreadCount;
	static{
		ThreadCount=0;
	}
	A(){
		currentThreadCount=++ThreadCount;
	}
	public void run(){
		System.out.println("Thread "+ (currentThreadCount)+" created");
		try{
			Thread.sleep(2500);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Thread "+(currentThreadCount)+" about to die");
	}
}