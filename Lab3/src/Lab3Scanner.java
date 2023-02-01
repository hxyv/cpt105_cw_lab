/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class Lab3Scanner {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input your number: ");
        double x1 = kb.nextDouble();
        double x2 = kb.nextDouble();
        double x3 = Math.toRadians(Math.atan(x1 / x2));
        
        System.out.println("The angle is:" + x3);
       
        
    }
    
}
