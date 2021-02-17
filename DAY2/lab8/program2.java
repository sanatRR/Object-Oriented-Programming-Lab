package lab8;

/**
 *
 * @author Student
 * program to find area of a circle an rectangle
 * using abstract class
 */
public class program2 {
    public static void main(String[] args){
        rectangle r1=new rectangle(2,3);
        circle c1=new circle(8);
        System.out.println("The area of rectangle is "+r1.area());
        System.out.println("The area of circle is "+c1.area());
    }
}

abstract class figures{
    final double PI=3.141592653;
    double dim1,dim2;
    abstract double area();
}

class rectangle extends figures{
    rectangle(double length,double breadth){
        this.dim1=length;
        this.dim2=breadth;
    }
    double area(){
        return dim1*dim2;
    }
}

class circle extends figures{
    circle(double radius){
        this.dim1=radius;
    }
    double area(){
        return PI*dim1*dim1;
    }
}