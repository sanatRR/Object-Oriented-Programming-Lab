package lab2;
import java.util.Scanner;
/**
*
*@author Sanat 190953222
*Program to experiment data-type conversions, 
*/

//	COMPILE-TIME ERROR! POSSIBLE LOSSY CONVERION FROM DOUBLE TO INT 



public class program4{
	@SuppressWarnings("all")
	public static void main(String[] args){
		System.out.println("Enter choice\n1.int to double\n2.double to int without cast\n3.double to int with cast\n4.exit");
		Scanner scan1=new Scanner(System.in);			
		try{
			while(true){
				int choice=scan1.nextInt();
				switch(choice){
					case 1:	int a=5;
						double b=a;
						System.out.println(b);
						break;
					case 2: double a1=5;
						@SuppressWarnings("unchecked")
						int b1=a1;
						System.out.println(b1);
						break;
					case 3:double a2=5;
						int b2=(int)a2;
						System.out.println(b2);
						break;
					case 4:
						System.exit(0);
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}