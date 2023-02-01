
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ntuzx
 */
public class EventTest {
    public static void main(String[] agrs){
        JFrame f=new JFrame("Event Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(4,2,10,10));
        JLabel jl1=new JLabel("Number 1: ",JLabel.RIGHT);
        
        JLabel jl2=new JLabel("Number 2: ",JLabel.RIGHT);
        JLabel jl3=new JLabel("Sum: ",JLabel.RIGHT);
        JTextField txt1=new JTextField();
        JTextField txt2=new JTextField();
        JTextField txtResult=new JTextField();
        JButton btnOK=new JButton("Add");
        JButton btnReset=new JButton("Reset");
        f.add(jl1);
        f.add(txt1);
        f.add(jl2);
        f.add(txt2);
        f.add(jl3);
        f.add(txtResult);
        f.add(btnOK);
        f.add(btnReset);
        f.setVisible(true);
        f.setSize(300,300);
        btnOK.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
            double d1=Double.parseDouble(txt1.getText());
            double d2=Double.parseDouble(txt2.getText());
            double d3=d1+d2;
            txtResult.setText(Double.toString(d3));
            
        }});
        
        btnReset.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
            
            txt1.setText("");
            txt2.setText("");
            txtResult.setText("");
        }});
        
    }
}
