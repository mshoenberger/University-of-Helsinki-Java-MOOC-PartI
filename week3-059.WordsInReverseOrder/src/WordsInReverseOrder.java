import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> allWords = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String userWord = reader.nextLine();
            
            if(userWord.isEmpty()){
                Collections.reverse(allWords);
                System.out.println("You typed the following words: ");
                for(String output: allWords){
                    System.out.println(output);
                }
                
                break;
            }else{
                allWords.add(userWord);
            }
            
            
            
            
        }
        

        // create here an ArrayList
    }
}
