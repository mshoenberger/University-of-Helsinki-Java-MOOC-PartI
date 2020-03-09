import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        String studentName;
        String studentID;
                
        while(true){
            System.out.println("name: ");
            studentName = reader.nextLine();
            
            if(studentName.isEmpty()){
                
                for(Student output:studentList){
                    System.out.println(output);
                }
                
                System.out.println("Give search term: ");
                String search = reader.nextLine();
                System.out.println("Result: ");
                
                for(Student lookUp:studentList){
                    if(lookUp.getName().contains(search)){
                        System.out.println(lookUp);
                    }
                    
                }
                
                break;
            
            }else{
                
                System.out.println("studentnumber: ");
                studentID = reader.nextLine();
                studentList.add(new Student(studentName, studentID));
               
            }
        }
        
        
        
        
        
        
    }
}
