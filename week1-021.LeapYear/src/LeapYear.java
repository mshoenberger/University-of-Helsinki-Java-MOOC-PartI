
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        int userYear = Integer.parseInt(reader.nextLine());
        
        boolean needAdvanceAnalysis = false;
        
        if(userYear%100==0){
            needAdvanceAnalysis = true;
        }else if(userYear%4==0){
            System.out.println("The year is a leap year.");
        }else{
            System.out.println("The year is not a leap year.");
        }
        
        
        
        if(needAdvanceAnalysis==true){
            if(userYear%400==0)
            {
                System.out.println("The year is a leap year.");
            }else{
                System.out.println("The year is not a leap year.");
            }
        }
            
        }
        
        
        
        
}

