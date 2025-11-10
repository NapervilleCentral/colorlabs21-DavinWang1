
/**
 * Write a description of class Color here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List;
public class ColorLab {
    public static void main(String[] args) {
        Picture p1 = new Picture("images/gorge.jpg");
        Picture p2 = new Picture("images/beach.jpg");
        Picture p3 = new Picture("images/redMotorcycle.jpg");
        
        
        
        p1.explore();
        Pixel[] pixels1 = p1.getPixels();
        double factor = 0.25;
        for (Pixel pixel : pixels1) {
            pixel.setBlue(pixel.getBlue()/4);
        }
        p1.explore();
        
        
        p2.explore();
        Pixel[] pixels2 = p2.getPixels();
        for (Pixel pixel : pixels2) {
            pixel.setRed(255 - pixel.getRed());
            pixel.setBlue(255 - pixel.getBlue());
            pixel.setGreen(255 - pixel.getGreen());
        }
        p2.explore();
        
        p3.explore();
        Pixel[] pixels3 = p3.getPixels();
        int avgcolor;
        for (Pixel pixel : pixels3) {
            avgcolor = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
            pixel.setColor(new Color(avgcolor, avgcolor, avgcolor));
        }
        p3.explore();
        
        p3.explore();
        Pixel[] pixels3 = p3.getPixels();
        int avgcolor;
        for (Pixel pixel : pixels3) {
            avgcolor = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
            pixel.setColor(new Color(avgcolor, avgcolor, avgcolor));
        }
        p3.explore();
        
        
    }
    
}

















