/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neptrocity
 */
import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> libInventory;
    
    public Library(){
        this.libInventory = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook){
        this.libInventory.add(newBook);
    }
    
    public void printBooks(){
        for(Book index: libInventory){
            System.out.println(index);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> foundItems = new ArrayList<Book>();
        
        for(Book index:libInventory){
            if(StringUtils.included(index.title(), title)){
                foundItems.add(index);
            }
        }
        
        return foundItems;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> foundItems = new ArrayList<Book>();
        
        for(Book index:libInventory){
            if(StringUtils.included(index.publisher(), publisher)){
                foundItems.add(index);
            }
        }
        
        return foundItems;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> foundItems = new ArrayList<Book>();
        
        for(Book index:libInventory){
            if(index.year() == year){
                foundItems.add(index);
            }
        }
        return foundItems;
        
    }
}