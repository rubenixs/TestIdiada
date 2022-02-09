package com.ruben.test.graphicsObjects;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben Salazar
 */
public class Graphic {

    protected Image imgGraphic;
    protected ImageIcon icon;
    protected int xCoord;
    protected int yCoord;
    
    public Graphic(int x, int y){
        xCoord = x;
        yCoord = y;
   }
    
  
    
    public void draw(Graphics g){
        if(imgGraphic != null){
            g.drawImage(imgGraphic, xCoord, yCoord, 80, 100, null);
        }
    }
    
}
