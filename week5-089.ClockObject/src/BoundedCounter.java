/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class BoundedCounter {
    private int counterValue;
    private int upperLimit;
    
    
    public BoundedCounter(int upperLimit){
        this.counterValue = 0;
        this.upperLimit = upperLimit;
        
    }
    
    public void next(){
        if(this.counterValue<upperLimit){
            this.counterValue++;
        }else{
            this.counterValue = 0;
        }

    }
    
    public String toString(){
        if(this.counterValue<10){
            return "0"+this.counterValue;
        }else{
            return ""+this.counterValue;
        }
    }
    
    public int getValue(){
        return counterValue;
        
    }
    
    public void setValue(int userDefine){
        if(!(userDefine <0 || userDefine> this.upperLimit)){
            this.counterValue = userDefine;
        }
    }
    
    
}
