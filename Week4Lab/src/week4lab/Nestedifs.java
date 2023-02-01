/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4lab;
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class Nestedifs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        
        int windspeed = Integer.parseInt(input);
        
        if (windspeed >= 74) {
            if (windspeed <= 95){
                System.out.println("Category 1 hurricane");
            }
            else if (windspeed <= 110) {
                System.out.println("Category 2 hurricane");
            }
            else if (windspeed <= 130) {
                System.out.println("Category 3 hurricane");
            }
            else if (windspeed <= 155) {
                System.out.println("Category 4 hurricane");
            }
            else {
                System.out.println("Category 5 hurricane");
            }
        }
        else {
            System.out.println("Not a hurricane");
        }
            
        
    }
    
}
