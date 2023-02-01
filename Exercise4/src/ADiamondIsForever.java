/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class ADiamondIsForever {
    public static void main(String[] args) {
       diamond(13); 
    }
    
    public static void diamond(int n) {
        int mid = (n + 1) / 2;
        
        for (int i = 0; i < mid; i++) {
            
            for (int j = 1; j <= n; j++) {
                if (j >= mid - i && j <= mid + i) {
                  System.out.print("* ");
                }  
                else
                    System.out.print(". ");
            }
            System.out.println("");
        }
        
        for (int i = mid - 2; i >= 0; i--) {
            for (int j = 1; j <= n; j++) {
                if (j >= mid - i && j <= mid + i) {
                    System.out.print("* ");
                }
                else
                    System.out.print(". ");
            }
            System.out.println("");
        }
    }
    
}
