/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author xingyu hu
 */
public class Fact {
    public static int fact(int input){
        if (input == 0) {
            return 1;
        }
        else {
            return input * fact(input -1);    
        }
    }
    
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
