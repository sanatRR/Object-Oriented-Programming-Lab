package lab1;
import java.util.Scanner;


/**
 *
 * @author student 190953222
 *program to check if a number is palindrome or not
 */

public class programadd1 {
    public static void main(String args[]){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=scan1.nextInt();
        String inputString="0";
        try{
            inputString=String.valueOf(input);
        }catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
        int flag=0;
        for(int i=0,j=inputString.length()-1;i<j;i++,j--){
            if(inputString.charAt(i)!=inputString.charAt(j))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("The number "+inputString+" is a palindrome");
        else
            System.out.println("The number "+inputString+" is not palindrome");
    }
}
