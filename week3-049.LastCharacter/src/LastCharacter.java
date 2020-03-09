import java.util.Scanner;


public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = reader.nextLine();
       // System.out.println("Last character: " + lastCharacter(userName));
            
    }
    
    public static char lastCharacter(String userName){
        
        char finalChar = userName.charAt(userName.length()-1);
        return finalChar;
        
    }
    
    
}
