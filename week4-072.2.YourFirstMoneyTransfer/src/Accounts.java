
public class Accounts {

    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account",0);
        
        matt.withdrawal(100.00);
        myAccount.deposit(100.00);
        System.out.println(matt);
        System.out.println(myAccount);
        
        
    }

}
