package lab5;

/**
 *
 * @author Sanat 190953222
 *Program to implement the time class
 */
public class program3{
    public static void main(String args[]){
    	//Make first time object and display it
        time t1=new time(10,10,10);
        t1.display();
        //Make second time object and display it
        time t2=new time(4,4,4);
        t2.display();
        //Make third time object by adding first two, then display it
        time t3=t1.add(t2);
        t3.display();
    }
    
}

class time{
    int h,m,s;
    //Constructor to initialize all arguments to zero
    time(){
        h=0;
        m=0;
        s=0;
    }
    //Constructor to initialize to specified values
    time(int h,int m,int s){
        this.h=h;
        this.m=m;
        this.s=s;
    }
    
    //Display time in formatted manner hh::mm::ss
    void display() {
        System.out.printf("\n%02d:%02d:%02d",h,m,s);
    }
    
    /***
     * Adds time of "this" with the time of obj2
     * @param obj2 the second time object
     * @return a time object representing the sum
     */
    time add(time obj2){
        time result=new time();
        result.h=h+obj2.h;
        result.m=m+obj2.m;
        result.s=s+obj2.s;
        return result;
    }
}
