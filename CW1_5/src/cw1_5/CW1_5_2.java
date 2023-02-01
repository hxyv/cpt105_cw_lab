/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1_5;

/**
 *
 * @author xingyu hu
 */
public class CW1_5_2 {
    
    public static void main(String[] args) {
        int netIncome = calcNetIncome("salary 15000yuan bonus2000 rent -1000Y");
        System.out.println("Net Income = " + netIncome);
    }
    public static int calcNetIncome(String input) {
        int i = 0;
        int netIncome = 0;
        int n = input.length();
        
        while (i < n) {
            //first digit of a positive number
            if (Character.isDigit(input.charAt(i))) {
                int j = i + 1;
                while (j < n && Character.isDigit(input.charAt(j))) {
                    j++;
                }
                netIncome += Integer.parseInt(input.substring(i, j));
                i = j;
            } //first character is minus character
            else if (input.charAt(i) == '-') {
                int j = i + 1;
                while (j < n && Character.isDigit(input.charAt(j))) {
                    j++;
                }
                netIncome -= Integer.parseInt(input.substring(i + 1, j));
                i = j;
            } else {
                i++;
            }
        }
        
        return netIncome;
    }
}
