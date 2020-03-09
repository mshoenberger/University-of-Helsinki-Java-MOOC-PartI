
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account firstAccount = new Account("Bill's Account", 100.00);
        firstAccount.deposit(20.00);
        System.out.println(firstAccount);
        
        
    }

}
