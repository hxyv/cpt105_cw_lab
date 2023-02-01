/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xingyu hu
 */
public class Exercise4_4 {
    public static void main(String[] args) {
        printInts(arithSeries(7));
    }
    
    public static int[] arithSeries(int n) {
        int[] nums = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= i; k++) {
                nums[index] = k;
                index++;
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
            else
                System.out.print(nums[i]);
        }
        System.out.println("]");
    }
    
}
