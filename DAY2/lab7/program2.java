package lab7;

/**
*
*@author Sanat 190953222
*Program to count the number of objects created
*/

class A{
	public static int counter;
	static{
		counter=0;
	}
	A(){
		counter++;
	}
}

public class program2{
	public static void main(String[] args){
		A a1=new A();
		A a2=new A();
		A a3=new A();
		System.out.println("The number of objects made are "+A.counter);
	}
}