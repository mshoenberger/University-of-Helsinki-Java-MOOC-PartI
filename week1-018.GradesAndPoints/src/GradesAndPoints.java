
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int userPoints = Integer.parseInt(reader.nextLine());
        int grade = 0;
        
        if(userPoints <30){
            System.out.println("Grade: failed");
        } else if(userPoints >=30 && userPoints <35){
            grade = 1;
        }else if (userPoints >=35 && userPoints <40){
            grade = 2;
        }else if (userPoints >= 40 && userPoints < 45){
            grade = 3;
        }else if (userPoints >= 45 && userPoints < 50){
            grade = 4;
        } else if(userPoints >= 50 && userPoints <60){
            grade = 5;
        }
        
        if(grade != 0){
            System.out.println("Grade: " + grade);
        }
   }
}
