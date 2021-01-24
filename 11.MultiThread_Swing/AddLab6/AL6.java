//MultiThreaded program to:
//1.Generate within 10_000 Fibonacci numbers and store
//2.Generate within 10_000 Prime numebrs and store
//3.Print common from main thread

import java.lang.Math.*;
import java.util.ArrayList;

public class AL6{	

	static ArrayList<Integer> fibList=new ArrayList<Integer>();
	static ArrayList<Integer> primList=new ArrayList<Integer>();
	
	static boolean isPrime(int n){
		//Check every number <=squareRoot
		int flag=0;
		if(n==2)
			return true;
		for(int i=2;i<=Math.sqrt(n+0.0);i++){
			if(n%i==0){
				flag=1;
				break;
			}
		}
		if(flag==1)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args){

	Thread fibNumbers=new Thread(new Runnable(){
		int last,secLast,current=-1;
		
		@Override
		public void run(){
			fibList.add(0);
			fibList.add(1);
			last=secLast=1;
			while(true){
				current=last+secLast;
				if(current>=10_000)
					break;
				fibList.add(current);
				last=secLast;
				secLast=current;
			}
		}
	});
	
	Thread primeNumbers=new Thread(new Runnable(){
		@Override
		public void run(){
			for(int i=2;i<10_000;i++){
				if(isPrime(i)){
					primList.add(i);
				}
			}
		}
	});

	fibNumbers.start();
	primeNumbers.start();
	
	try{
		fibNumbers.join();
		primeNumbers.join();
	}catch(InterruptedException e){
		e.printStackTrace();
	}

	for(int i=0,j=0;i<fibList.size() && j<primList.size();)
	{
		if(fibList.get(i).equals(primList.get(j))){
			System.out.println(fibList.get(i));
			i++;
			j++;
		}
		else if(fibList.get(i)<primList.get(j))
			i++;
		else if(fibList.get(i)>primList.get(j))
			j++;
	}
	}
}	

	