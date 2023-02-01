/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11_practice;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author xingyu hu
 */
public class DrawingComponent {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Image Panel");
      /*  ImagePanel ip = new ImagePanel("res/cow.png",0,0,200,200);
        ImagePanel ip1 = new ImagePanel("res/cow.png", 200,200,200,200);
        jf.add(ip1);
        jf.add(ip);
       */ jf.setSize(500,500);
        jf.setVisible(true);
        
        Graphics g1 = jf.getGraphics();
        g1.setColor(Color.RED);
        g1.drawLine(120,20,20,190);
        //(0, 170,100,0)
        Graphics g2 = jf.getGraphics();
        g2.setColor(Color.RED);
        g2.drawLine(120,20,220,20);
        
        Graphics g3 = jf.getGraphics();
        g3.setColor(Color.BLACK);
        g3.drawLine(320,20,420,190);
        
        Graphics g4 = jf.getGraphics();
        g4.setColor(Color.BLACK);
        g4.drawLine(420,190,320,360);
        
        Graphics g5 = jf.getGraphics();
        g5.setColor(Color.BLACK);
        g5.drawLine(120,360,320,360);
        
        Graphics g6 = jf.getGraphics();
        g6.setColor(Color.BLACK);
        g6.drawLine(20,190,120,360);
    }
}
