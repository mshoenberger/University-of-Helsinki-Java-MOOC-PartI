import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        
        while(true){
            int rolled = random.nextInt(numberOfSides+1);
            if(rolled !=0){
                return rolled;
            }
        }

           
   }
}
