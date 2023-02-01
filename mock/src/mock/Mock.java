/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

/**
 *
 * @author xingyu hu
 */
public class Mock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input = "abcdbaddab";
        System.out.println(appearOnce(input)); // 'c'
        input = "abcdcb";
        System.out.println(appearOnce(input)); // 'a'
        input = "x";
        System.out.println(appearOnce(input)); // 'x'
    }
    
    public static char appearOnce(String input) {
        String[] str = input.split("");
        String check = null;
        for (int i = 0; i < str.length; i++) {
            check = str[i];
            for (int j = i; j < str.length; j++) {
                if (check.equals(str[j])) {
                    check = str[j];
                }
            }
        }
        return check.charAt(0);
    }
    
}
