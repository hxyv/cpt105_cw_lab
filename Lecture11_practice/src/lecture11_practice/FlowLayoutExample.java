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
public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb=new JButton("OK");
        JTextField jt=new JTextField("this is a text field");
        JLabel jl=new JLabel("This is a label:");
        frame.setLayout(new FlowLayout());
        frame.add(jl);
        frame.add(jt);
        frame.add(jb);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setTitle("JFrame with FlowLayout!");
    }       
}

