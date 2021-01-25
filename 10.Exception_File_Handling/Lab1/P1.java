//Write to a file, Read from a file, Copy bytes from 1 file to another
//The program reads and write to File1, copies from File1 to File2

import java.io.*;
import java.util.Scanner;

public class P1{
	
	static FileInputStream fis;
	static FileOutputStream fos;

	
	static void read(){
		try{
			fis=new FileInputStream("File1.txt");
			int byteRead=fis.read();
			while(byteRead!=-1){
				System.out.print((char)byteRead);
				byteRead=fis.read();
			}
			fis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	static void write(){
		try{
			fos=new FileOutputStream("File1.txt");
			System.out.println("Start writing, hit ~ to discontinue");
			Scanner scan1=new Scanner(System.in);
			String lineRead;
			while(scan1.hasNext()){
				lineRead=scan1.nextLine();
				if(lineRead.startsWith("~"))
					break;
				fos.write(lineRead.getBytes());
				fos.write((byte)'\n');
				fos.flush();
			}
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	static void copy(){
		try{
			fis=new FileInputStream("File1.txt");
			fos=new FileOutputStream("File2.txt");
			byte barr[]=new byte[fis.available()];
			fis.read(barr);
			fos.write(barr);
			fis.close();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();	
		}
	}
	
	public static void main(String[] args){
		Scanner scan2=new Scanner(System.in);
		int choice;
		while(true){
			System.out.println("\nEnter a choice:\n'1':read\n'2':write\n'3':copy");
			choice=scan2.nextInt();
			switch(choice){
				case 1:
					read();
					break;
				case 2:
					write();
					break;
				case 3:
					copy();
					break;
				default:
					System.exit(0);
			}
		}
	}
}	
	