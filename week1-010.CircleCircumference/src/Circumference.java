
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        
        double circumference = 2.0 * Math.PI * radius;
        String finalString = "Circumference of the circle: " + circumference;
        
        System.out.println(finalString);
        

    }
}
