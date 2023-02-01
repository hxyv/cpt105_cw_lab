/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4lab;

/**
 *
 * @author xingyu hu
 */
public class Method {
    public static void main(String[] args) {
       int total = addTwoNumbers();
       displayTotal(total);
       total = total + addTwoNumbers();
       displayTotal(total);
       total = total + addTwoNumbers();
       displayTotal(total);
    }
    
    public static int addTwoNumbers() {
        int result = 3 + 5;
        return result;
    }
    
    public static void displayTotal(int input) {
        System.out.println("****************");
        System.out.println("*Total is " + input + "*");
        System.out.println("****************");
    }
    
}
