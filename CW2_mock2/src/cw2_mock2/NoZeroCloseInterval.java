/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2_mock2;
/*
 * CW2 Lab Group Mon 11
 */

// The NonZeroCloseInterval class represents a one-dimensional interval [low, high],
//     that contains both endpoints low and high,
//     and an information whether 0 is not contained in the interval.
public class NoZeroCloseInterval extends CloseInterval {
    
    // Do not modify or add the instance variables
    // The instance variable noZero is true iff zero is not in the interval
    private boolean noZero;


    // CW2 Lab Group Mon 11 Question 3
    // Complete the constructor of the class NoZeroCloseInterval
    // It initializes all its instance variables    
    public NoZeroCloseInterval(double low, double high) {
	super(low,high);
    }


    // CW2 Lab Group Mon 11 Question 4
    // Complete the toString() method so that
    // it returns the string representation of a NonZeroCloseInterval object
    // in the format "[low, high]" followed by either "contains zero"
    // or "does not contain zero" depending whether the interval contains zero
    @Override
    public String toString() {
	if (getLow() > 0 || getHigh() < 0) {
            noZero = true;
            return super.toString() + " does not contain zero";
        }	
        else {
            noZero = false;
            return super.toString() + " contains zero";
        }	
		
    }
    
    // Test Client
    public static void main(String[] args) {
        
        NoZeroCloseInterval nzinterval1 = new NoZeroCloseInterval(-2.0, 5.0);
        System.out.println(nzinterval1);    // [-2.0, 5.0] contains zero
        
        NoZeroCloseInterval nzinterval2 = new NoZeroCloseInterval(2.0, 5.0);
        System.out.println(nzinterval2);    // [2.0, 5.0] does not contain zero
        
        System.out.println("  doge  ");
        System.out.println("  / \\  ");
        System.out.println(" /   \\  ");
        System.out.println("/     \\  ");
        System.out.println("--| |--");
        System.out.println("-------");
    
        
    }
    
}
