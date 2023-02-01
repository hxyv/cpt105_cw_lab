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
public class Dice {

    public static void main(String[] args) {
        int[] diceList = new int[4];
        diceList = generateDice(diceList);
        
        printInts(diceList);
        
        int total = findTotal(diceList);
        
        int max = findMax(diceList);
        System.out.println("The max value is " + max);
        
        int loc = findMaxLoc(diceList);
        System.out.println("The index value is " + loc);

    }

    public static int[] generateDice(int[] input) {
        for (int i = 0; i < input.length; i++) {
            double rand = ((Math.random() * 6) + 1);
            int dice = (int) rand;
            input[i] = dice;
            System.out.println("Result is " + dice);
        }
        return input;
    }

    public static int findTotal(int[] input) {
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total = total + input[i];
            System.out.println("This dice value is " + input[i]);
        }
        return total;
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

    public static int findMax(int[] input) {
        int max = input[0];
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }

    public static int findMaxLoc(int[] input) {
        int max = input[0];
        int maxLocation = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
                maxLocation = i;
            }
        }
        return maxLocation;
    }
    
}
