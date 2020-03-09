import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private int numberHolder;
    private int index;
    
    public LotteryNumbers() {
        
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();
        
        while(this.numbers.size()<7){
            int numberHolder = random.nextInt(39)+1;
            boolean contains = numbers.contains(numberHolder);
            if(!contains){
                numbers.add(numberHolder);
            }
            
        }
        
    }
        
       
        
        
    
    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}
