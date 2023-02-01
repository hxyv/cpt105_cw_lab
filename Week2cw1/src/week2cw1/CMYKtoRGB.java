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
public class CMYKtoRGB {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double cyan = kb.nextDouble();
        double magenta = kb.nextDouble();
        double yellow = kb.nextDouble();
        double black = kb.nextDouble();
        
        int red = (int)(Math.round(255*(1-black)*(1-cyan)));
        int green = (int)(Math.round(255*(1-black)*(1-magenta)));
        int blue = (int)(Math.round(255*(1-black)*(1-yellow)));
        
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
        
        
        
    }
}
