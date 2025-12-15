public class Upcasting {
    public static void main(String[] args) {
        //normal object creating
        Animal a1=new Animal();
        Cat c1=new Cat();
        Dog d1=new Dog();
        
        a1.makeSound(); //some general animal sound
        c1.makeSound();//meow
        d1.makeSound();//woof

       //upcasting
        Animal a2=new Dog();
        Animal a3=new Cat();

        a2.makeSound(); //woof
        //can't talk dog's unique methods a2.fetch(jesika);

        a3.makeSound(); //meow
        //can't talk a3.scratch(raw);

        //downcating
        Dog d2=(Dog) a2;//woof
        Cat c2=(Cat) a3;//meow

        d2.makeSound();
        d2.fetch("jesika");
        
        c2.makeSound();
        c2.scratch("jenny");

    }
}
class Animal{
    String name;
    public void makeSound(){
        System.out.println("some general animal sound");
    }
}
class Dog extends Animal{
    @Override
    public void  makeSound(){
       System.out.println("woof");
    }
    public void fetch(String name){
          System.out.println(name +"is fetching the ball");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
       System.out.println("meow");
    }
    public void scratch(String name){
       System.out.println(name+" is scratching");
    }
}