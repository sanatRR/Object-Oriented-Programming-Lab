package lab1;
import java.util.Scanner;

/**
 *
 * @author Sanat 190953222
 * Enter 10 numbers and display the number of positive negative and zeros
 */
public class program2 {
    public static void main(String args[]){
        Scanner scan1=new Scanner(System.in);
        int temp,pos=0,neg=0,zer=0;
        for(int i=0;i<10;i++){
            temp=scan1.nextInt();
            if(temp<0)
                neg++;
            else if(temp>0)
                pos++;
            else 
                zer++;
        }
        System.out.println("The number of positive numbers is "+pos);
        System.out.println("The number of negative numbers is "+neg);
        System.out.println("The number of zero numbers is "+zer);
    }
}
