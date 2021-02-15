package lab4;
import java.util.Scanner;
/**
 *
 * @author Sanat 190953222
 *Program to list Non Principal Diagonal elements and find their sum.
 */
public class program1 {
    public static void main(String args[]){
         int a[][],m,sum=0;
         Scanner scan1=new Scanner(System.in);
         System.out.println("Enter the order of matrix ");
         m=scan1.nextInt();
         a=new int[m][m];
         System.out.println("Enter the matrix elements one by one ");
         for(int i=0;i<m;i++){
             for(int j=0;j<m;j++){
                 a[i][j]=scan1.nextInt();
             }
         }
         System.out.println("The non diagonal elements are ");
         
         for(int i=0;i<m;i++){
             for(int j=0;j<m;j++){
		//for Non-Principal Diagonal elements, i+j==m-1
                 if((i+j)==m-1){
		     sum+=a[i][j];
                     System.out.println(a[i][j]);
                 } 
             }
         }
         System.out.println("The sum of non diagonal elements is "+sum);
    }
}
