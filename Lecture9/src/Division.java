
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class Division {
    public static void division(){
        Scanner scan=new Scanner(System.in);
        try{
            System.out.print("Please input first value:");
            int d1=scan.nextInt();
            System.out.print("Please input second value:");
            int d2=scan.nextInt();
            System.out.print("The result is: "+d1/d2);
        }
        catch(InputMismatchException e1){
            System.out.println("Please into a numrical string!");
            System.out.println(e1.toString());
        }
        catch(ArithmeticException e2){
            System.out.println("d2 cannot be zero!");
            System.out.println(e2.toString());    
        }
        catch(Exception e3){
            System.out.println("Other exceptions catched!");
            System.out.println(e3.toString()); 
        }
    }
    public static void main(String[] args){
        division();
    }
}
