
import java.awt.*;
import javax.swing.*;
public class DrawingComponent {
    public static void main(String[] args){
        /* //CustomizedFrame
        CustomizedJFrame jf=
                    new CustomizedJFrame("Customized JFrame Window");
       jf.setSize(400,400);
       jf.setVisible(true);
       */
        JFrame jf=new JFrame("Image Panel");
        ImagePanel ip=new ImagePanel("res/cow.png",0,0,200,200);
        jf.add(ip);
        jf.setSize(400,400);
        jf.setVisible(true);
  }  
}
