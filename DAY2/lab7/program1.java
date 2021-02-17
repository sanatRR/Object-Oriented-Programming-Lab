package lab7;
import java.util.LinkedList;
import java.util.Scanner;

/**
*
*@author Sanat 190953222
*Program to store student record and details
*/

class Student_Detail{
	//name,college_name and id are private to ensure data hiding
	private String name,college_name;
	private int id;
	
	/**
	 * Displays the name college name, id and name for every student
	 */
	public void display_details(){
		System.out.println("\nThe details for id no "+id+" are\nname "+name+"\ncollege-name "+college_name+"\n");
	}
	
	/**
	 * Constructor for Student_Detail class
	 * @param name Name of Student, type String
	 * @param college_name, Name of College, type String
	 * @param id id of Student, type integer
	 */
	Student_Detail(String name,String college_name,int id){
		this.name=name;
		this.college_name=college_name;
		this.id=id;
	}
}

public class program1{
	public static void main(String[] args){
		//LinkedList is being used to store Student_Detail objects
		LinkedList<Student_Detail> list1=new LinkedList<Student_Detail>();
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the number of students ");
		String tempName;
		int num=scan1.nextInt(),tempID;
		/**
		 * Obtain details of students from user
		 * Make Student_Detail objects and add
		 * them to the LinkedList
		 */
		while(num--!=0){
			tempName=scan1.next();
			tempID=scan1.nextInt();
			list1.add(new Student_Detail(tempName,"MIT",tempID));
		}		
		/**
		 * Iterate the LinkedList and print the student
		 * details
		 */
		for(Student_Detail ivar:list1){
			ivar.display_details();
		}
	}
}