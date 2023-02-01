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
public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb = new JButton("OK");
        JTextField jt = new JTextField("This is a text field");
        JLabel jl = new JLabel("This is a lable");
        frame.add(jl,BorderLayout.NORTH);
        frame.add(jt, BorderLayout.CENTER);
        frame.add(jb,BorderLayout.SOUTH);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setTitle("JFrame as a continer");
    }
}
