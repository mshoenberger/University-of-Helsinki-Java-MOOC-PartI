import java.util.ArrayList;

public class Team {
    
    private String teamName;
    private ArrayList<Player> players;
    private int teamSize;
    
    public Team(String name){
        this.teamName = name;
        this.players = new ArrayList<Player>();
        this.teamSize = 0;
        
    }
    
    public String getName(){
        return this.teamName;
    }
    
    public void addPlayer(Player person){
        
        this.players.add(person);
        
        
    }
    
    public void printPlayers(){
        for(Player index:players){
            System.out.println(index);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.teamSize = maxSize;
    }
    
    public int size(){
        if(this.teamSize >0 && (this.players.size() > this.teamSize)){
            return this.teamSize;
        }
        return this.players.size();
        
    }
    
    public int goals(){
        int sum = 0;
        for(Player index: this.players){
            sum += index.goals();
        }
        return sum;
    }
    
    
    
    
}
