
/*
 *  Create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
 *  Then, implement two subclasses Rectangle and Circle. The Rectangle class should have attributes
 *  for length and width, and the Circle class should have an attribute for radius. Both subclasses
 *  should implement the abstract methods to calculate the area and perimeter. Write a program to
 *  create instances of both classes, set their attributes, and display their area and perimeter.
 */
public abstract class shape {
    
    public abstract double calculateArea(){

    }
    public abstract double calculatePerimeter(){
        
    }    
}
public class rectangle extends shape{
    public double length;
    public double width;

}
public class circle extends shape{
    public double radius;


}

