/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture11_practice;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

/**
 *
 * @author xingyu hu
 */
public class ImagePanel extends JPanel{
    private int x, y, width, height;
    private Image myImage;
    public ImagePanel(String path, int x, int y, int width, int height){
        this.x = x; this.y = y;
        this.width = width; this.height = height;
        this.myImage  = readImage(path);
        setBackground(Color.RED);
    }
    
    public int getX() {return x;}
    public int getY() {return y;}
    public int getWidth() {return width;}
    public int getHeight() {return height;}
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(myImage, 0, 0, width, height, this);
    }
    
    private static BufferedImage readImage(String filename) {
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException e) {
            System.out.println("read image error!");
        }
        return image;
    }
}
