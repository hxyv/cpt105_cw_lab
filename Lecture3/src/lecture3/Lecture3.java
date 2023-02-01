/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture3;

/**
 *
 * @author xingyu hu
 */
import java.util.Scanner;

public class Lecture3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        System.out.println("Please input the n: ");
        double n = kb.nextDouble();
        
        int i = 1, val = 1;
        while (i < n) {
            val = val*2;
            i = i + 1;
            if (val < 0) {
                System.out.println(i);
                System.out.println(Math.pow(2,i));
            }
        }


    }
    
}
