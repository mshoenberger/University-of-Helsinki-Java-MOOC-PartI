public class Reformatory {
    
    private int counter;
    
    public int weight(Person person) {
        counter++;
        return person.getWeight();
    }
        
    public void feed(Person person){
        int weightBeforeMeasure = this.weight(person);
        person.setWeight(weightBeforeMeasure +1);
    }
    
    public int totalWeightsMeasured(){
        
        int timesMeasured = counter;
        return timesMeasured;
    }
    
}
