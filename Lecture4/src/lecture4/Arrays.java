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
public class Arrays {
    public static void main(String[] args){
        
        String[] anArray = {"a","b","c","d"};
        anArray[0] = "Hello, ";
        
        
        for (int i = 0; i <= 3; i++) {
        System.out.println(anArray[i]);
        }
        
        int[] myArray = new int[5];
        for (int i =0; i <=4; i++) {
            myArray[i] = i;
            System.out.println(myArray[i]);
        }
    }
 
    
    
}
