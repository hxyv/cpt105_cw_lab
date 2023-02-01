/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3cw;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class PandemicSpread {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //define init as the initial number of infected persons on day1
        int init = kb.nextInt();
        //define numInfect as the average number of the healthy people that one infected person newly infects per day
        int numInfect = kb.nextInt();
        //define population as the total number of people in the area
        int population = kb.nextInt();
        //define total as the grand total number of infected people
        int total = init;
        //define the infection days
        int day = 1;
        
        while (total < population) {
            total = total + total * numInfect;
            day++;   
        }
        System.out.println(day);
    }
}
