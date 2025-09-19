
/*
 * Create a class Biggest that contains a single-dimensional
 *  array as a data member and a method display() to find and
 *  display the largest element of the array
 */
public class biggest {
    public static void main (String[] args){
         int[] arr = {1,2,3,4,5};
         display(arr);

    }

    public static void display(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    System.out.println(max);
    }
}
