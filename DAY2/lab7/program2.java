package lab7;

/**
*
*@author Sanat 190953222
*Program to count the number of objects created
*/

class A{
	/*
	 * Counter is static integer
	 * static since it is common for all
	 * objects
	 */
	public static int counter;
	static{
		//Initialize counter to 0
		counter=0;
	}
	/**
	 * Every time an object is made, this
	 * constructor shall be called and the
	 * counter will be incremented
	 */
	A(){
		counter++;
	}
}

public class program2{
	public static void main(String[] args){
		//Make 3 objects
		A a1=new A();
		A a2=new A();
		A a3=new A();
		//Print the count
		System.out.println("The number of objects made are "+A.counter);
	}
}