/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int y = kb.nextInt();
        int m = kb.nextInt();
        int d = kb.nextInt();
        
        int a,b,c,day;
        a = y-(14-m)/12;
        b = a+a/4-a/100+a/400;
        c = m+12*((14-m)/12)-2;
        day = (d+b+(31*c)/12) % 7;
        
        System.out.println("It's day " + day + " !");
        
    }
}

