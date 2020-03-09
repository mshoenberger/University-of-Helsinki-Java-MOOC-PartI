
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int areaUnit;
    

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.areaUnit = this.pricePerSquareMeter * this.squareMeters;
        
    }
    
    public boolean larger(Apartment compareApartment){
        if(this.squareMeters > compareApartment.squareMeters){
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment otherApartment){
       
        return Math.abs(this.areaUnit - otherApartment.areaUnit);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        if(this.areaUnit > otherApartment.areaUnit){
            return true;
        }
        return false;
    }
    
    
}
