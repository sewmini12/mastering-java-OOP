
/*
 * Write a program to accept a number and display 
 * its last digit in words using a method in a class.
 */
import java.util.Scanner;
public class lastDigit {

    public static void display(int number){
        switch(number % 10){
            case 0 :
               System.out.println("zero");
               break;
            case 1 :
               System.out.println("one");
               break;
            case 2 :
               System.out.println("two");
               break;
            case 3 :
               System.out.println("three");
               break;
            case 4 :
               System.out.println("four");
               break;
            case 5 :
               System.out.println("five");
               break;
            case 6 :
               System.out.println("six");
               break;
            case 7 :
               System.out.println("seven");
               break;
            case 8 :
               System.out.println("eight");
               break;
            case 9 :
               System.out.println("nine");
               break;
        }
    }
      public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number=sc.nextInt();
        display(number);

    }
}
