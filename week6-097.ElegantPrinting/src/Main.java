
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String reverse ="";
        
        for(int i = 0; i < array.length; i++){
            if(i< array.length -1){
                reverse = reverse + array[i] + ",";
            }else{
                reverse = reverse + array[i];
            }
            
        }
        System.out.println(reverse);        
    }
}
