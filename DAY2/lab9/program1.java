package lab9;
import java.util.Scanner;
/**
 *
 * @author Sanat 190953222
 * Count number of characters, words, lines and vowels
 */
public class program1 {
    public static void main(String[] args){
        int noLines=0,noWords=0,noChars=0,noVow=0;
        String input="",temp;
        System.out.println("Enter a string, press ~ to stop input");
        Scanner scan1=new Scanner(System.in);
        while(scan1.hasNext()){
            temp=scan1.nextLine();
            if(temp.equals("~"))
                break;
            input+=temp;
            noLines++;
            noWords++;
        }
        noWords--;
        noChars=input.length();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u' || input.charAt(i)=='A' || input.charAt(i)=='E' || input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U' )
                noVow++;
            if(input.charAt(i)==' ')
                noWords++;
                }
        noWords+=1;
        System.out.println("The numer of Lines are "+noLines);
        System.out.println("The numer of Words are "+noWords);
        System.out.println("The numer of Chars are "+noChars);
        System.out.println("The numer of Vowels are "+noVow);
    }
}
