
/**
 * Manipulates the colors of various images
 * @author Davin Wang
 * @version 11-12-2025
 */
import java.awt.*;
import java.util.*;
import java.util.List;
public class ColorLab {
    public static void main(String[] args) {
        Picture p1 = new Picture("images/gorge.jpg");
        Picture p2 = new Picture("images/beach.jpg");
        Picture p3 = new Picture("images/redMotorcycle.jpg");
        Picture p4 = new Picture("images/temple.jpg");
        Picture p5 = new Picture("images/butterfly1.jpg");
        Picture p6 = new Picture("images/blue-mark.jpg");
        
        
        //adjustblue
        p1.explore();
        Pixel[] pixels1 = p1.getPixels();
        double factor = 0.25;
        for (Pixel pixel : pixels1) {
            pixel.setBlue((int)(pixel.getBlue() * factor));
        }
        p1.explore();
        
        //negative
        p2.explore();
        Pixel[] pixels2 = p2.getPixels();
        for (Pixel pixel : pixels2) {
            pixel.setRed(255 - pixel.getRed());
            pixel.setBlue(255 - pixel.getBlue());
            pixel.setGreen(255 - pixel.getGreen());
        }
        p2.explore();
        
        //grayscale
        p3.explore();
        Pixel[] pixels3 = p3.getPixels();
        int avgcolor;
        for (Pixel pixel : pixels3) {
            avgcolor = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
            pixel.setColor(new Color(avgcolor, avgcolor, avgcolor));
        }
        p3.explore();
        
        //lighten
        p4.explore();
        Pixel[] pixels4 = p4.getPixels();
        for (Pixel pixel : pixels4) {
            pixel.setRed(pixel.getRed() + 50);
            pixel.setBlue(pixel.getBlue() + 50);
            pixel.setGreen(pixel.getGreen() + 50);
        }
        p4.explore();
        
        //changeColors
        p5.explore();
        Pixel[] pixels5 = p5.getPixels();
        int redAmount = 23;
        int greenAmount = 56;
        int blueAmount = 67;
        for (Pixel pixel : pixels5) {
            pixel.setRed(pixel.getRed() + redAmount);
            pixel.setBlue(pixel.getBlue() + greenAmount);
            pixel.setGreen(pixel.getGreen() + blueAmount);
        }
        p5.explore();
        
        //blueify
        p6.explore();
        int red, green, blue;
        Pixel[] pixels6 = p6.getPixels();
        for (Pixel pixel : pixels6) {
            red = pixel.getRed();
            green = pixel.getGreen();
            blue = pixel.getBlue();
            
            if (red > 75 && red < 200 && green > 50 && green < 160 && blue > 25 && blue < 140)
                pixel.setColor(new Color(blue / 2, blue / 2, blue));
        }
        p6.explore();
        
    }
    
}

















