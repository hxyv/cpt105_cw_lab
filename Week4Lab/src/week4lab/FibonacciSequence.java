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
public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        
        int n = Integer.parseInt(input);
        int FirstNum = 0;
        int SecondNum = 1;
        int sum = 0;
        
        System.out.print(FirstNum + " ");
        
        while (SecondNum < n) {
            System.out.print(SecondNum + " ");
            sum = FirstNum + SecondNum;
            FirstNum = SecondNum;
            SecondNum = sum;
        }
    }
    
}
