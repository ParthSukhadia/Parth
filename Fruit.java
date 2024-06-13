import java.util.Scanner;

public class Fruit {
     
   public static void main(String[] args) {
    
    Scanner Scanner = new Scanner(System.in);

    System.out.println(" Choose the Colour Red,Yellow,Orange,Green");
    String Colour = Scanner.next();

    String Fruit =  " ";

    switch (Colour ) {
        case "Red":
        Fruit = "Apple";
            break;
        case "Yellow" :
            break;
        case "Orange":
        Fruit = "Orange";
         break;
         case "Green":
         Fruit = "Watermellon";
         break;
        default:
        Fruit = "Grapes";
          break;
    }
          System.out.println("The Fruit is" + " " + Fruit );
          Scanner.close();
          
         
          

   } 
}
