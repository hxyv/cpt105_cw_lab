/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class CW1_4_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        printInts(evenOddSwap(nums));
    }
    
    public static int[] evenOddSwap(int[] nums) {
        int[] oddArray = new int[nums.length +1/ 2];
        int[] oddNums = new int[nums.length +1/ 2];
        int[] evenArray = new int[nums.length +1/ 2];
        int[] evenNums = new int[nums.length +1/ 2];
       
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0){
                evenArray[evenCount] = nums[i];
                evenNums[evenCount] = i;
                evenCount++;
            }
            else {
                oddArray[oddCount] = nums[i];
                oddNums[oddCount] = i;
                oddCount++;
            }
        }
        evenCount = oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (evenNums[evenCount] > oddNums[oddCount]) {
                nums[i] = evenArray[evenCount];
                evenCount++;
            }
            else {
                nums[i] = oddArray[oddCount];
                oddCount++;
            }
            
            if (evenCount >= nums.length / 2) {
                evenCount = 0;
            }
            else if (oddCount >= nums.length / 2) {
                oddCount = 0;
            } 
            
            }
        
        
     return nums;   
    }
    
    public static void printInts(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if ( i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            }
            else
                System.out.print(nums[i]);
        }
        System.out.println("]");
    }
    
}
