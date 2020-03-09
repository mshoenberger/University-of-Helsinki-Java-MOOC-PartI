/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
public class Product {
    private String productName;
    private double priceAtStart;
    private int amountToStart;
    
    public Product(String Name, double price, int amount){
        this.productName= Name;
        this.priceAtStart = price;
        this.amountToStart = amount;
    }
    
    public void printProduct(){
        System.out.println(productName +", price " + priceAtStart +", amount " + amountToStart);
    }
    
}
