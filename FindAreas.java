import java.util.*;

abstract class Shape{
 int dim1;
 int dim2;
Shape(int a, int b){
  dim1=a;
  dim2=b;
}
abstract double printArea( );
}

class Rectangle extends Shape{
Rectangle(int a,int b){
super(a,b);
}
double printArea()
{
   
    System.out.println("Area of rectangle is:" );
    return dim1*dim2;
}
}
class Triangle extends Shape{
Triangle(int a, int b){
 super(a,b);
}
double printArea()
{
   
    System.out.println("Area of triangle is:" );
    return 0.5*dim1*dim2; 
}
}
class Circle extends Shape{
   Circle(int a, int b){
 super(a,b);
}
double printArea()
{

    System.out.println("Area of circle is:" );
    return 3.14*dim1*dim1;
}
}

class FindAreas{
    public static void main(String[] args){
     Rectangle r=new Rectangle(4,5);
     Triangle t=new Triangle(2,4);
      Circle c=new Circle(3,0);
      Shape s;
      s=r;  
      double d= s.printArea( );
      System.out.println(d );
        s=t;  
       double e= s.printArea( );
      System.out.println(e );
     s=c;  
      double f=s.printArea( );
      System.out.println( f);
     }
}
      


    

     