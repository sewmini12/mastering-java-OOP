import java.util.Scanner;
public class Vehicle {
    String brand;
    double maxSpeed;

    public Vehicle(String brand,double maxSpeed){
         this.brand=brand;
         this.maxSpeed=maxSpeed;
    }
    void displayInfo(){
        System.out.println(brand);
        System.out.println(maxSpeed);
    }
    double calculateTravelTime(double distance){
        double time =distance/maxSpeed;
        return time;
    }
}
class Car extends Vehicle{
    int passengers;
    Car(String brand,double maxSpeed,int passengers){
        super(brand,maxSpeed);
        this.passengers=passengers;
    }
    double calculateTravelTime(double distance){
        double time=(distance / maxSpeed) * 1.10;
        return time;
    }
}
class Bike extends Vehicle{
    Bike(String brand, double maxSpeed){
    super(brand, maxSpeed);
}

    double calculateTravelTime(double distance){
        double time=(distance / maxSpeed) * 0.95;
        return time;
    }
}
class Main{
    public static void main(String[] args) {
        Car c1=new Car("Toyota",120,4);
        Bike b1=new Bike("Honda",80);
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter vehicle type");
        String type=sc.next();
            Vehicle v;
        if(type.equalsIgnoreCase("car")){
          v = c1;
        } else {
          v = b1;
        }
        System.out.println("enter distance");
        double distance=sc.nextDouble();   
        
        double time = v.calculateTravelTime(distance);
        System.out.println("Travel time: " + time);
    }
}