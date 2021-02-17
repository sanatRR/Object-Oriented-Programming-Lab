package lab8;

/**
 *
 * @author Sanat 190953222
 * program to find area of a circle and a rectangle
 * using abstract class
 */
public class program2 {
    public static void main(String[] args){
    	/*
    	 * Make a rectangle object with dim1=2 and dim2=3
    	 */
        rectangle r1=new rectangle(2,3);
        /*
         * Make a circle object with dim1=8
         */
        circle c1=new circle(8);
        /**
         * Call their area() methods
         */
        System.out.println("The area of rectangle is "+r1.area());
        System.out.println("The area of circle is "+c1.area());
    }
}

abstract class figures{
    final double PI=3.141592653;
    double dim1,dim2;
    /**
     * Implementation not provided
     * since the area() method performs
     * differently for circle and rectangle
     * @return
     */
    abstract double area();
}

class rectangle extends figures{
	/**
	 * Constructor for rectangle class
	 * @param length of the rectangle
	 * @param breadth of the rectangle
	 */
    rectangle(double length,double breadth){
        this.dim1=length;
        this.dim2=breadth;
    }
    @Override
    double area(){
        return dim1*dim2;
    }
}

class circle extends figures{
	/**
	 * Constructor for the circle class
	 * @param radius of the circle
	 */
    circle(double radius){
        this.dim1=radius;
    }
    @Override
    double area(){
        return PI*dim1*dim1;
    }
}