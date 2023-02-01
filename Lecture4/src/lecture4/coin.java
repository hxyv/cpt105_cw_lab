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
public class coin {
    public static void main(String[] args) {
        
            
        int n = 100000000;
        int[] array = new int[n];
        
        for (int i = 0; i <= array.length - 1; i++) {
            double rand = Math.random();
            if (rand <= 0.5) {
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
        
        int total =0;
        
        for (int k = 0; k <= array.length - 1; k++) {
            total = total + array[k];
        }
        
        System.out.println(total);
        
        
    }
}
