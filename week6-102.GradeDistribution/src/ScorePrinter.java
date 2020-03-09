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

public class ScorePrinter {
    
    public ScorePrinter(){
        
    }   
    
    
    public void printScores(ArrayList<Integer> gradeScores){
        int currentScoreLook = 5;
        System.out.println("Grade distribution");
        
        for(int i = 0; i < 6; i++){
            System.out.print(currentScoreLook + ":" );
                    
            for(int j = 0; j < gradeScores.size(); j++){
                if(currentScoreLook == gradeScores.get(j)){
                    System.out.print("*");
                }
                
            }
            System.out.println();
        
        currentScoreLook --;
            
        }
        
    }
    
    public void printAcceptance(int passed, int noPass){
        
        double acceptance = 100.0 * passed / (passed + noPass);
        
        System.out.println("Acceptance percentage: " + acceptance);
    }
    
    
    
}
