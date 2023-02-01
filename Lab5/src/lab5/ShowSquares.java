/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author xingyu hu
 */
public class ShowSquares {
    public static void main(String[] args) {
        showSquares(10);
    }
    
    public static void showSquares(int nums) {
        for (int i = 1; i <= nums; i++) {
            System.out.println(i + " " + i * i);
        }
            
    }
    
}
