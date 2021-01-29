//Java program to handle ArrayOverflowException

import java.lang.RuntimeException;

class ArrayOverflowException extends RuntimeException{
		ArrayOverflowException(){
			super("MAX SIZE EXCEEDED");
		}
}

public class P8{
	public static void main(String[] args){
		try{
			int temp=1000;
			int arr[]=new int[temp];
			if(temp>100)
				throw new ArrayOverflowException();
		}catch(ArrayOverflowException e){
			System.out.println("Exception caught "+e.getMessage());
		}
	}
}