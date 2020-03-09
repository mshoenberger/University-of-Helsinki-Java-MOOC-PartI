
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int userFirst = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int userLast = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = userFirst;
        while(i <= userLast){
            
            sum = sum + i; 
            i++;
        }
        System.out.println("The sum is " + sum);
    }
    
}
