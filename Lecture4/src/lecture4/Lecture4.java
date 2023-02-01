/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

/**
 *
 * @author xingyu hu
 */
public class Lecture4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int d6 = 0;
        for (int i = 1; i <= 100; i++) {
        double rand = ((Math.random()*6)+1);
        int dice = (int) rand;
        
        if (dice == 1) {
            d1++;
        }
        else if (dice == 2) {
            d2++;
        }
        else if (dice == 3) {
            d3++;
        }
        else if (dice == 4) {
            d4++;
        }
        else if (dice == 5) {
            d5++;
        }
        else {
            d6++;
        }
        }
        
        System.out.println("d1: " + d1 +"\nd2: " + d2 + "\nd3: " + d3 + "\nd4: " + d4 + "\nd5: " + d5 + "\nd6: " + d6);
        System.out.println("Total: " + (d1 + d2 + d3 + d4 + d5 + d6));
        System.out.println("Total: " + d1 + 0);
    }
    
}
