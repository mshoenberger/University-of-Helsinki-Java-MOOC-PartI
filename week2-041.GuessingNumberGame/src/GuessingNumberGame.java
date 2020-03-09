
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.println("Guess a number: ");
        int userGuess = Integer.parseInt(reader.nextLine());
        int guessNumber = 1;
        
        while(true){
           
            if(userGuess > numberDrawn){
                System.out.println("The number is lesser, guesses made: "+ guessNumber);
            }else if(userGuess < numberDrawn){
                System.out.println("The number is greater, guesses made: "+ guessNumber);
            }else if(userGuess == numberDrawn){
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
             System.out.println("Guess a number: ");
             userGuess = Integer.parseInt(reader.nextLine());
             guessNumber++;
        }   
        
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
