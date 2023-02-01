/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2cw1;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class PolarCoordinates {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double x = Double.parseDouble(kb.nextLine());
        double y = Double.parseDouble(kb.nextLine());
        
        double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double theta1 = Math.atan2(y,x);
        double theta2 = Math.atan(y/x);
        System.out.println("r = " + r);
        System.out.println("theta1 = " + theta1);
        System.out.println("theta2 = " + theta2);
    
    }
            
}
