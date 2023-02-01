/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.util.*;                           
/**
 *
 * @author xingyu hu
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            arithmeticOring();
        }
        catch (ArithmeticException e){
            System.out.println("除数不能为0");
        }
        catch (InputMismatchException e) {
            System.out.println("要为数字");
        }
    }
    
    public static void arithmeticOring() {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input First Number");
        int firstInt = kb.nextInt();
        System.out.println("Input Second Number");
        int secInt = kb.nextInt();
        var res = firstInt / secInt;
        System.out.println("Result is " + res);
    }
    
}
