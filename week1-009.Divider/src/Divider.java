
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number");
        int number2 = Integer.parseInt(reader.nextLine());
        
        double finalNumber = (double)number1/number2;
        String finalString = "Division: " + number1 + " / " + number2 + " = " + finalNumber; 
        System.out.println(finalString);
        
        
        
    }
}
