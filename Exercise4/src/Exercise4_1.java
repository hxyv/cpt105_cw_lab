/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class Exercise4_1 {
    
    public static void printInts(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            }
            else 
                System.out.print(nums[i]);
        }
        System.out.print("]");
    }
    
    public static void reverseInts(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n/2; i++) {
            int tmp = nums[i];
            nums[i] = nums[n - 1 - i];
            nums[n - 1 - i] = tmp;
                    
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverseInts(nums);
        printInts(nums);
    }
    
}
