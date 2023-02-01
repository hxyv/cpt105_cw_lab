package week2cw1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author xingyu hu
 */
public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double x1 = Math.toRadians(kb.nextDouble());
        double y1 = Math.toRadians(kb.nextDouble());
        double x2 = Math.toRadians(kb.nextDouble());
        double y2 = Math.toRadians(kb.nextDouble());
        
        double r = 6371.0;
        
        double dist;
        dist = 2.0*r*Math.asin(Math.sqrt(Math.pow(Math.sin((x2-x1)/2),2)+Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2),2)));
       
        System.out.println(dist + " kilometres");
        
    }
}
