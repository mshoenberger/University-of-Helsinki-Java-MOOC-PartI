
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int userNumber = Integer.parseInt(reader.nextLine());
        
        if( userNumber % 2 != 0){
            System.out.println("Number " + userNumber + " is odd.");
        }
        if( userNumber % 2 == 0){
            System.out.println("Number " + userNumber + " is even.");
        }
        
        

    }
}
