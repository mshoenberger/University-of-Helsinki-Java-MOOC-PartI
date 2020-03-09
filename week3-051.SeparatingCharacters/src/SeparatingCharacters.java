
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = reader.nextLine();
        
        int i = 0;
        int userLength = userName.length();
        while(i < userLength){
            System.out.println((i+1) + ". character: " + userName.charAt(i));
            i++;
        }
        
        
    }
}
