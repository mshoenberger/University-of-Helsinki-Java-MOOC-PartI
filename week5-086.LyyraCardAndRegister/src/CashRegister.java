
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private static final double economicalPrice = 2.50;
    private static final double gourmetPrice = 4.00;

    public CashRegister() {
       this.cashInRegister = 1000;
        // at start the register has 1000 euros 
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
       
        if(cashGiven >= economicalPrice){
            this.cashInRegister += economicalPrice;
            this.economicalSold++;
            return cashGiven - economicalPrice;
        }else{
            return cashGiven;
        }

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        if(cashGiven >= gourmetPrice){
            this.cashInRegister += gourmetPrice;
            this.gourmetSold++;
            return cashGiven - gourmetPrice;
        }else{
            return cashGiven;
        }
    }
    
    public boolean payEconomical(LyyraCard card){
        
        if(card.balance() >= economicalPrice){
            this.economicalSold++;
            card.pay(economicalPrice);
            return true;
        }else{
            return false;
        }
    }
    
    public boolean payGourmet(LyyraCard card){
        if(card.balance() >= gourmetPrice){
            this.gourmetSold++;
            card.pay(gourmetPrice);
            return true;
        }else{
            return false;
        }
    }
    
    public void loadMoneyToCard(LyyraCard card, double loadAmount){
        if(loadAmount >=0){
            this.cashInRegister += loadAmount;
            card.loadMoney(loadAmount);
        }
    }
    


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
