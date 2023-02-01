/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

/**
 *
 * @author xingyu hu
 */
public class Painting {
     // Do not modify or add the instance variables
    private String title;    
    private String artist;
    private double price; // in million dollars

    // Do not modify this constructor
    // It initializes the three instance variables
    public Painting(String title, String artist, double price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    // Do not modify this method
    // It returns the string representation of a Painting object
    @Override
    public String toString() {
        return "Painting " + title + " painted by " + artist + ", USD " + price + " millions";
    }
    
    // CW2 Lab Group Tue 11 Question 1
    // Complete the method quiteExpensive
    // It returns the String "Quite expensive" if the price of the painting
    //     is between 50 million to 100 million dollars, inclusive
    // Otherwise, returns the String "Not quite expensive"
    public String quiteExpensive() {
	if(this.price >= 50 && this.price <= 100) {
            return "Quite expensive";
        } else {
            return "Not quite expensive";
        }	
    }

    // CW2 Lab Group Tue 11 Question 2
    // Complete the method samePainting
    // It returns true if and only if both this and other paintings
    //     have the same title and artist name
    public boolean samePainting(Painting other) {
	if (this.artist == other.artist && this.title == other.title) {
            return true;
        } else {
            return false;
        }	
    }

    // Test Client
    public static void main(String[] args) {
        
        Painting starryNight = new Painting("The Starry Night", "Vincent van Gogh", 100.0);
        System.out.println(starryNight);
        Painting monalisa = new Painting("Monalisa", "Leonardo Da Vinci", 860.0);
        System.out.println(monalisa);                
        
        System.out.println(starryNight.quiteExpensive());  // Quite expensive
        System.out.println(monalisa.quiteExpensive());     // Not quite expensive
        
        Painting unknown = new Painting("Monalisa", "Leonardo Da Vinci", 100.0);
        System.out.println(monalisa.samePainting(starryNight));  // false
        System.out.println(unknown.samePainting(monalisa));      // true
        
        // add your own test cases :
        
        
        
        
    }
}
