package lab8;
import java.util.*;

/**
 *
 * @author Sanat 190953222
 * Calculate sales for hardware and software items
 */
public class program1 {
    public static void main(String[] args){
    	/**
    	 * Make an object each for hardware and 
    	 * software class
    	 */
        hardware h1=new hardware();
        software s1=new software();
        /**
         * Place the hardware key-value pairs
         * in the hardMap
         */
        h1.hardMap.put("Dell", "inspiron");
        h1.hardMap.put("HP", "SpectreX360");
        h1.hardMap.put("Apple","MacbookPro");
        /**
         * Place the software key-value pairs 
         * in the softMap
         */
        s1.softMap.put("Microsoft", "Windows7");
        s1.softMap.put("Android", "Oreo");
        /**
         * print the total sales
         * i.e size of the HashMaps
         */
        s1.totalSales();
        h1.totalSales();
    }
}

interface K{
	/**
	 * totalSales is an abstract
	 * method which just prints
	 * the size of HashMaps
	 */
    void totalSales();
}

class hardware implements K{
   
     HashMap<String,String> hardMap=new HashMap<String,String>();
     
     /**
      * provide implementation for
      * totalSales() abstract method
      */
     public void totalSales(){
        System.out.println("Total Hardware Sales are "+hardMap.size());
    }
}

class software implements K{
  
     HashMap<String,String> softMap=new HashMap<String,String>();
     
     /**
      * provide implementation for 
      * totalSales() abstract method
      */
      public void totalSales(){
        System.out.println("Total software Sales are "+softMap.size());
    }
}