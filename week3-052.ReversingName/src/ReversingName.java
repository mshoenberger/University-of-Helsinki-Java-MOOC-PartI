import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = reader.nextLine();
        int nameLength = userName.length();
        
        System.out.print("In reverse order: ");
        int i = 0;
        while( i < nameLength){
            System.out.print(userName.charAt((nameLength - i-1))); 
            i++;
        }
        
        
    }
}
