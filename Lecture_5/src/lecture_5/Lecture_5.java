/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_5;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class Lecture_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        /*
        String str1 = getFourLetters();
        System.out.println(str1);
         */

        String memberNo = "A-123-456-23";
        boolean valid = checkMembership(memberNo);
        System.out.println(valid);
    }

    public static boolean checkMembership(String input) {
        boolean valid = true;
        //check the length
        if (input.length() != 13) {
            valid = false;
        } else {
            //check the hyphens
            if (!(checkLetter(input, 1, "-")) || !(checkLetter(input, 5, "-")) || !(checkLetter(input, 9, "-"))) {
                valid = false;
            }

            //check 4 blocks
            String[] blocks = input.split("-");
            if (blocks.length != 4) {
                valid = false;
            }

            //check the length of each block
            if (blocks[0].length() != 1) {
                valid = false;
            }
            for (int i = 1; i < blocks.length; i++) {
                if (blocks[i].length() != 3) {
                    valid = false;
                }
            }

            //check the first block
            String firstBlock = input.substring(0, 1);
            firstBlock = firstBlock.toUpperCase();
            char letter = firstBlock.charAt(0);
            if (letter < 'A' || letter > 'D') {
                valid = false;
            }

            //check the rest number blocks
            String restBlocks = input.substring(2, 12);
            for (int i = 0; i < restBlocks.length(); i++) {
                if (i != 3 && i != 7) {
                    char middle = restBlocks.charAt(i);
                    if (middle < '1' || middle > '9') {
                        valid = false;
                    }
                }
            }

            //check the last letter
            char lastLetter = input.charAt(12);
            if (lastLetter < 'A' || lastLetter > 'T') {
                valid = false;
            }
        }
        return valid;
    }
    
    public static boolean checkLetter(String input, int loc, String check) {
        boolean valid = true;
        String hyphen = input.substring(loc,loc + 1);
        if (!(hyphen.equals(check))) {
            valid = false;
        }
        
        return valid;
    }
    
    /*
    public static String getFourLetters() {
        Scanner kb = new Scanner(System.in);
        String input = "";
        while (input.length() != 4) {
            System.out.println("Enter a four letters string: ");
            input = kb.nextLine();
            int length = input.length();
            System.out.println("Length is " + length);
        }
        return input;
    }
    */
}
