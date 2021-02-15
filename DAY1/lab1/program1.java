package lab1;

import java.util.Scanner;

/**
 *
 * @author Sanat 190953222
 *Java program to find area and circumference of a rectangle
 */
public class program1 {
    
    public static void main(String[] args){
     Scanner scan1=new Scanner(System.in);
     double length,breadth;
        System.out.println("Enter length and breadth");
        length=scan1.nextInt();
        breadth=scan1.nextInt();
        double circum,area;
        circum=2*(length+breadth);
        area=length*breadth;
        System.out.println("The area is "+area+" and circumference is "+circum);
    }
}
