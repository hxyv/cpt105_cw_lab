/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3cw;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class Week3cw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        if (n % 2 == 0)
            n = n / 2;
        else {
            n = 3 * n + 1;
        }
        System.out.println(n);
    }
    
}
