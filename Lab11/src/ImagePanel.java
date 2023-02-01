
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
public class ImagePanel extends JPanel {
    BufferedImage myImage=null;
    int x,y,width,height;
    public ImagePanel(){
        super();
    }
    public ImagePanel(String path, int x, int y, int width, int height){
        super();
        this.x = x; this.y = y;
        this.width = width; this.height = height;
        this.myImage = readImage(path);
        setBackground(Color.GREEN);
    }
    public void paint(Graphics g){
        super.paint(g);
        setBackground(Color.GREEN);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(myImage, x, y,width,height, this);
    }
    private static BufferedImage readImage(String filename){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            System.out.println("read image error!");
        }
        return image;
    }
}
