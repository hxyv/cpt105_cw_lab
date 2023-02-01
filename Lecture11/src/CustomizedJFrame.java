
import java.awt.*;
import javax.swing.*;
public class CustomizedJFrame extends JFrame {
    public CustomizedJFrame(String s){
        super(s);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawLine(0, 0, 400, 400);
        g.setColor(Color.blue);
        g.fillOval(200, 100, 80, 80);
    }
}
