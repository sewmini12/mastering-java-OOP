public class Inheritance {
    protected int id;
    protected String name;
    protected double salary;

    public Inheritance(int id,String name,double salary){
         this.id=id;
         this.name=name;
         this.salary=salary;
    }

    public void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}
class Manager extends Inheritance{
    String department;

    Manager(int id,String name,double salary,String department){
        super(id,name,salary);
        this.department=department;
    }
    void displayManager(){
        displayDetails();
        System.out.println(department);
    }
}
class Developer extends Inheritance{
    String progLang;
    Developer(int id,String name,double salary,String progLang){
        super(id,name,salary);
        this.progLang=progLang;
    }

    void displayManager(){
        displayDetails();
        System.out.println(progLang);
    }
}
class Main{
    public static void main(String[] args) {
         Manager m1=new Manager(101,"sewmii",7000,"data eng");
         Developer d1=new Developer(102,"kavindya",3000,"UI/UX");
         Developer d2=new Developer(103,"sadali",5400,"HR");

         m1.displayDetails();
         d1.displayDetails();
         d2.displayDetails();
    }
   
}