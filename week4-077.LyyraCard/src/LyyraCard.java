/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class LyyraCard {
    private double balance;
    private final double gourmet = 4.00;
    private final double economical = 2.50;
    
    public LyyraCard(double startingBalance){
        this.balance = startingBalance;
        
    }
    
    public String toString(){
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical(){
        if(!(this.balance < 2.50)){
            this.balance -= 2.50; 
            
        }
    }    
    
    public void payGourmet(){
        if(!(this.balance < 4.00)){
            this.balance -= 4.00;
        }
    }
    
    public void loadMoney(double amount){
        
        if(!(amount < 0)){
            
        
            if((this.balance + amount) >  150){
                this.balance = 150;
            }else{
                this.balance += amount;
            }   
        }
    }    
    
    
}
