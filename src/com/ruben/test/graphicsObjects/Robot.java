package com.ruben.test.graphicsObjects;


import java.awt.Graphics;
import javax.swing.ImageIcon;
/**
 *
 * @author Ruben Salazar
 */
public class Robot extends Graphic{
    
    public Robot(int x, int y) {
        super(x, y);
        icon = new ImageIcon(getClass().getResource("/images/robot.png"));
        imgGraphic = icon.getImage();
    }
    
    
    
    @Override
    public void draw(Graphics g){
        g.drawImage(imgGraphic, xCoord, yCoord, 80, 110, null);
    }
    
}
