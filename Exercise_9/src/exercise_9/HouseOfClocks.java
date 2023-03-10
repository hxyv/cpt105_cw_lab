/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_9;

/**
 *
 * @author xingyu hu
 */
public class HouseOfClocks {
    
    // A house of clocks stores all its clocks in an array of Clock objects
    private Clock[] clocksCollection;
    // the number of clocks
    private int numClocks;
    
    
    // CW1 9.1
    // Creates a house of clocks which has a collection of numClocks clocks.
    // numClocks must be between 1 and 24, inclusive,
    //     and throws IllegalArgumentException otherwise.
    // The first clock must start at 00:00, the second clock at 01:00, and so on.
    // For example,
    //     if numClocks = 3, it stores 3 clocks starting at 00:00, 01:00, and 02:00.
    //     if numClocks = 24, it stores 24 clocks where the last one at index 23 starts at 23:00.
    public HouseOfClocks(int numClocks) {
	if (numClocks < 1 || numClocks > 24) {
            throw new IllegalArgumentException();
        }
        
        this.numClocks = numClocks;
        this. clocksCollection = new Clock[numClocks];
        
        for (int i = 0; i < clocksCollection.length; i++) {
            Clock clock = new Clock(i, 0);
            clocksCollection[i] = clock;
        }

    }
       
    // CW1 9.2
    // Calls the tick method of the clock in the collection at index clockIndex.
    // Throw an IndexOutOfBoundsException if the clockIndex is not valid,
    //     and use the message "No clock stored at index " followed by the invalid index.
    public void tick(int clockIndex) {
	if (clockIndex >= 0 && clockIndex < this.numClocks) {
            clocksCollection[clockIndex].tick();
        } else {
            throw new IndexOutOfBoundsException("No clock stored at index " + clockIndex);
        }	
    }
    
    
    // Prints the time of all the clocks in the collection
    // Do NOT modify this method
    public void printClocks() {
        for (int i = 0; i < numClocks; i++) {
            System.out.println(clocksCollection[i]);
        }
    }
    
    
	// Test Client
    public static void main(String[] args) {
        
        // Test Case Constructor #1
        HouseOfClocks hc1 = new HouseOfClocks(3);
        hc1.printClocks();
        
        // Test Case Constructor #2
        try {
            HouseOfClocks hc2 = new HouseOfClocks(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }
        
        // Test Case Tick #1
        hc1.tick(0);
        hc1.tick(0);
        hc1.tick(3);
        hc1.printClocks();
        
        // Test Case Tick #2
        try {
            hc1.tick(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
