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
// The Painting class stores information of a classic painting
//   including the century it was painted
public class ClassicPainting extends Painting {
    
    // Do not modify or add the instance variables
    // Assume century can only be one of these strings: 14th, 15th, 16th, 17th, 18th, 19th, 20th, 21st
    private String centuryPainted;
    
    // CW2 Lab Group Tue 11 Question 3
    // Complete the constructor of the class ClassicPainting
    // It initializes all its instance variables    
    public ClassicPainting(String title, String artist, double price, String centuryPainted) {
        super(title, artist,price);
        this.centuryPainted = centuryPainted;	
    }
    
    // CW2 Lab Group Tue 11 Question 4
    // Complete the method olderThan
    // It returns true if and only if this classic painting is painted in the earlier century
    //     than that classic painting
    public boolean olderThan(ClassicPainting that) {
	int thisCen = Integer.parseInt(this.centuryPainted.substring(0,2));
        int thatCen = Integer.parseInt(that.centuryPainted.substring(0,2));
        
        if (thisCen < thatCen) {
            return true;
        } else {
            return false;
        }	
    }
    
    public static void main(String[] args) {
        ClassicPainting monalisa = new ClassicPainting("Monalisa", "Leonardo Da Vinci", 860.0, "16th");
        ClassicPainting starryNight = new ClassicPainting("The Starry Night", "Vincent van Gogh", 100.0, "19th");
        System.out.println(monalisa);
        System.out.println(starryNight);
        System.out.println(monalisa.olderThan(starryNight));  // true
        System.out.println(starryNight.olderThan(monalisa));  // false
        
        // add your own test cases :
        
        
        
    }
    
}
