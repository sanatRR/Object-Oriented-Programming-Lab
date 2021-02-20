import java.util.*;

public class MorningExam{
	
	static volatile String array[],subString;
	
	public static void main(String[] args) {
		Scanner scan1=new Scanner(System.in);
		int num;
		System.out.println("Enter the number of String values ");
		num=scan1.nextInt();
		
		Thread thread2=new Thread(new Runnable() {
			@Override
			public void run() {
				if(num>10)
					throw new OverflowArray();
			}
		});
		
		thread2.start();
		
		try {
			thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread thread1=new Thread(new Runnable() {
			int counter=0;
			@Override
			public void run() {
				for(int i=0;i<num;i++) {
					if(array[i].contains(subString))
						counter++;
				}
				System.out.println("The number of Strings containing the given subString is "+counter);
			}
		});
		
	

		
		array=new String[num];
		for(int i=0;i<num;i++) {
			System.out.println("Enter String "+(i+1));
			array[i]=scan1.next();
		}
		System.out.println("Enter the subString ");
		subString=scan1.next();
		scan1.close();
		thread1.start();
		
	}
}

class OverflowArray extends RuntimeException{
	OverflowArray(){
		super("ERROR! ARRAY SIZE MORE THAN 10!!");
	}
}