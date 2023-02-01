/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3cw;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class RightTriangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = kb.nextInt();
        boolean bool1 = true;
        
        if (a <= 0 || b <= 0 || c <= 0) 
            System.out.println(!bool1);
        else {
            if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b)
                System.out.println(bool1);
            else {
                System.out.println(!bool1);
            }
            
        }  
    }
    
}
