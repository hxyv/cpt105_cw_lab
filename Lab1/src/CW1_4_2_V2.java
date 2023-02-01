/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class CW1_4_2_V2 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,4,5,6};
        printInts(evenOddSwap(nums));
    }
    
    public static int[] evenOddSwap(int[] nums) {
        int[] oddArray = new int[nums.length / 2];
        int[] evenArray = new int[nums.length / 2];
        int evenIndex = 0;
        int oddIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                evenArray[evenIndex] = nums[i];
                evenIndex++;
            }
            else {
                oddArray[oddIndex] = nums[i];
                oddIndex++;
            }
        }
        
        evenIndex = oddIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = oddArray[oddIndex];
                oddIndex++;
            }
            else {
                nums[i] = evenArray[evenIndex];
                evenIndex++;
            }
        }
        return nums;
    }
    
    public static void printInts(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            }
            else {
                System.out.print(nums[i]);
            }
        }
        System.out.println("]");
    }
    
}
