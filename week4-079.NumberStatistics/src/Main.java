import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats =  new NumberStatistics();
        
        
        Scanner reader = new Scanner(System.in);
      
        while(true){
            System.out.println("Type numbers:");
            int userInput = Integer.parseInt(reader.nextLine());
            
            if(userInput == -1){
                break;
            }else{
                stats.addNumber(userInput);
            }
            if(userInput %2 ==0){
                evenStats.addNumber(userInput);
            }else{
                oddStats.addNumber(userInput);
            }
            
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());

    }
}
    