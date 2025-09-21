
/*
 * Write a program to accept a student’s name and three marks.
 *  Calculate the total and average, and display the result
 *  using a class and object.
 */
import java.util.Scanner;
public class exam {
      public static void results(String name,int mark1,int mark2,int mark3){
         float avg= (mark1+mark2+mark3)/3;
         System.out.println(name);
         System.out.println(avg);

    }
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter name");
     String name=sc.next();
     System.out.println("enter mark1");
     int mark1=sc.nextInt();
     System.out.println("enter mark2");
     int mark2=sc.nextInt();
     System.out.println("enter mark3");
     int mark3=sc.nextInt();
     
     results(name,mark1,mark2,mark3);
   
    }
}
