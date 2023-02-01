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
public class ValidDay {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please input a day number: ");
        int validity = kb.nextInt();
        
        if (validity >= 1 && validity <= 7) {
            if (validity == 1) {
                System.out.println("Monday");
            }
            else if (validity == 2) {
                System.out.println("Tuesday");
            }
            else if (validity == 3) {
                System.out.println("Wednesday");
            }
            else if (validity == 4) {
                System.out.println("Thursday");
            }
            else if (validity == 5) {
                System.out.println("Friday");
            }
            else if (validity == 6) {
                System.out.println("Saturday");
            }
            else {
                System.out.println("Sunday");
            }  
        }        
        else {
                System.out.println("It is not a valid day number");
                }
            
            
        
            
    }
}
