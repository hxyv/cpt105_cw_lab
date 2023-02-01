
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class ImagePanel extends JPanel {
    private int x, y, width, height;
    private Image myImage;
    public ImagePanel(String path, int x, int y, int width, int height){
        this.x = x; this.y = y;
        this.width = width; this.height = height;
        this.myImage = readImage(path);
        setBackground(Color.GREEN);
    }
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(myImage, 0, 0,width, height, this);
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
