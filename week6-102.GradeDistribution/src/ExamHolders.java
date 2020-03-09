/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ExamHolders {
    
    int pass;
    int noPass;
    
    private ArrayList<Integer> examScores;
    
    public ExamHolders(){
        this.examScores = new ArrayList<Integer>();
        this.pass = 0;
        this.noPass = 0;
    }
    
    public void scoreBuilder(Scanner userInput){
        while(true){
            int userNumber = Integer.parseInt(userInput.nextLine());
            if(userNumber == -1){
                break;
            }else if(userNumber >60 || userNumber < 0){
                                
            }else{
                this.examScores.add(userNumber);
            }
        }
                
    }
    
    public ArrayList<Integer> gradeAssign(){
        ArrayList<Integer> grade = new ArrayList<Integer>();
        
        for(int index: examScores){
            if(index <30){
                grade.add(0);
                this.noPass++;
            }else if(index <35){
                grade.add(1);
                this.pass++;
            }else if(index < 40){
                grade.add(2);
                this.pass++;
            }else if(index < 45){
                grade.add(3);
                this.pass++;
            }else if(index < 50){
                grade.add(4);
                this.pass++;
            }else{
                grade.add(5);
                this.pass++;
            }
        }
        return grade;
        
    }
    
    
    
}
