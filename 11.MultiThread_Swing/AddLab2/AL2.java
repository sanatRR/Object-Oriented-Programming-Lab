//MultiThreading to create tables
//Make a common integral array
//first 20 will be multiples of 5
//next 20 will be multiples of 7
//next 20 will be multiples of13

public class AL2{
	public static void main(String[] args){
		int a[]=new int[60];
		
		Thread multiplesOf5=new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i=0;i<20;i++)
					a[i]=5*(i+1);
			}
		});
		
		Thread multiplesOf7=new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i=20;i<40;i++)
					a[i]=7*(i-19);
			}
		});
	
		Thread multiplesOf13=new Thread(new Runnable(){
			@Override
			public void run(){
				for(int i=40;i<60;i++)
					a[i]=13*(i-39);
			}
		});
	
		multiplesOf5.start();
		multiplesOf7.start();
		multiplesOf13.start();
	
		try{
			multiplesOf5.join();
			multiplesOf7.join();
			multiplesOf13.join(); 
		}catch(InterruptedException e){
			e.printStackTrace();
		}	

		for(int i=0;i<60;i++){
			if(i>=0 && i<20)
				System.out.println("5 x "+(i+1)+" = "+a[i]);
			else if(i>=20 && i<40)
				System.out.println("7 x "+(i-19)+" = "+a[i]);
			else
				System.out.println("13 x "+(i-39)+" = "+a[i]);
		} 
		}
}