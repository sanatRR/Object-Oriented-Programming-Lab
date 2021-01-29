//Java Program to use RandomAccessFile class
//To read, write append primitive data to file

import java.io.*;
import java.util.Scanner;

public class P2{
	static RandomAccessFile fobj;
	
	static void readF(){
		try{
			fobj=new RandomAccessFile("demo.rtf","r");
			int readByte;
			readByte=fobj.read();
			while(readByte!=-1){
				System.out.print((char)readByte);
				readByte=fobj.read();	
			}
			fobj.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	static void write(boolean append){
		try{
			fobj=new RandomAccessFile("demo.rtf","rw");
			String read;
			if(append)
				fobj.seek(fobj.length());
			Scanner scan1=new Scanner(System.in);
			System.out.println("Press ~ to stop");
			while(scan1.hasNext()){
				read=scan1.nextLine();
				if(read.equals("~"))
					break;
				read+="\n";
				fobj.write(read.getBytes());
			}
			fobj.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	public static void main(String[] args){
		int opt;
		Scanner scan2=new Scanner(System.in);
		while(true){
			System.out.println("\nSelect option:\n'1':Read\n'2':Write\n'3':Append");
			opt=scan2.nextInt();
			switch(opt){
				case 1:
					readF();
					break;
				case 2:
					write(false);
					break;
				case 3:
					write(true);
					break;
			}
		}
	}
}