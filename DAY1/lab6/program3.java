package lab6;

/**
 *
 * @author Sanat 190953222
 *Program to demonstrate method overriding and dynamic method dispatch
 */
public class program3 {
    public static void main(String args[]){
        Bank axis=new AXIS();
        Bank sbi=new SBI();
        Bank icici=new ICICI();
	//Dynamic method dispath, the exact getRateofInterest() method to be called is decided at runtime
        System.out.println(axis.getRateofInterest()+" "+sbi.getRateofInterest()+" "+icici.getRateofInterest());
    }
    
}

//Bank Class
abstract class Bank{
    int roi;
    abstract int getRateofInterest();
}

//SBI class extending Bank class
class SBI extends Bank{
    @Override
    int getRateofInterest(){
        return roi;
    }
    SBI(){
        this.roi=8;
    }
}

class AXIS extends Bank{
     @Override
    int getRateofInterest(){
        return roi;
    }
    AXIS(){
            this.roi=9;
    }
}

class ICICI extends Bank{
    @Override
    int getRateofInterest(){
        return roi;
    }
    ICICI(){
        this.roi=7;
    }
}