/*
 * Write a program to accept three numbers and 
 * find the largest of the three using method overloading.
 */
public class largest {
    int n1;
    int n2;
    int n3;

    public largest(int n1,int n2,int n3){
        this.n1=n1; 
        this.n2=n2;
        this.n3=n3;
 }
 public static void find(int n1,int n2,int n3 ){
    if(n1>n2){
        if(n1>n3){
            System.out.println(n1);
        }
        else{
            System.out.println(n3);
        }
    }
    else{
         if(n2>n3){
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }
 }
  public static void find(double n1,double n2,double n3 ){
    if(n1>n2){
        if(n1>n3){
            System.out.println(n1);
        }
        else{
            System.out.println(n3);
        }
    }
    else{
         if(n2>n3){
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }
 }
public static void main(String[]args){
    find(1,2,3);
    find(3.5,7.8,6.7);


}

}
