/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_8;

/**
 *
 * @author xingyu hu
 */
public class CuckooClock extends Clock {
     
    // Exercise 8.4
    // Creates a Cuckoo clock whose initial time is h hours and m minutes.
    public CuckooClock(int h, int m) {
	super(h,m);	
		
    }
    
    
    // CW1 8.1
    // Adds 1 minute to the time on this Cuckoo clock.
    // In addition,  it prints "Cuckoo!" at the start of every hour
    // It prints one time for each hour
    // Whether it is morning or night does not change the number of times it prints
    // For example, for 14:00, it prints "Cuckoo!" two times;
    //              and for 00:00 and 12:00, it prints "Cuckoo!" twelve times.

    /**
     *
     */
    @Override
    public void tick() {
	super.tick();
        
	int count = 0;
        if ((this.getHours() == 12 || this.getHours() == 0) && this.getMinutes() == 0) {
            count = 12;
        } else if (this.getMinutes() == 0 && this.getHours() > 0 && this.getHours() < 12) {
            count = this.getHours();
        } else if (this.getMinutes() == 0 && this.getHours() > 12) {
            count = this.getHours() - 12;
        }
        
        for (int i = 1; i <= count; i++) {
            System.out.println("Cuckoo!");
        }
		
    }
}
