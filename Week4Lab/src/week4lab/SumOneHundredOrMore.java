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
public class SumOneHundredOrMore {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String input;
        
        int num;
        double sum = 0;
        int loops = 0;
        
        while (sum <= 100) {
            System.out.println("Input next value");
            input = scanner.nextLine();
            num = Integer.parseInt(input);
            sum = sum + num;
            System.out.println("New total is " + sum);
            
            loops++;
        }
        System.out.println("--------------");
        System.out.println("Final total is " + sum);
        System.out.println("Number of numbers input was " + loops);
    }
    
}
