import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter two intergers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        double result=x/y;
        System.out.println(result);
        }
        catch(InputMismatchException e){
            System.out.println("enter only l5etters");
        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
    }
}
