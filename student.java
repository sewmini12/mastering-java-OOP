
/*
 * Create a Student class with name, rollNo, and marks as attributes.
 *  Write a method to calculate the grade based on the marks and display the grade. 
 * Create multiple instances of the Student class and print their grades.
 */

public class student {
    String name;
    int rollNo;
    int marks;

    public student(String name,int rollNo,int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    public void grade(){
        System.out.println(name);
        System.out.println(rollNo);
        if(marks>=75)
            System.out.println("A");
        else if(marks>65)
            System.out.println("B");
        else if(marks>55)
            System.out.println("C");
        else if(marks>45)
            System.out.println("D");
        else
            System.out.println("F");
    }

    public static void main(String[]args){

    student stu1=new student("kamal",1,38);
    student stu2=new student("sewmini",8,100);
    student stu3=new student("sadali",9,69);

    stu1.grade();
    stu2.grade();
    stu3.grade();

    }

   
}
