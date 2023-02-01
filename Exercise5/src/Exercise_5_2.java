/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class Exercise_5_2 {

    public static void main(String[] args) {
        System.out.println(isValidID("THMBB7092WD11422129"));
    }

    public static boolean isValidID(String id) {
        boolean valid = true;
        
        //check the length
        if (id.length() < 5) {
            valid = false;
        } else {
            
            //caculate the sum
            int sum = 0;
            for (int i = 0; i < id.length() - 1; i++) {
                char strLetter = id.charAt(i);
                if (strLetter >= '0' && strLetter <= '9') {
                    int intNum = strLetter - '0';
                    sum = sum + intNum;
                }
            }

            //check the last number
            int mod = sum % 11;
            
            if (mod == 10 && id.charAt(id.length() - 1) != 'X') {
                valid = false;
            } else {
                if (mod != 10 && mod != id.charAt(id.length() - 1) - '0') {
                    valid = false;
                }
            }
        }

        return valid;
    }
}
