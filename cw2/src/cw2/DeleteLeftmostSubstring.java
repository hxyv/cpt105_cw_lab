/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

/**
 *
 * @author xingyu hu
 */
public class DeleteLeftmostSubstring {
    
    // CW2 Lab Group Tue 11 Question 5
    // Complete the method deleteLeftmostSubstring(input, target)
    // The method deletes the leftmost occurrence of target substring from input string, 
    // repeatedly on the resulting string,
    // until all occurrences of target are deleted.
    // It returns the resulting string after repeated deletions.
    // You must use String methods in lecture notes.
    // You must NOT use StringBuilder, Java Util, or Regular Expression methods.
    public static String deleteLeftmostSubstring(String input, String target) {
        int length = target.length();
        while (length > 0) {
            if (!input.contains(target)) {
                break;
            }
            int n = input.indexOf(target);
            input = input.substring(0, n) + input.substring(n + length, input.length());
        }
	return input;	
    }
    
    
    public static void main(String[] args) {
        System.out.println(deleteLeftmostSubstring("abcd", "abc"));
        // "abcd" -> "d"
        System.out.println(deleteLeftmostSubstring("ababccd", "abc"));
        // "ababccd" -> "abcd" -> "d"
        System.out.println(deleteLeftmostSubstring("xyaxybxy", "xy"));
        // "xyaxybxy" -> "axybxy" -> "abxy" -> "ab"
        
        // add your own test cases :
	System.out.println(deleteLeftmostSubstring("aaaaaaaaaaaaabbbbbbbbbbbbbbbbb", "ab"));	
		
		
    }
}
