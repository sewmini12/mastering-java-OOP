public class stud{
   int id;
   String name;
   int[] marks;

   stud(int id,String name,int[] marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
   }
   public double getTotal(){
        double total=marks[0]+marks[1]+marks[2]+marks[3];
        return total;  
   }
   public double getAverage(){
        double average=getTotal()/4;
        return average;
   }
   public char getGrade(){
        double average=getAverage();
        if(average >= 75) return 'A';
        else if (average >= 65) return 'B';
        else if (average >= 50) return 'C';
        else return 'F';
   }
   public void displayStudent(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(getTotal());
        System.out.println(getAverage());
        System.out.println(getGrade());
   }
   public static void main(String[] args){
        stud s1=new stud(302,"sewmini",new int[]{20,30,40,30});
        stud s2=new stud(203,"kaweesha",new int[]{40,50,60,30});
        stud s3=new stud(409,"dehami",new int[]{20,10,32,22});

            s1.displayStudent();
            s2.displayStudent();
            s3.displayStudent();
        
   } 
}
