
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        
        int stringLength = text.length();
        int i = 0;
        String reverseText = "";
        while(i < stringLength){
            reverseText = reverseText + text.charAt(stringLength - i-1);
            i++;
        }
        
    
        return reverseText;
    }

   
    
    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
