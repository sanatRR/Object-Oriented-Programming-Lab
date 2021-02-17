package lab9;	
import java.util.Scanner;
/**
 *
 * @author Sanat 190953222
 * Count number of characters, words, lines and vowels
 */
public class program1 {	
    public static void main(String[] args){
    	//Initialize all the counters to 0
        int noLines=0,noWords=0,noChars=0,noVow=0;
        String input="",temp;
        System.out.println("Enter a string, press ~ to stop input");
        Scanner scan1=new Scanner(System.in);
        while(scan1.hasNext()){
            temp=scan1.nextLine();
            if(temp.equals("~"))
                break;
            input+=temp;
            /**
             * End of line signals
             * end of a word as well,
             * hence noWord++
             */
            noLines++;
            noWords++;
        }
        noChars=input.length();
        /**
         * Convert to lower case to
         * make code uniform
         */
        input=input.toLowerCase();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
                noVow++;
            if(input.charAt(i)==' ')
                noWords++;
        }
        //Print all the required details
        System.out.println("The numer of Lines are "+noLines);
        System.out.println("The numer of Words are "+noWords);
        System.out.println("The numer of Chars are "+noChars);
        System.out.println("The numer of Vowels are "+noVow);
    }
}
