
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
public class ImagePanelTest {
    public static void main(String[] args){
        JFrame f=new JFrame();
        //ImagePanel ip=new ImagePanel();
        //ImagePanel ip=new ImagePanel("res/elephant.png",0,0,f.getWidth(),f.getHeight());
        ImagePanel ip=new ImagePanel("res/elephant.png",400,400,100,100);
        f.add(ip,BorderLayout.CENTER);
        f.setSize(600,600);
        f.setVisible(true);
    }
    
}
