package lab2;
import java.util.Scanner;
/**
*
*@author Sanat 190953222
*To perform high performance division/multiplication by 2
*/

public class program3{
	public static void main(String[] args){
	Scanner scan1=new Scanner(System.in);
	System.out.println("Enter an Integer");
	int num=scan1.nextInt();
	System.out.println(num+" * 2 = "+ (num<<1));	
	System.out.println(num+" / 2 = "+ (num>>1)); 
	}
}	

