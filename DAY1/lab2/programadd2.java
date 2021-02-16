package lab2;
import java.util.Scanner;

/**
*@author Sanat 190953222
*Program to find least and greatest number using ternary operator
*/

public class programadd2{
	public static void main(String args[]){
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter three numbers separated by space: ");
		int a=scan1.nextInt(),b=scan1.nextInt(),c=scan1.nextInt();
		int greatest=(a>b)?((a>c)?a:c):((b>c)?b:c);
		int least=(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("The greatest number is "+greatest+" and least number is "+least);
		}
}

