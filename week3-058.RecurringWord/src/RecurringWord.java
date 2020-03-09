
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String userWord = reader.nextLine();
            if(words.contains(userWord)){
                System.out.println("You gave the word "+ userWord + " twice");
                break;
            }else{
                words.add(userWord);    
            }
            
            
            
            
            
        }
        
    }
}
