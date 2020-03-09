public class Printing {

    public static void printStars(int amount) {
        
        int i=0;
        while(i<amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
                
    }

    public static void printSquare(int sideSize) {
                
        int row = 1;
        
        while(row<=sideSize){
            printStars(sideSize);
            row++;
        }
            
    }



    public static void printRectangle(int width, int height) {
        
        int row = 1;
        
        while(row <= height){
            printStars(width);
            row++;
        }
        
        
    }

    public static void printTriangle(int size) {
        int row = 1;
        int currentStarValue = 1;
        while(row<= size){
            printStars(currentStarValue);
            currentStarValue++;
            row++;
        }
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
