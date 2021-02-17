package lab10;
import java.util.Scanner;
/**
 *
 * @author Sanat 190953222
 * Program to compute percentage, grade and handle NumberFormatException
 */
public class problem9 {
	/**
	 * Function to calculate grade, percentage
	 * and total marks
	 * @param total
	 * @return
	 */
    static char calculateGrade(int total){
        System.out.println("The total marks are: "+total);
        System.out.println("Percentage: "+total*100.0/(300.0));
        if(total>=290)
            return 'A';
        else if(total>=240)
            return 'B';
        else if(total>=210)
            return 'C';
        else if(total>=180)
            return 'D';
        else if(total>=150)
            return 'E';
        else 
            return 'F';
    }
    
    public static void main(String[] args){
     String name;
     int rollNo;
     int total;
     Scanner scan1=new Scanner(System.in);
     System.out.println("Enter name, roll-no and mark for subject 1, 2 and 3 separated by space");
     String input=scan1.nextLine();
     //Split the input string at every white-space
     String array[]=input.split(" ");
     name=array[0];
     try{
         rollNo=Integer.valueOf(array[1]);
         total=(Integer.valueOf(array[2])+Integer.valueOf(array[3])+Integer.valueOf(array[4]));
         System.out.println("The grade is "+calculateGrade(total));
     }
     catch(NumberFormatException e){
         System.out.println("Please enter a numeric value for age and marks");
     }
     catch(Exception e){
         System.out.println(e.getMessage());
     }
    }
}
