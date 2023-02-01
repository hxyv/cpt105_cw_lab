
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventSampleTest {
   public static void main(String[] agrs){
        JFrame f=new JFrame("Event Test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1=new JButton("Change Red");
        JButton btn2=new JButton("Change Blue");
        JPanel jp=new JPanel();
        f.add(btn1, BorderLayout.NORTH);
        f.add(btn2,BorderLayout.SOUTH);
        f.add(jp,BorderLayout.CENTER);
        f.setVisible(true);
        f.setSize(300,300);
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jp.setBackground(Color.red);
            }
        }
        );
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                jp.setBackground(Color.BLUE);
            }
        }
        );     
    }  
}
