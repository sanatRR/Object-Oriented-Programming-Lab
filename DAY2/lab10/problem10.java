package lab10;
import java.lang.RuntimeException;
import java.util.Scanner;

/**
 *
 * @author Student
 * program to throw an error message
 */
public class problem10 {
    public static void main(String args[]){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter age");
        int age=scan1.nextInt();
        if(age<18)
            throw new EMessage();
        else 
            System.out.println("You are cleared to vote");
    }
    
}

class EMessage extends RuntimeException{
    EMessage(){
        super("Minimum age 18 needed to vote");
    }
}
