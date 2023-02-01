/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class christmas_tree {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Input the height of the tree: ");
        treePrint(kb.nextInt());
        treePrint2(kb.nextInt());
           
    }
    
    public static void treePrint(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < height * 2; j++) {
                if ((height - i) < j && (j - height) < i) {
                    int result = Math.abs(height - j) + 1;
                    System.out.print(result);
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
    
    public static void treePrint2(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < height * 2; j++) {
                if ((height - i) < j && (j - height) < i) {
                    int result = Math.abs(height - j) + i;
                    System.out.print(result);
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
    
}
