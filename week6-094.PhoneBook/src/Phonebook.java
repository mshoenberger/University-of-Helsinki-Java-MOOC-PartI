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

public class Phonebook {
    private  ArrayList<Person> bookPeople;

    public Phonebook(){
        this.bookPeople = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        this.bookPeople.add(new Person(name, number));
    }    
    
    public void printAll(){
        for(Person index: bookPeople){
            System.out.println(index);
        }
    }
    
    public String searchNumber(String name){
        
        for(Person index:bookPeople){
            if(index.getName() == name){
                return index.getNumber();
            }
        }
        return "number not known";
        
              
        
    }
    
    
}
