/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab14;

/**
 *
 * @author Erick.Purwanto
 */
public class Lab14 {
    
    public static int studentMoney1(int numStu) {
        
        // base cases
        if(numStu == 0)
            return 0;
        
        // recursive steps
        else{
            return studentMoney1(numStu - 1) + 7;
        }
    }
    
    public static int studentMoney2(int numStu) {
        
        // base cases
        if (numStu == 0)
            return 0;
        // recursive steps
        if (numStu % 3 == 0){
            return studentMoney2(numStu - 1) + 11;
        } else{
            return studentMoney2(numStu - 1) + 7;
        }
       
    }
    
    public static String christmasComing(String input) {
        
        // base cases
            if (input.isEmpty())
                return "";
        // recursive steps        
            if (input.substring(0, 1).equals("s")) {
                return "Santa" + christmasComing(input.substring(1));
            } else {
            return christmasComing(input.substring(1));
            }
    }
    
    public static void main(String[] args) {
        
        System.out.println(studentMoney1(6)); // 42      

        System.out.println(studentMoney2(6)); // 50
        
        System.out.println(christmasComing("sddff")); // chriSantatmaSantaiSantacoming
    }
    
}
