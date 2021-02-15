package lab1;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author Sanat 190953222
 *Print a table of number entered by the user
 */
public class programadd3 {
    public static void main(String[] args){
        int num,terms;
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter number and multiples needed");
	//Take input from the user
        num=scan1.nextInt();
        terms=scan1.nextInt();
	//Scanner no longer needed, release Scanner object
	scan1.close();
	//i is the multiplication number, set it to 1.
        int i=1;
        while(terms--!=0){
	    //for every iteration, print the multiple and increment i by 1
            System.out.println(num+" x "+ i+" = "+num*(i++));
        }
    }
}
