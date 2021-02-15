package lab5;
/**
 * @author Sanat 190953222
 * Bank program 1
 */
import java.util.Scanner;

public class programadd1{
    public static void main(String[] args){
    	Result obj=new Result();
    	obj.storeMarks2d();
    	obj.storeTotalMarks1d();
    	obj.highestSubjectTotalMarkName();
    	obj.highestTotalMarkName();
    }
}

class Result{
	static int arr2d[][];
	static int arr1d[];
	static {
		arr2d=new int[3][3];
		arr1d=new int[3];
	}
	
	/**
	 * Takes input and stores
	 * marks for each studnet
	 * in a 2d array
	 */
	void storeMarks2d() {
    	Scanner scan1=new Scanner(System.in);
    	for(int i=0;i<3;i++) {
    		System.out.println("Enter subject-wise score for roll-no "+(i+1)+" separated by space");
    		for(int j=0;j<3;j++) {
    			arr2d[i][j]=scan1.nextInt();
    		}
    	}
    	scan1.close();
	}
	
	void storeTotalMarks1d() {
		int sum;
		for(int i=0;i<3;i++) {
			sum=0;
			for(int j=0;j<3;j++) {
				sum+=arr2d[i][j];
			}
			arr1d[i]=sum;
		}
	}
	
	void highestSubjectTotalMarkName() {
		int highest;
		for(int j=0;j<3;j++) {
			highest=0;
			for(int i=0;i<3;i++) {
				if(arr2d[i][j]>arr2d[highest][j])
					highest=i;
			}
		System.out.println("The highest score in subject "+(j+1)+ " is "+arr2d[highest][j]+ " obtained by roll-no "+(highest+1));
		}
	}
	
	void highestTotalMarkName() {
		int highest=0,i;
		for(i=0;i<3;i++) {
			if(arr1d[i]>arr1d[highest]) {
				highest=i;
			}
		}
		System.out.println("Roll number "+(highest+1)+" has obtained highest total score of "+arr1d[highest]);
	}
	
	
	
}