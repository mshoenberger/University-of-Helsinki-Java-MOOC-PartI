public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        
        int i=0;
        while(i<amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
                
    }

    public static void printWhitespaces(int amount) {
        int i=0;
        while(i<amount){
            System.out.print(" ");
            i++;
        }
        
    }

    public static void printTriangle(int size) {
        int i= 0;
        int currentStarAmount = 1;
        int currentSpaceAmount = size - 1;
        while(i<size){
            printWhitespaces(currentSpaceAmount);
            printStars(currentStarAmount);
            currentStarAmount++;
            currentSpaceAmount--;
            i++;
        }
        
        
    }

    public static void xmasTree(int height) {
        int i = 0;
        int currentStarAmount = 1;
        int currentSpaceAmount = height-1;
        int baseHeight = 0;
        
        while(i<height){
            printWhitespaces(currentSpaceAmount);
            printStars(currentStarAmount);
            currentStarAmount += 2;
            currentSpaceAmount--;
            i++;
        }
        while(baseHeight <2){
            printWhitespaces(height-2);
            printStars(3);
            baseHeight++;
        }
        
        
        
        
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(20);
    }
}
