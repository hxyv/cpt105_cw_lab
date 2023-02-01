import java.awt.*;
import javax.swing.*;
public class CoordinateExample {
    public static void main(String[] argc){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb=new JButton("OK");
        JTextField jt=new JTextField("this is a text field");
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.add(jt);
        frame.add(jb);
        jt.setBounds(50,10,150,30);
        jb.setBounds(50,60,150,30);
        frame.setVisible(true);
        frame.setTitle("Coordiante system!");
    }       
}
