import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int userInput = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        
        for(int i=1; i<=userInput; i++){
            factorial = factorial * i;
            
        }
        System.out.println("Factorial is "+factorial);
    }
        
        
        
}
