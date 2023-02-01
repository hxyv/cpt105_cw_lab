/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2_mock2;
/*
 * CW2 Lab Group Mon 11
 */

public class HappyDay {
    
    // CW2 Lab Group Mon 11 Question 5
    // Given a string input that consists of lowercase letters,
    // or other characters (such as whitespace, numbers, punctuations),
    // add " day" for every occurrences of "happy" to the input string and return it.
    // Do not add " day" if "happy" is part of another word,
    // such as "unhappy" or "happygolucky".
    // But add " day" if "happy" is immediately followed by non-letter characters.
	
    public static String happyDay(String input) {
	String[] blocks = input.split(" ");

        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].length() >= 5) {
                if (blocks[i].length() == 5 && blocks[i].contains("happy")) {
                    blocks[i] = "happy day";
                } else if ((blocks[i].length() > 5) && (blocks[i].charAt(5) < 'a' || blocks[i].charAt(5) > 'z')) {
                    blocks[i] = "happy day" + blocks[i].substring(5);
                }
            }
        }
        String output = "";
        for (int j = 0; j < blocks.length; j++) {
            output = output + " " + blocks[j];
        }
        return output;
    }
    
    // Test Client
    public static void main(String[] args) {
        
        System.out.println(happyDay("don't worry, be happy"));
        // don't worry, be happy day
        
        System.out.println(happyDay("wish you all happy, always!"));
        // wish you all happy day, always!
        
        System.out.println(happyDay("she is unhappy with the result"));
        // she is unhappy with the result        
        
		
		// Add your own testcases below !
        System.out.println(happyDay("happy1 1happy hapy abhappy happy1 happy!!!"));
		
		
		
    }
    
}