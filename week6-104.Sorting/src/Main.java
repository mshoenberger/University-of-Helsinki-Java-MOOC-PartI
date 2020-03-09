
public class Main {
    public static void main(String[] args) {
        // write testcode here
        
        
        
        
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 0; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int indexSmallest = 0;
        
        for(int i = 0; i < array.length; i++){
            if(smallest(array) == array[i]){
                indexSmallest = i;
            }
        }
        
        return indexSmallest;
        
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int indexSmallest = index;
       
        
        for(int i = index; i<array.length; i++){
            if(array[indexSmallest] > array[i]){
                indexSmallest = i;
            }
        }
        return indexSmallest;
        
    }
    
    public static void swap(int[] array, int index1, int index2){
        int saveValue = array[index1];
        
        array[index1] = array[index2];
        array[index2] = saveValue;
        
    }
    
    
    public static void sort(int[] array){
        
        for(int i = 0; i <array.length; i++){
            int smallIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallIndex);
        }
    }
    
    

}
