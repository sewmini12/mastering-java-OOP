/* Create a class Employee with overloaded constructors to initialize employee
 details based on different combinations of arguments. Ensure the constructors
  support the creation of objects in various ways.
name,id,department
print them if id!=0 and departmet!=null
*/

class Employee{
       String name;
       String department;
       int id; 

public Employee(String name,String department ,int id){
       this.name=name;
       this.department=department;
       this.id=id;
}
public void displayDetails(){ 
System.out.println(name);
if(id!=0){
       System.out.println(id);
}
if(department!=null){
       System.out.println(department);
}
}
public static void main (String[]args){
       Employee kamal=new Employee("kamal" ,"IT" , 111);
       kamal.displayDetails();
}
}
