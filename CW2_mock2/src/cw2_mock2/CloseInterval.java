/*
 * CW2 Lab Group Mon 11
 */
package cw2_mock2;
// The CloseInterval class represents a one-dimensional interval [low, high],
//     that contains both endpoints low and high.
public class CloseInterval {
    
    // Do not modify or add the instance variables
    private double low;
    private double high;

    // Do not modify this constructor
    // It initializes the two instance variables
    public CloseInterval(double low, double high) {        
        this.low = low;
        this.high = high;
    }    
    
    // Do not modify this method
    // It returns the string representation of a CloseInterval object
    // in the format "[low, high]"
    @Override
    public String toString() {
        return "[" + low + ", " + high + "]";
    }
    
    
    // CW2 Lab Group Mon 11 Question 1
    // Complete the method contains
    // It returns true iff the number x is in the close-interval
    public boolean contains(double x) {
	boolean bool = false;	
	if (x >= this.low && x <= this.high){
            bool = true;
        }	
	return bool;	
    }
    

    // CW2 Lab Group Mon 11 Question 2
    // Complete the method overlaps
    // Returns true iff this close-interval overlaps with the other close-interval
    public boolean overlaps(CloseInterval other) {
	boolean bool = true;
        if (this.low >= other.high || this.high <= other.low) {
            bool = false;
        }
	return bool;
    }
    
    public double getLow() {
        return low;
    }
    public double getHigh() {
        return high;
    }
    
    
    // Test Client
    public static void main(String[] args) {
        
        CloseInterval interval1 = new CloseInterval(2.0, 5.0);
        System.out.println(interval1);               // [2.0, 5.0]
        
        System.out.println(interval1.contains(3.0));   // true
        System.out.println(interval1.contains(10.0));  // false
        
        CloseInterval interval2 = new CloseInterval(3.0, 6.0);
        System.out.println(interval1.overlaps(interval2));      // true
        CloseInterval interval3 = new CloseInterval(10.0, 11.5);
        System.out.println(interval1.overlaps(interval3));      // false
        
    }
}
