
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        int largestNumber = Math.max(number1, number2);
        String outputResult = "The bigger number of the two numbers given was: " + largestNumber;
        
        System.out.println(outputResult);
    }
}
