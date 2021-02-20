package temp;

import java.io.*;

public class program1{

	static void read(String name){
		try{	
			FileInputStream fIS=new FileInputStream(name);
			int readInt=fIS.read();
			while(readInt!=-1){
				char readChar=(char)readInt;
				System.out.print(String.valueOf(readChar));
				readInt=fIS.read();
			}
			fIS.close();
		}catch(FileNotFoundException e){
			System.out.println(name+" not found");
		}catch(IOException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("\n\n");
		}
	}

	public static void main(String[] args){
		for(int i=0;i<args.length;i++){
			read(args[i]);	
		}
	}
}