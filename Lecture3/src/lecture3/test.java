/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture3;
import java.util.Scanner;

/**
 *
 * @author xingyu hu
 */
public class test {
    public static void main(String[] args) {
        int n = 5;
        Scanner kb = new Scanner(System.in);
        while (n > 0) {
        System.out.println("Input your score here:");
        int score = kb.nextInt();
        
        if (score >= 70 && score <= 100) 
            System.out.println("First Class");
        else {
            if (score >= 60 && score < 70)
                System.out.println("Upper Second Class");
            else {
                if (score >= 50 && score <60)
                    System.out.println("Lower Second Class");
                else {
                    if (score >= 40 && score <50)
                        System.out.println("Third Class");
                    else {
                        if (score >= 0 && score < 40)
                            System.out.println("Fail");
                        else {
                            System.out.println("You input a wrong score. Please check the score.");
                        }
                    }
                }
            }
        }
        n = n - 1;
        }
    }
    
    
}
