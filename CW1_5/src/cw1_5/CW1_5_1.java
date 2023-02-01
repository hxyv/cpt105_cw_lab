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
public class CW1_5_1 {
    public static void main(String[] args) {
        System.out.println(sandwichFillings("breadbreadbread"));
    }
   
    public static String sandwichFillings(String input) {
        
        int n = "bread".length();
        int firstBreadIndex = input.indexOf("bread" , 0);
        if (firstBreadIndex == -1) {
            return "none";
        }
        
        int lastBreadIndex = firstBreadIndex;
        
        while (input.substring(lastBreadIndex + n).contains("bread")) {
            lastBreadIndex = input.indexOf("bread", lastBreadIndex + n);
        }
        
        if (lastBreadIndex == firstBreadIndex) {
            return "none";
        }
        
        return input.substring(firstBreadIndex + n, lastBreadIndex);
    }
}
