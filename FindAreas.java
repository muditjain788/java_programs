
/*  method overriding dynamic method dispatch in Inheritance*/

import java.io.*;

class Figure {
    
   double dim1;
   double dim2;
   
   Figure(double a , double b) {
      dim1 = a;
      dim2 = b;
   }
   
   Double area() {
      System.out.println("area of figure:");
      return(dim1*dim2);
   }
}
class Rectangle extends Figure {
   Rectangle(double a, double b) {
      super(a ,b);
   }
   
   Double area() {
      System.out.println("area of rectangle");
      return(dim1*dim2);
   }
}
class Triangle extends Figure{
    Triangle(double a,double b){
        super(a,b);
    }
    Double area(){
        System.out.println("area of traingle");
        return(dim1*dim2);
    }
}
public class Findareas {
   public static void main (String []agrs) {
      Figure f = new Figure(10 , 10);
      Rectangle r = new Rectangle(9 , 5);
      Triangle t=new Triangle(4,5);
      Figure ref;
      ref = f;
      System.out.println("Area is :"+ref.area());
      ref = r;
      System.out.println("Area is :"+ref.area());
      ref=t;
      System.out.println("Area is:"+ref.area());
       
   }
}
