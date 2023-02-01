/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4;

/**
 *
 * @author xingyu hu
 */
public class methods {
    public static int addTwoNumbers(int num1, int num2){
        int result = num1 + num2;
        return result;
    } 
    public static int displayTotal(int display) {
        System.out.println("Total is " + display);
        return display;
    }
    public static void main(String[] args) {
        int total = addTwoNumbers(1,5);
        displayTotal(total);      
        int otherNumber = addTwoNumbers(8,2);
        displayTotal(otherNumber);
    } 
    
    public static int findTotal(int[] input) {
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total = total + input[i];
            System.out.println("This dice is value is " + input[i]);
        }
        return total;
    }
    
}
