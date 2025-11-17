
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
        Picture selfie = new Picture("images/photo.jpg");
        //change with selfie picture
                 
        selfie.explore();
        Pixel[] pixels = selfie.getPixels();
        int avgColor, minColor = 256, maxColor = -1;
        
        for (Pixel pixel : pixels) {
            avgColor = (pixel.getRed() + pixel.getGreen() + pixel.getBlue()) / 3;
            pixel.setColor(new Color(avgColor, avgColor, avgColor));
            if (avgColor < minColor)
                minColor = avgColor;
            if (avgColor > maxColor)
                maxColor = avgColor;
        }
        selfie.explore();
        
        
        /**
         * method 1 change
         * 
        
        int color;
        for (Pixel pixel : pixels) {
            color = pixel.getRed();
            if (color < 63)
                pixel.setColor(new Color(0, 0, 139));
            else if (color < 127)
                pixel.setColor(new Color(200, 0, 0));
            else if (color < 191)
                pixel.setColor(new Color(173, 216, 230));
            else
                pixel.setColor(new Color(250, 249, 246));
        }
        selfie.explore();
        */
        
       
       
        /**
         * method 2 change
         * 
        int color;
        int range = maxColor - minColor;
        for (Pixel pixel : pixels) {
            color = pixel.getRed();
            if (color < (minColor + range / 4))
                pixel.setColor(new Color(0, 0, 139));
            else if (color < (minColor + range * 2 / 4))
                pixel.setColor(new Color(200, 0, 0));
            else if (color < (minColor + range * 3 / 4))
                pixel.setColor(new Color(173, 216, 230));
            else
                pixel.setColor(new Color(246, 238, 227));
        }
        selfie.explore();
        */
        
        
        
        /**
         * custom color palette
         */
        int color;
        int range = maxColor - minColor;
        for (Pixel pixel : pixels) {
            color = pixel.getRed();
            if (color < (minColor + range / 4))
                pixel.setColor(new Color(126, 55, 165));
            else if (color < (minColor + range * 2 / 4))
                pixel.setColor(new Color(44, 150, 146));
            else if (color < (minColor + range * 3 / 4))
                pixel.setColor(new Color(198, 198, 6));
            else
                pixel.setColor(new Color(247, 150, 72));
        }
        selfie.explore();
        selfie.write("images/SFtry34jpg");
        
        
        
        
    }//main       
}//class
