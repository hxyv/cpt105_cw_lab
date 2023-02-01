
import java.awt.*;
import javax.swing.*;
public class BorderLayouExample {
    public static void main(String[] argc){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb=new JButton("OK");
        JTextField jt=new JTextField("this is a text field");
        JLabel jl=new JLabel("This is a label:");
        frame.add(jl,BorderLayout.NORTH);
        frame.add(jt,BorderLayout.CENTER);
        frame.add(jb,BorderLayout.SOUTH);
        frame.setSize(300,200);
        frame.setVisible(true);
        frame.setTitle("JFrame as a container!");
    }   
}
