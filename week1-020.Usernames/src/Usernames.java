
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your username: ");
        String userUsername = reader.nextLine();
        System.out.println("Type your password: ");
        String userPassword = reader.nextLine();
        
        if((userUsername.equals("alex") && userPassword.equals("mightyducks")) || (userUsername.equals("emily") && userPassword.equals("cat"))){
            System.out.println("You are now logged into the system!");
        }else{
            System.out.println("Your username or password was invalid!");
        }
        
        
    }
}
