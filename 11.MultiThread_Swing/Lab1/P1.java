//Menu Driven Program to Make Thread Using by Either Implementing Runnable 
//Or extending Thread

import java.util.Scanner;
import java.lang.*;

public class P1{
	public static void main(String[] args){
	Scanner scan1=new Scanner(System.in);
	int opt;
	while(true){
		System.out.println("Enter Choice:\n1:Runnable Thread\n2:Thread class Thread\n-1:Exit");
		opt=scan1.nextInt();
		switch(opt){
			case 1:
				Thread threadA=new Thread(new A());
				threadA.start();
				break;
			case 2:
				B thread=new B();
				thread.start();
				break;
			case -1:
				System.exit(0);
			default:
				System.out.println("Incorrect Option");
			}
		}
	}
}

class A implements Runnable{
	
		@Override
		public void run(){
			System.out.println("Thread made by implementing Runnable");
		}
}

class B extends Thread{
	
		@Override
		public void run(){
			System.out.println("Thread made by extending Thread");
		}
}
	