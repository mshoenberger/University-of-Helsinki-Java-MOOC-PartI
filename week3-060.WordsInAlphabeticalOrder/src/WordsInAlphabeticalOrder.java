
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while(true){
            System.out.println("Type a word: ");
            String userWord = reader.nextLine();
            if(userWord.isEmpty()){
                break;
            }else{
                words.add(userWord);
            }
            
        }
        
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for(String output: words){
            System.out.println(output);
        }
        
        // create here an ArrayList
    }
}
