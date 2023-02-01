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
public class HailStone {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int i = 1;
        
        if (n <= 0) {
            
        } 
        else {
            while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = 3 * n + 1;
            }
            i++;
        }
        System.out.println(i);
        }  
    }
    
}
