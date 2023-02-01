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
public class BlackJack {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int integer1 = kb.nextInt();
        int integer2 = kb.nextInt();
        
        if (21 - integer1 >= 0 && 21 - integer2 >= 0 && integer1 > integer2)
            System.out.println(integer1);
        else {
            if (21 - integer1 >= 0 && 21 - integer2 >=0 && integer1 < integer2)
                System.out.println(integer2);
            else {
                if (integer1 > 21 && integer2 > 21)
                    System.out.println("-1");
                else {
                    if (integer1 > 0 && integer1 <= 21 && integer2 > 21)
                        System.out.println(integer1);
                    else {
                        if (integer2 > 0 && integer2 <=21 && integer1 >21)
                            System.out.println(integer2);
                        else {
                            if (integer1 == integer2)
                                System.out.println(integer1);
                       
                        }
                    }
                }
                    
            }
        }  
      
            
        
    }
    
}
