
import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class LineElephant {
 public static void main(String[] args){
        JFrame f=new JFrame();
        //f.setLayout(new FlowLayout());
       
        f.setLayout(new GridLayout(3,3,10,10));
        
        ImagePanel[] ip=new ImagePanel[9];
        for (int i=0;i<ip.length;i++){
            ip[i]=new ImagePanel("res/elephant.png",0,0,100,100);
            ip[i].setPreferredSize(new Dimension(100,100));
            f.add(ip[i]);
        }
        f.setSize(600,600);
        f.setVisible(true);
    }   
}
