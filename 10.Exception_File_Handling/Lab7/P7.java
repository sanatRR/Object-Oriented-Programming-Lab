//Program to Handle Number 
//Format Exception


public class P7{
	public static void main(String[] args){
		String s="Demo";
		try{
			Integer i=Integer.valueOf(s);
		}catch(NumberFormatException e){
			System.out.println("Exception Handled Successfully "+e.getMessage());
		}
	}
}