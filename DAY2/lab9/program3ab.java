package lab9;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Sanat 190953222
 * program to check palindrome and sort a string
 */
public class program3ab {
    static boolean isPalin(String in){
       char a[]=in.toCharArray();
       int flag=0;
       for(int i=0,j=a.length-1;i<j;i++,j--){
           if(a[i]!=a[j]){
               flag=1;
               break;
           }
       }
       if(flag==0)
           return true;
       else 
           return false;
    }
    
    static void sortString(String in){
        char b[]=in.toCharArray();
        Arrays.sort(b);
        String out=new String(b);
        System.out.println("The sorted string is: "+out);
    }
    
    public static void main(String[] args){
        System.out.println("Enter a string");
        Scanner scan1=new Scanner(System.in);
        String input=scan1.nextLine();
        if(isPalin(input))
            System.out.println("The string "+input+" is a palindrome\n\n");
        else
            System.out.println("The string "+input+" is not a palindrome\n\n");
           sortString(input);
    }
 }

