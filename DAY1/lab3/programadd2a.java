//1.Factorial function
//2.Keep a counter beginning from 1, if count is even then negative term

package lab3;
import java.util.Scanner;
import java.lang.Math;

public class programadd2a{
	final static double PI=3.14159265;
	
	static double degToRad(int degree){
		return degree*(PI/180);
	}
	
	static int factorial(int x){
		int result=1;
		for(int i=1;i<=x;i++){
			result*=i;
		}
		return result;
	}

	static double sin(double x,int y){
		int power=1,termNo=1;
		double result=0;
		while(y--!=0){
			if(termNo%2!=0){
				result+=Math.pow(x+0.0,power+0.0)/(factorial(power)+0.0);
			}else{
				result-=Math.pow(x+0.0,power+0.0)/(factorial(power)+0.0);
			}
			power+=2;
			termNo++;
		}
		return result;
	}

	public static void main(String[] args){
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter the angle in degrees and precision");
		int x=scan1.nextInt(),y=scan1.nextInt();
		double angleRadian=degToRad(x);
		System.out.println("The value of sin("+x+") is "+sin(angleRadian,y));
	}
}