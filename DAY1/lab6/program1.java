package lab6;
/**
 *
 * @author student
 * Bank program 1
 */
public class program1{
    public static void main(String[] args){
    	//Make a new savingAccount
        Account a=new savingAcc("Sanat Raorane");
        //Display balance
        a.displayBal();
        //deposit 20k
        a.deposit(20000);
        a.displayBal();
        //deposit interest
        a.depositInterest();
        a.displayBal();
        //withdraw 14000
        a.withdraw(14000);
        a.displayBal();
        //penalize
        a.penalize();
    }
}

abstract class Account{
    String custName;
    char type;
    int roi,acNum;
    static int num;
    double bal,minBal,penalty;
    
    static {
    	num=0;
    }
    
    /**
     * Constructor to create a new account with CustomerName and Type
     * @param custName
     * @param type
     */
    Account(String custName,char type){
    	acNum=++num;
    }
   
    /**
     * Function to display Balance
     */
    void displayBal(){
        System.out.println("The closing balance is "+this.bal);
    }
    
    /**
     * Function to deposit money
     * @param amt deposit amt into account
     */
    void deposit(double amt){
        bal+=amt; //deposit amount;
    }
    
    abstract void depositInterest();
    
    /**
     * Function to withdraw money
     * @param amt withdraw amt from account
     */
    void withdraw(double amt){
        bal-=amt;
    }
    abstract void penalize();
}

//savingAccount class
class savingAcc extends Account{
   int roi=4,minBal=10000,penalty=150;
   savingAcc(String custName){
	   super(custName,'s');
   }
   @Override
   void depositInterest() {
   	bal+=bal*roi/100; //deposit interest
   }
   @Override
	 void penalize() {
	    	if(bal<minBal) {
	    		bal-=penalty;
	    		System.out.println(penalty+" deducted from acc no "+acNum+" for non-maintenance of balance");
	    		displayBal();
	    	}
	 }
}

//CurrentAccount class
class currentAcc extends Account{
	int roi=1,minBal=2000,penalty=125;
	 currentAcc(String custName){
		   super(custName,'c');
	   }
	 @Override
	 void depositInterest() {
	    	bal+=bal*roi/100; //deposit interest
	  }
	 @Override
	 void penalize() {
	    	if(bal<minBal) {
	    		bal-=penalty;
	    		System.out.println(penalty+" deducted from acc no "+acNum+" for non-maintenance of balance");
	    		displayBal();
	    	}
	 }
}
