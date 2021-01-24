//Java Program to demonstrate to synchronize threads using Synchronized keyword

import java.lang.Math;

public class P5a{
	synchronized static void powerOfTwo(){
		Double i=2.0,p=1.0;
		while(p++!=10)
			System.out.println("Power of two is "+Math.pow(i,p));
	}

	synchronized static void powerOfThree(){
		Double i=3.0,p=1.0;
		while(p++!=10)
			System.out.println("Power of three is "+Math.pow(i,p));
	}

	public static void main(String[] args){
		Thread threadA=new Thread(new Runnable(){
			@Override
			public void run(){
				powerOfTwo();
			}
		});

		Thread threadB=new Thread(new Runnable(){
			@Override
			public void run(){
				powerOfThree();
			}
		});
		
		threadA.start();
		threadB.start();
	}
}