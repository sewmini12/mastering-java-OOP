import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;
import java.io.IOException;
public class Expect  {
    



/* 
    public static void main(String[] args) {
        FileReader fr= new FileReader("test1.txt");
    }
 */
   //checked exception handle using try catch
    /*public static void main(String[] args) {
        try{
        FileReader fr=new FileReader("test1.txt");
        }catch(FileNotFoundException e){
           System.out.println("can't find file");
        }
    }*/

/* 
    //unchecked exception
    public static void main(String[] args){
        int a=10;
        int b=0;
        int[] arr={1,2,3,4};
        try{
        System.out.println(arr[6]);
        int result=a/b;
        System.out.println(result);

        }catch(ArithmeticException e){
          System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("not found array element");
        }catch(Exception e){
            System.out.println("default ");
        }
      
    }
*/
}
