/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author xingyu hu
 */
public class CopyEvenNumbers {
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] copyNums = copyEven(nums);
        printInts(copyNums);  
    }
    
    public static int[] copyEven(int[] nums) {
        int[] copyNums = new int[(nums.length + 1) / 2];
        
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                copyNums[index] = nums[i];
                index++;
            }
        }
    return copyNums;
    }
    
    public static void printInts(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");
    }
}

