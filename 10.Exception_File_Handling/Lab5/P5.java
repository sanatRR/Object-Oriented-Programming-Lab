//Java Program for storing Student data
//Calculating grades and percentage


import java.io.*;
import java.util.Scanner;

class Student implements Serializable{
	int EngM,MathM,SciM;
	int per;
	Student(int a,int b,int c){
		EngM=a;
		MathM=b;
		SciM=c;
	}
}

public class P5{
	public static void main(String[] args){
	try{
		Scanner scan1=new Scanner(System.in);
		Student s1=new Student(90,80,95);
		FileOutputStream fs=new FileOutputStream("data.txt");
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(s1);
		os.flush();
		os.close();
		fs.close();
		//object written to data.txt
		FileInputStream fsi=new FileInputStream("data.txt");
		ObjectInputStream oi=new ObjectInputStream(fsi);
		Student temp=(Student)oi.readObject();
		oi.close();
		fsi.close();
		//set percentage
		temp.per=(s1.EngM+s1.MathM+s1.SciM)*100/300;
		//write back to file
		FileOutputStream fs1=new FileOutputStream("data.txt");
		ObjectOutputStream os1=new ObjectOutputStream(fs1);
		os1.writeObject(temp);
		os1.flush();
		os1.close();
		fs1.close();		
	}catch(IOException e){
		e.printStackTrace();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	}
}