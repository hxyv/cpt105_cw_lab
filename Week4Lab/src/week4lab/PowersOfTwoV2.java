/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4lab;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class PowersOfTwoV2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input;
    
    input = scanner.nextLine();
    
    int n = Integer.parseInt(input);
    
    int val = 1;
   
    while (val <= n) {
            System.out.println(val);
            val = val * 2;
}
    } 
}
