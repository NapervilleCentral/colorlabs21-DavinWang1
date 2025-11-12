
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
        //opens selfie picture 
        /**/
        //String fileName = FileChooser.pickAFile();
        //Picture pictObj = new Picture(fileName);
        //pictObj.explore();
         
        //relative path
        Picture apic = new Picture("images\\beach.jpg");
        //change with selfie picture
        Picture me = new Picture("images/beach.jpg");
        Picture me1 = new Picture("images/beach.jpg");
        Picture me2 = new Picture("images/beach.jpg");
         
        apic.explore();
        Pixel[] pixels = apic.getPixels();
        int avgColor, minColor = 256, maxColor = -1;
        
        for (Pixel pixel : pixels) {
            avgColor = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
            pixel.setColor(new Color(avgColor, avgColor, avgColor));
            if (avgColor < minColor)
                minColor = avgColor;
            if (avgColor > maxColor)
                maxColor = avgColor;
        }
        System.out.println(minColor + ", " + maxColor);
        apic.explore();
        
        
         /**
          * method 1 change
          * 
          */
        int color;
        for (Pixel pixel : pixels) {
            color = pixel.getRed();
            if (color < 63)
                pixel.setColor(new Color(0, 0, 193));
            else if (color < 127)
                pixel.setColor(new Color(200, 0, 0));
            else if (color < 191)
                pixel.setColor(new Color(173, 216, 230));
            else
                pixel.setColor(new Color(250, 249, 246));
        }
        apic.explore();
        
        
         /**
          * method 2 change
          * 
          */
         
         /**
          * custom color palette
          */

         
    }//main       
}//class
