package lab1;
import java.util.Scanner;

/**
 *
 * @author Sanat 190953222
 * generate odd numbers from 1 to 100
 */
public class program3 {
    public static void main(String args[]){
        System.out.println("The list of odd numbers betweeen 1 and 100 is:");
     for(int i=1;i<=100;i++){
         if(i%2!=0)
             System.out.println(i);
     }   
    }
}
