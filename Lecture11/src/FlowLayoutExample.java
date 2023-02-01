import java.awt.*;
import javax.swing.*;
public class FlowLayoutExample {
public static void main(String[] argc){
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
