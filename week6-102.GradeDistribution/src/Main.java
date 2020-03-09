import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ExamHolders scores = new ExamHolders();
        ScorePrinter print = new ScorePrinter();
        
        System.out.println("Type exam scores, -1 to completes:");
        scores.scoreBuilder(reader);
                
        print.printScores(scores.gradeAssign());
        print.printAcceptance(scores.pass, scores.noPass);
        
        
        
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
