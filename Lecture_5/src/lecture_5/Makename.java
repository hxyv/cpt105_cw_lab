/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture_5;

/**
 *
 * @author xingyu hu
 */
public class Makename {

    public static void main(String[] args) {
        String myName = makeName("Lewis", "Joe", false);
        String hisName = makeName("Lewis", "Joe", true);
        System.out.println(myName + "\t" + hisName);
        
        char myChar = '1';
        boolean b = Character.isDigit(myChar);
        System.out.println(b);
        
        String s = "I love Java.";
        int strLen = s.length();
        System.out.println(strLen);
        
        String myStr = "Hi";
        String yourStr = "Hello";
        boolean a = myStr.equals(yourStr);
        System.out.println(a);
        
        char H = myStr.charAt(0);
        char i = myStr.charAt(1);
        System.out.println(H + "" + i);
        
        int oLoc = yourStr.indexOf('o');
        System.out.println(oLoc);
        
        int x = Integer.parseInt("1111");
        String xString = String.valueOf(x);
        System.out.println(xString);
        
        String[] splits = s.split("love ");
        System.out.println(s);
        for (int k = 0; k < splits.length; k++) {
            System.out.println(splits[k]);
        }
                
    }

    public static String makeName(String family, String given, boolean isChinese) {
        String fullName;
        if (isChinese) {
            fullName = family + " " + given;
        } else {
            fullName = given + " " + family;
        }

        return fullName;
    }
}
