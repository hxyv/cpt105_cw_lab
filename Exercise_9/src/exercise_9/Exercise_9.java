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
public class Exercise_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clock clock = new Clock(1,1);
        clock.tick();
        System.out.println(clock.toString());
    }
    
}
