package lab10;
import java.util.Scanner;
/**
 *
 * @author Sanat 190953222
 * program to handle ArrayOverflowException
 */
import java.lang.RuntimeException;

class ArrayOverflowException extends RuntimeException{
		ArrayOverflowException(){
			super("MAX SIZE EXCEEDED");
		}
}

public class program8{
	public static void main(String[] args){
            System.out.println("Enter size of array");
            Scanner scan1=new Scanner(System.in);
            int temp=scan1.nextInt();
		try{
			int arr[]=new int[temp];
			/**
			 * If size of array is greater than 100
			 * then Exception shall be thrown
			 */
			if(temp>100)
				throw new ArrayOverflowException();
		}catch(ArrayOverflowException e){
			System.out.println("Exception caught "+e.getMessage());
		}
	}
}