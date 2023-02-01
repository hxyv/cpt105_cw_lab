/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class Assigment1 {
    public static void main(String[] args) {
        int intNum1 = 2021, intNum2 = 105, intNum3, intNum4, intNum5, intNum6;
        double doubleNum1 = 2021, doubleNum2 = 105, doubleNum3;
        
        intNum3 = intNum1++ + intNum1*intNum2 + intNum2;
        intNum4 = (intNum1++ + intNum1)*intNum2 + intNum2;
        intNum5 = (intNum1++ + intNum1)*(intNum2 + intNum2);
        intNum6 = intNum1++ + intNum1*(intNum2 + intNum2);
        doubleNum3 = doubleNum1 * doubleNum2;
        
        System.out.println(intNum3);
        System.out.println(2021+2022*105+105);
        System.out.println(intNum4);
        System.out.println((2022+2023)*105+105);
        System.out.println(intNum5);
        System.out.println((2023+2024)*(105+105));
        System.out.println(intNum6);
        System.out.println(2024+2025*(105+105));
        System.out.println(doubleNum3);
        
    }
    
}
