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
public class Exercise_8 {

    
    
    // Test Client
    public static void main(String[] args) {
        
        CuckooClock cc1 = new CuckooClock(0, 58);
        cc1.tick();
        cc1.tick();  // Cuckoo!
        System.out.println(cc1);  // 01:00
        
        CuckooClock cc2 = new CuckooClock(13, 59);
        cc2.tick();  // Cuckoo! 
		             // Cuckoo!

// Exercise8.1_8.3
/*	
        AlarmClock ac1 = new AlarmClock(5, 58, 6, 0);
        ac1.tick();
        ac1.tick();  // Beep beep beep beep!
        System.out.println(ac1);  // 06:00
        
        AlarmClock ac2 = new AlarmClock(14, 29, 14, 30, "Wake Up! The Hero! Kamen Rider!");
        ac2.tick();  // Wake Up! The Hero! Kamen Rider!
        
        /*
        Clock clock1 = new Clock(1, 0);
        Clock clock2 = new Clock("02:30");
		
        System.out.println(clock1);
        System.out.println(clock2);
		
        System.out.println(clock1.isEarlierThan(clock2));
		
        clock1.tick();
        clock2.tock(100);
		
        System.out.println(clock1);
        System.out.println(clock2);
        */
    }
    
}
