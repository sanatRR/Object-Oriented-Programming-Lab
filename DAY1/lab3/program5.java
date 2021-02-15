package lab3;
import java.util.Scanner;
/**
 *
 * @author Sanat 190953222
 *Program to implement Linear Search
 */
public class program5 {
    public static void main(String[] args){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int nos=scan1.nextInt();
	//Make a 1D array
	int a[]=new int[nos];
        System.out.println("Enter the elements one by one");
	//Input all the elements
        for(int i=0;i<nos;i++){
            a[i]=scan1.nextInt();
        }
        System.out.println("Enter the element to be searched ");
        int target=scan1.nextInt();
        int i=0;
        System.out.println("The value is found at ");
	//iterate the array a using for-each loop
        for(int ivar:a){
            if(ivar==target)
                System.out.println("a["+i+"],");
            i++;
        }
       
    }
}
