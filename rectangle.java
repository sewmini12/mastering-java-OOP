
/*
 * Create a class Rectangle with attributes length and width,
 *  each defaulting to  The class should include set and get
 *  methods for both attributes, and a method to calculate the area of the rectangle.
 */
public class rectangle {
    private int length=5;
    private int width=10;

    public static void main(String[] args){
        int length=getLength();
        int width=getwidth();
        int area=length*width;
        System.out.println(area);

    }
    public int getLength(){
       return length;
    }
    public int getwidth(){
        return width;
    }
}
