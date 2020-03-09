import java.util.Scanner;

public class Palindromi {

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
    
    
    public static boolean palindrome(String text) {
        
        String reversedText = reverse(text);
        int i = 0;
        boolean isDifferent = false;
        while(i<text.length()){
            if(text.charAt(i) != reversedText.charAt(i)){
                return isDifferent;
                
            }
            i++;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
