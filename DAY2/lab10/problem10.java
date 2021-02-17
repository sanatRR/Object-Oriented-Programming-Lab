package lab10;
import java.lang.RuntimeException;
import java.util.Scanner;

/**
 *
 * @author Sanat 190953222
 * program to throw an error message
 */
public class problem10 {
    public static void main(String args[]){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter age");
        int age=scan1.nextInt();
        if(age<18)
            throw new EMessage(); //Create an Exception object and throw the same
        else 
            System.out.println("You are cleared to vote");
    }
    
}

/**
 * EMessage extends RuntimeException class
 * since we are throwing an Exception at Runtime
 */
class EMessage extends RuntimeException{
    EMessage(){
        super("Minimum age 18 needed to vote");
    }
}
