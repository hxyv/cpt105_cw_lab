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
public class PassOrNot {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int score = kb.nextInt();
        System.out.print("Please input a score:");
        if (score >= 40) 
            System.out.println("Congratulations, you passed the exam");
        else {
            System.out.println("Sorry, you failed the exam");
        }
    }
    
}
