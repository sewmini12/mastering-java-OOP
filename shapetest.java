
/*
 *  Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
 *  Then, implement two subclasses Rectangle and Circle. The Rectangle class should have attributes
 *  for length and width, and the Circle class should have an attribute for radius. Both subclasses
 *  should implement the abstract methods to calculate the area and perimeter. Write a program to
 *  create instances of both classes, set their attributes, and display their area and perimeter.
 */
 abstract class shape {
    
    public abstract double calculateArea();
    public abstract double calculatePerimeter();  
}
class rectangle extends shape{
    double length;
    double width;

    public rectangle(double length,double width){
         this.length=length;
         this.width=width;
    }
    public double calculateArea(){
        return width*length;

    }
    public double calculatePerimeter(){
        return 2*(width+length);
    }     
}
class circle extends shape{
    double radius;

    circle(double radius){
        this.radius=radius;
    }
  public double calculateArea(){
        return 2*3.14*radius*radius;

    }
     public double calculatePerimeter(){
        return 2*3.14*radius;
    }  
}
public class shapetest{
   public static void main(String[]args){
        rectangle r1=new rectangle(31, 30);
        circle c1=new circle(3.5);
        System.out.println(r1.calculateArea());
        System.out.println(r1.calculatePerimeter());
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculatePerimeter());
   }
}
