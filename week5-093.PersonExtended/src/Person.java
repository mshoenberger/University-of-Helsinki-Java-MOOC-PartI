import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name){
        int todayDay = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        this.name = name;
        this.birthday = new MyDate(todayDay, todayMonth, todayYear);
    }

    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    public int age(){
        int todayDay = Calendar.getInstance().get(Calendar.DATE);
        int todayMonth = Calendar.getInstance().get(Calendar.MONTH)+1;
        int todayYear = Calendar.getInstance().get(Calendar.YEAR);
        
        MyDate todayDate = new MyDate(todayDay, todayMonth, todayYear);
        return this.birthday.differenceInYears(todayDate);
        
    }
    
    public boolean olderThan(Person compared){
        if(this.birthday.earlier(compared.birthday)){
            
            return true;
        }
        return false;
    }
    
    
}
