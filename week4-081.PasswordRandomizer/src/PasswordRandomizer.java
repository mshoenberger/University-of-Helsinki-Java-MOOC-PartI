import java.util.Random;

public class PasswordRandomizer {
    private int passwordSize;
    private Random random = new Random();
    private String alphabet;
    
    public PasswordRandomizer(int length) {
        this.passwordSize = length;
        this.alphabet = "abcdefghijklmnopqrstuvwxyz";
    } 

    public String createPassword() {
        int i = 0;
        String randomizedPassword = "";
        char addChar;
        while(i<this.passwordSize){
            int randomNum = random.nextInt(26);
            addChar = alphabet.charAt(randomNum);
            randomizedPassword = randomizedPassword +  addChar;
            i++;
        }
        return randomizedPassword;
    }
}
