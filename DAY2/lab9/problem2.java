package lab9;
import java.util.*;
import java.util.Scanner;
/**
*
*@author Sanat 190953222
*Replace an entered word to all repeating characters
*/


public class problem2{
	public static void main(String[] args){
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	Scanner scan1=new Scanner(System.in);
	System.out.println("Enter the String ");
	String input=scan1.next(),replacement;
	System.out.println("Enter the replacement ");
	replacement=scan1.next();
	
	for(int i=0;i<input.length();i++){
		if(map.containsKey(input.charAt(i)))
			map.put(input.charAt(i),map.get(input.charAt(i))+1);
		else
			map.put(input.charAt(i),0);
	}
	
	for(Map.Entry<Character,Integer> ivar:map.entrySet()) {
		if(ivar.getValue()!=0) {
			input=input.replaceAll(String.valueOf(ivar.getKey()), replacement);
		}
	}
	System.out.println(input);
	}
}
	