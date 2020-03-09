import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = reader.nextLine();
        System.out.println("First character: " + firstCharacter(userName));
        
    }
    
    
    public static char firstCharacter(String userName){
        
        char firstCharacter = userName.charAt(0);
        return firstCharacter;
        
        
    }
}
