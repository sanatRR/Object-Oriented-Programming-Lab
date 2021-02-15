package lab2;
import java.util.Scanner;
/**
 *
 * @author Sanat 190953222
 *4 function i.e. add, subtract, multiply & divide calculator
 */
public class program5 {
    static float result(float a,float b,char op){
	//choose operation using switch statement
        switch(op){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            default:
                System.out.println("Invalid operation");
                return -1;
        }
    } 
    public static void main(String args[]){
       Scanner scan1=new Scanner(System.in);
       float a,b;
       char op='y';
       do{
           System.out.println("Enter the first number");
           a=scan1.nextFloat();
           System.out.println("Enter the second number");
           b=scan1.nextFloat();
           System.out.println("Enter the operation");
           op=scan1.next().charAt(0);
           System.out.println("The result of operation "+a+" "+op+" "+b+" is "+result(a,b,op));
           System.out.println("Do another calculation?");
           op=scan1.next().charAt(0);
	   //If y is entered then the program continues, else it exits
       }while(op=='y');
	//release the Scanner object
	scan1.close();
    }   
}
