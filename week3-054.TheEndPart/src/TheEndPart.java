import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String userWord = reader.nextLine();
        System.out.println("Length of the next part: ");
        int wordLength = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + userWord.substring(userWord.length()-wordLength));
        
        
        
    }
}
