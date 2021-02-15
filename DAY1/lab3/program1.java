package lab3;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Sanat 190953222
 *Program to check if a number is Armstrong or not
 */
public class program1 {
    public static void main(String args[]){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=scan1.nextInt(),temp,sum=0;
	//Store the input in another variable, as the original input will be operated upon.
        temp=input;
        while(input!=0){
	    //input%10 returns the digit at units place
            sum+=Math.pow(input%10,3);
            input/=10;
        }
        if(sum==temp)
            System.out.println(temp+ " is an Armstrong number");
        else
            System.out.println(temp+" is not an Armstrong number");
    }
    
}
