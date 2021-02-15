package lab4;
import java.util.Scanner;

/**
 *
 * @author Sanat 190953222
 *Program to multiply and Add matrices
 */

public class Main{
   
   /***
    * Function to add matrices
    * @param a The first Matrix
    * @param b The Second Matrix
    * @param l The no of rows in first/Second Matrix
    * @param p The no of columns in first/Second Matrix
    */
    static void add(int a[][],int b[][],int l,int m){
        for(int i=0;i<l;i++){
            for(int j=0;j<m;j++){
            	//Simply add corresponding elements
                System.out.print(a[i][j]+b[i][j]+" ");
            }
            System.out.println("");
        }   
    }
    
    /***
     * Function to multiply matrices
     * @param a The first Matrix
     * @param b The second Matrix
     * @param l number of rows in first Matrix
     * @param m number of columns in first Matrix 
     * @param p number of rows in second Matrix
     * @param q number of columns in second matrix
     */
    static void multiply(int a[][],int b[][],int l,int m,int p,int q){
        int result[][]=new int[m][p];
        for(int i=0;i<l;i++){
            for(int j=0;j<q;j++){
                for(int k=0;k<m;k++){
                    result[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        //Print the resultant matrix
        for(int i=0;i<l;i++){
            for(int j=0;j<q;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String args[]){
        Scanner scan1=new Scanner(System.in);
        int l,m,p,q;
        
        System.out.println("Enter the number of rows and columns in the first matrix");
        l=scan1.nextInt();
        m=scan1.nextInt();
        int a[][]=new int[l][m];
        System.out.println("Enter the matrix elements one by one");
        for(int i=0;i<l;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scan1.nextInt();
            }
        }
       

        System.out.println("Enter the number of rows and columns in the second matrix");
        p=scan1.nextInt();
        q=scan1.nextInt();
        int b[][]=new int[p][q];
        System.out.println("Enter the matrix elements one by one");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                b[i][j]=scan1.nextInt();
            } 
       }
 
       
        //The addition of these matrices
        if(l==p && m==q){
            System.out.println("The resultant of matrix addition is ");
            add(a,b,l,m);
        }else{
            System.out.println("The matrices cannot be added");
        } 
       
	    //The multiplication of matrices
        if(m==p){
            System.out.println("The multiplication of these matrices is ");
            multiply(a,b,l,m,p,q);
        }else{
            System.out.println("The matrices cannot be multiplied");
        }
    }    
}

