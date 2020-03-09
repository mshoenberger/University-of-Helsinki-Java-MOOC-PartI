/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class Player {
    
    private String playerName;
    private int playerGoals;
    
    public Player(String name, int goals){
        this.playerName = name;
        this.playerGoals = goals;
    }
    
    public Player(String name){
        this.playerName = name;
        this.playerGoals = 0;
    }
    
    
    public String getName(){
        return this.playerName;
    }
    
    public int goals(){
        return this.playerGoals;
    }
    
    public String toString(){
        return this.getName() + ", goals " + this.goals();
    }
    
}
