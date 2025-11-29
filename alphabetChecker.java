/*
 * Create a class called AlphabetChecker with a method checkVowelOrConsonant(char letter).
 *  The method should accept a character (alphabet) and determine if it is a vowel (a, e, i, o, u)
 *  or a consonant. The program should display an appropriate message based on the input letter.
 *  Ensure the method handles both uppercase and lowercase letters.
 */
import java.util.Scanner;
class alphabetChecker{
    public static void main(String[]args){
         System.out.println("enter letter");
         Scanner sc=new Scanner(System.in);
         int let=sc.next().charAt(0);

    if(let=='a'|| let=='e'||let=='i'||let=='o'||let=='u' ){
        System.out.println("this letter is lowercase vowel");
    }
    else if (let=='A'|| let=='E'||let=='I'||let=='O'||let=='U' ){
        System.out.println("this letter is uppercase vowel");
    }
    else{
        System.out.println("not a vowel");
    }

   }
}