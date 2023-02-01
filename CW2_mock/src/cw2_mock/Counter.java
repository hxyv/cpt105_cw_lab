/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2_mock;
/**
 *
 * @author xingyu hu
 */
public class Counter {
    
    // Do not modify or add the instance variables
    private int counterValue;

    // Do not modify this constructor
    // empty constructor
    public Counter() {
        counterValue = 0;
    }

    // Mock Lab Test Question 1
    // Complete the constructor of the class Counter
    // It initializes the counter value with an initial value
    public Counter(int initialValue) {
	this.counterValue = initialValue;	
    }

    // Mock Lab Test Question 2
    // Complete the method increment
    // It increments the counter value by one
    public void increment() {
	this.counterValue++;	
    }
    // Do not modify other methods
    // getter

    /**
     *
     * @return
     */
    public int getValue() {
        return counterValue;
    }

    // toString
    @Override
    public String toString() {
        return "Counter value: " + counterValue;
    }

    // test client
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment();
        counter.increment();
        System.out.println(counter);

        Counter counter1 = new Counter(0);
        counter1.increment();
        System.out.println(counter1);

        Counter counter2 = new Counter(5);
        counter2.increment();
        counter2.increment();
        System.out.println(counter2);
        counter2.increment();
        System.out.println(counter2);
        
        // add your own test cases
        
        
        
    }

}
