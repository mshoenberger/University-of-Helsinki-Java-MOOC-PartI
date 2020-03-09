import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String userName = reader.nextLine();
        
        while(true){
            int userLength = userName.length();    
            if(userLength >=3){
                int i=0;
                while(i <=2){
                    System.out.println((i+1) + ". character: " + firstThreeChars(userName, i));
                    i++;
                }
            }else{
                System.out.println("");
            }
            break;
        
        }

       
    }
    
    public static char firstThreeChars(String userName, int i){
        
       char currentChar = userName.charAt(i);
       return currentChar;
                
    }

}
