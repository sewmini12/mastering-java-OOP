import java.lang.Enum;
public class Enums {
    public static void main(String[] args) {
        Colors c1 = Colors.RED;
        System.out.println(c1);

    switch(c1){
        case RED:
            System.out.println("red term");
            break;

         case BLUE:
            System.out.println("blue term");
            break;
        
        default:
            System.out.println("nothing");    
    }
    System.out.println(Enum.values());
    System.out.println(Enum.valueOf(Colors, RED));
    }
}
enum Colors{
    RED,GREEN,BLUE,WHITE;
}
