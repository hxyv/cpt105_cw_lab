/*
 * CW1 Week 6
 */

public class Clock {
    private int hours;
    private int minutes;

    // CW1 6.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        hours = h;
        minutes = m;
       
    }

    // CW1 6.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
	hours = Integer.parseInt(s.substring(0,2));
        minutes = Integer.parseInt(s.substring(3,5));
        	
    }

    // CW1 6.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String hour = Integer.toString(hours);
        String minute = Integer.toString(minutes);
        
        if (hours >= 0 && hours <= 9) {
            hour = "0" + hour;
        }
        if (minutes >= 0 && minutes <= 9) {
            minute = "0" + minute;
        }
        
        return hour + ":" + minute;	
    }

    // CW1 6.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        boolean bool = false;
        
        if (this.hours < that.hours) {
            bool = true;
        } else if (this.hours == that.hours && this.minutes < that.minutes) {
            bool = true;
        }
		
	return bool;	
    }

    // CW1 6.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        minutes++;
        if (minutes == 60) {
            minutes = 0;
            hours++;
        }
        if (hours == 24) {
            hours = 0;
        }
		
    }

    // CW1 6.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        minutes = minutes + delta;

        while (minutes > 60) {
            minutes = minutes - 60;
            hours++;

            if (hours == 24) {
                hours = 0;
            }
        }

    }

    // Test client
    public static void main(String[] args) {
        Clock clock1 = new Clock(1, 0);
        Clock clock2 = new Clock("02:30");
		
        System.out.println(clock1);
        System.out.println(clock2);
		
        System.out.println(clock1.isEarlierThan(clock2));
		
        clock1.tick();
        clock2.tock(100);
		
        System.out.println(clock1);
        System.out.println(clock2);
		
    }
}
