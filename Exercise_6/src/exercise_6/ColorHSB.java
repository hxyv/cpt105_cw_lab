/*
 * Exercise Week 6
 */

public class ColorHSB {
    
    private int hue;
    private int saturation;
    private int brightness;

    // Exercise 6.1
    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {
        this.hue = hue;
        this.saturation = s;
        this.brightness = b;
        
    }

    // Exercise 6.2
    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return "(" + hue + ", " + saturation + ", " + brightness + ")"; 
        
    }

    // Exercise 6.3
    // Is this color in grayscale?
    public boolean isGrayscale() {
        boolean bool = false;
        if (saturation == 0 || brightness == 0) {
            bool = true;
        }

        return bool;
    }

    // Exercise 6.4
    // Returns the squared distance between two colors.
    //     min{ (h1−h2)^2, (360−|h1−h2|)^2 } + (s1−s2)^2 + (b1−b2)^2
    public int squareDist(ColorHSB that) {
	int distance = 0;
        distance = Math.min((that.hue - this.hue) * (that.hue - this.hue),(360 - Math.abs(that.hue - this.hue)) * (360 - Math.abs(that.hue - this.hue))) 
                + (that.saturation - this.saturation) * (that.saturation - this.saturation) 
                + (that.brightness - this.brightness) * (that.brightness - this.brightness);
		
	return distance;	
    }
    
    public static void main(String[] args) {
        ColorHSB green = new ColorHSB(100, 100, 50);
        ColorHSB orange = new ColorHSB(25, 100, 100);
        ColorHSB gray = new ColorHSB(0, 0, 50);
        
        System.out.println(green);
        System.out.println(orange);
        System.out.println(gray);
        
        System.out.println(orange.isGrayscale());
        System.out.println(gray.isGrayscale());
        
        int distGreenOrange = green.squareDist(orange);
        System.out.println(distGreenOrange);
        System.out.println(gray.squareDist(orange));
    }
    
}
