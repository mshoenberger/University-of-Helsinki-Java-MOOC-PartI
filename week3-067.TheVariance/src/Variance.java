import java.util.ArrayList;

public class Variance {
    
    
    public static int sum(ArrayList<Integer> list) {
        
        int sum = 0;
        
        for(int i = 0; i< list.size(); i++){
            sum = sum + list.get(i);
        }
        
        
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        
        double average =  (Double.valueOf(sum(list)) / list.size()); 
        
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        
        double avg = average(list);
        double denominator = list.size()-1;
        
       double x = 0;
       int i = 0;
       while(i < list.size()){
           Double addValue = Math.pow(list.get(i)-avg, 2);
           
           x = x + addValue;
           i++;
       }
       
      
       Double variance = x/denominator;
        
        
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
