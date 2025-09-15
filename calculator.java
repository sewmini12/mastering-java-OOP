/*. Create a class Calculator with the following methods:
calculateSum(int number1, int number2) to calculate the sum of two numbers.
calculateDifference(int number1, int number2) to calculate the difference between two numbers. */

public class calculator {
    
   public static void main(String[] args){
      int num1=5;
      int num2=10;
      calculateSum(num1,num2);
      calculateDifference(num1,num2);

   }
   public static void calculateSum(int num1,int num2){
    System.out.println(num1+num2);
   }
   public static void calculateDifference(int num1,int num2){ 
    System.out.println(num1-num2);
   }
}
