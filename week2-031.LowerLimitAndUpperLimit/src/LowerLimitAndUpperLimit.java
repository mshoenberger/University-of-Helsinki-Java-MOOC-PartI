
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        
        if(firstNumber > secondNumber){
            System.out.println("");
        }else{
            while(firstNumber <= secondNumber){
                System.out.println(firstNumber);
                firstNumber++;
            }
        }
        
        

    }
}
