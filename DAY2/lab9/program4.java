package lab9;

/**
 *
 * @author Sanat 190953222
 * To perform comparison operations and substring operations
 */
public class program4 {
    
	/**
	 * Function to compare two Strings
	 * @param a The first String
	 * @param b The Second String
	 */
    static void compare(String a,String b){
        if(a.compareTo(b)==0)
            System.out.println(a+"="+b);
        else if(a.compareTo(b)==1)
            System.out.println(a+">"+b);
        else if(a.compareTo(b)==-1)
            System.out.println(a+"<"+b);
    }
    
    /**
     * Function to convert lower-case characters <---> upper-case characters
     * @param input The original String
     * @return The case-Swapped String
     */
    static String swapCase(String input){
        String out="";
        for(int i=0;i<input.length();i++){
        	//With reference to ASCII chart
            if(input.charAt(i)>=65 && input.charAt(i)<=90)
                out+=(char)(input.charAt(i)+32);
            else if(input.charAt(i)>=97 && input.charAt(i)<=122)
                out+=(char)(input.charAt(i)-32);
            else 
                out+=(char)input.charAt(i);
        }
        return out;
    }
    
    /**
     * Function to check if target String is present in main String
     * @param main 
     * @param target
     */
    static void substringCheck(String main,String target){
        boolean contains;
        if(main.contains(target)){
            contains=true;
            System.out.println(main+" contains "+target);
        }
        else{
            contains=false;
            System.out.println(main+" does not contain "+target);
        }
        if(contains)
        {
        	//If present the replace all the target substrings with "hello"
            String modified=main.replace(target,"hello");
            System.out.println(modified);
        }
    }
    
    public static void main(String[] args){
    	//Driver Code
       compare("AA","BB");
       compare("BB","AA");
       compare("BB","BB"); 
       System.out.println(swapCase("SaNaT"));
       substringCheck("Sanat","ana");
    }
}
