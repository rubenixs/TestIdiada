package com.ruben.test.gui;



import com.ruben.test.graphicsObjects.Graphic;
import com.ruben.test.graphicsObjects.Robot;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author Ruben Salazar
 */
public class VisualManager extends JPanel{
    
    private ArrayList<Graphic> graphicList;
    
    public VisualManager(int x, int y, int xR, int yR, int xR2, int yR2){
        setSize(x, y);
        setBackground(Color.white);
        
        graphicList = new ArrayList<Graphic>();
       
        graphicList.add(new Robot(xR, yR));
        graphicList.add(new Robot(xR2, yR2));
        
        
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        for(Graphic graphic : graphicList){
            graphic.draw(g);
        }
    }
    

    
}
