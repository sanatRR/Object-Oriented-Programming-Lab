package lab7;
import java.util.LinkedList;

/**
*
*@author Sanat 190953222
*Program to store student record and details
*/

class Student_Detail{
	private String name,college_name;
	private int id;
	public void display_details(){
		System.out.println("The details for id no "+id+" are\nname "+name+"\ncollege-name "+college_name+"\nid "+id+"\n\n");
	}
	Student_Detail(String name,String college_name,int id){
		this.name=name;
		this.college_name=college_name;
		this.id=id;
	}
}

public class program1{
	public static void main(String[] args){
		LinkedList<Student_Detail> list1=new LinkedList<Student_Detail>();
		list1.add(new Student_Detail("Sanat","MIT",190953222));
		list1.add(new Student_Detail("Akshat","MIT",190953121));
		list1.add(new Student_Detail("Shrey","MIT",190953001));
		for(Student_Detail ivar:list1){
			ivar.display_details();
		}
	}
}