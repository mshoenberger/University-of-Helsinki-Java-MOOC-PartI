
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        
        int sumEuro = this.euros + added.euros;
        int sumCents = this.cents + added.cents;
        
        if(sumCents > 99){
            sumEuro += sumCents/100;
            sumCents %= 100;
            
        }
        
        Money sum = new Money(sumEuro, sumCents);
        return sum;
        
    }
    
    public boolean less(Money compared){
        int eurosToCents = this.euros * 100;
        int eurosToCentsCompared = compared.euros * 100;
        
        if(eurosToCents + this.cents < eurosToCentsCompared + compared.cents){
            return true;
        }
        
        return false;
        
    }
    
    public Money minus(Money decremeted){
        int minusEuros = this.euros - decremeted.euros;
        int minusCents = this.cents - decremeted.cents;
        
        if(minusCents < 0){
            minusEuros--;
            minusCents = 100 + minusCents;
        }
        
               
        if(minusEuros >= 0){
            Money returnSubtract = new Money(minusEuros, minusCents);
            return returnSubtract;
        }else{
            Money returnSubtract = new Money(0, 0);
            return returnSubtract;
        }
        
        
        
    }
    

}
