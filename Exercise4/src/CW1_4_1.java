/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class CW1_4_1 {
    public static void main(String[] args) {
        bandMatrix(15,5);
    }

    
    public static void bandMatrix(int n,int width) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || j >= i - width && j <= i + width) {
                    System.out.print("*");
                }
                else {
                    System.out.print("0");
                }
                System.out.print("  ");
            }
            System.out.println("");
        }
    }
        
    
}
