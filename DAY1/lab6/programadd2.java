package lab6;

/**
*
*@author Sanat 190953222
*Program to demonstrate dynamic method dispatch
*/

class Bike{
 int speedLimit;
 void run(){
	System.out.println("The speed-limit is "+speedLimit);
 }
}

class Splendar extends Bike{
 static int speedLimit;
 static{
	speedLimit=100;
 }
 @Override 
 void run(){
	System.out.println("The speed-limit is "+speedLimit);
 }
}

public class programadd2{
	public static void main(String[] args){
		Bike b1=new Splendar();
		b1.run();
	}
}
