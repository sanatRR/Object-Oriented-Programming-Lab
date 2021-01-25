//Java program to calculate number of characters, vowels, lines and words

import java.io.*;

public class P3{
	public static void main(String[] args){
	//no of words=no of spaces + 1
	//no of characters...
	//no of vowels (if character is a, e, i, o or u)
	//no of lines (if charactr is \n)
	
	int readByte,noSp=0,noChar=0,noVow=0,noL=1;	

	try{
		FileInputStream fStream=new FileInputStream("demo.txt");
		readByte=fStream.read();
		while(readByte!=-1){
			char readChar=(char)readByte;
			noChar++;
			if(readChar==' ')
				noSp++;
			else if(readChar=='a' || readChar=='e' || readChar=='i' || readChar=='o' || readChar=='u')
				noVow++;
			else if(readChar=='\n')
			{
				noL++;
				noSp++; //to include the first word of next line
			}
			readByte=fStream.read();
		}
		fStream.close();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
	if(noChar==0)
		noL=0;	
	System.out.println("Number of Characters = "+noChar+"\nNumbr of Words = "+(noSp+1)+"\nNumber of Vowels = "+noVow+"\nNumber of Lines = "+noL);
	}
}