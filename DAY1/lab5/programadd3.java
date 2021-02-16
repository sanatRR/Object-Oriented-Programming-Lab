package lab5;

public class programadd3{
	public static void main(String[] args){
		intWrapper num1=new intWrapper(5);
		intWrapper num2=new intWrapper(10);
		System.out.println("Before Swapping num1="+num1.val+" and num2="+num2.val);
		swap(num1,num2);
		System.out.println("After Swapping num1="+num1.val+" and num2="+num2.val);	
	}

	static void swap(intWrapper a,intWrapper b){
		int temp;
		temp=a.val;
		a.val=b.val;
		b.val=temp;
	}
}

class intWrapper{
	int val;
	intWrapper(int val){
		this.val=val;
	}
}