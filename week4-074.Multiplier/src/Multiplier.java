/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class Multiplier {
    private int number1;
    
    public Multiplier(int number){
        this.number1 = number;
    }
    
    public int multiply(int otherNumber){
        
        int multiplication = number1 * otherNumber;
        
        return multiplication;
    }
    
    
}
