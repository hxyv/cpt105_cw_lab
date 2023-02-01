/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2_mock;

/**
 *
 * @author xingyu hu
 */
public class AppearOnce extends Counter{
        
    // Mock Lab Test Question 5
    // Complete the method appearOnce that on input a non-empty string, 
    // prints the first character that appears exactly once in the string.
    // You may assume that the input string will contain at least one such character.
    // You must use String methods in lecture notes.
    // You must NOT use StringBuilder or Regular Expression methods.
    public static char appearOnce(String input) {
        int i;
        int j;

        for (i = 0; i < input.length(); i++) {
            boolean bool = false;
            for (j = i + 1; j < input.length(); j++) {
                if (input.substring(i, i + 1).equals(input.substring(j, j + 1))) {
                    bool = true;
                    break;
                }
            }
            if (bool == false) {
                break;
            }
            int b = 0;
        }
        return input.charAt(i);
    }
		
		
    
    
    public static void main(String[] args) {
        String input = "abcdbaddab";
        System.out.println(appearOnce(input)); // 'c'
        input = "abcdcb";
        System.out.println(appearOnce(input)); // 'a'
        input = "x";
        System.out.println(appearOnce(input)); // 'x'
        for (int i = 0; i < 8 ;i++) {
            int b = 0;
        }
        //System.out.println(b);
        // add your own test cases
            
    }
}
