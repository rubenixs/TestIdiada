
package com.ruben.test.gui;



import com.ruben.test.graphicsObjects.Graphic;
import com.ruben.test.graphicsObjects.Robot;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Ruben Salazar
 */
public class VisualManager extends JPanel {
    
    private ArrayList<Graphic> graphicList;
    public int x1, y1;
    public int x2, y2;
    public static Robot r1 ;
    public static Robot r2 ;
    public static Graphic g1 ;
    public static Graphic g2 ;
    
    
    public VisualManager(int x, int y, 
                int xR, int yR, 
                int xR2, int yR2, 
                String posf1, String posf2){
   
        r1 = new Robot(xR, yR,"r1");
        r2 = new Robot(xR2, yR2,"r2");
        setSize(x, y);
        setBackground(Color.black);
        String valuesFR1[] = posf1.split(" ");
        x1 = Integer.valueOf(valuesFR1[0]);
        y1 = Integer.valueOf(valuesFR1[1]);
        String valuesFR2[] = posf2.split(" ");
        x2 = Integer.valueOf(valuesFR1[0]);
        y2 = Integer.valueOf(valuesFR1[1]);
        graphicList = new ArrayList<Graphic>();
        
        
        graphicList.add(r1);
        graphicList.add(r2);
        
        JButton moveB = new JButton("Move");
        add(moveB);
        moveB.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
                g1 = graphicList.get(0);
                g2 = graphicList.get(1);
                
                moveB.setVisible(false);
                repaint();
                moveGraphics(x1,y1,x2,y2);
            }
        });
       
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        
        for(Graphic graphic : graphicList){
            graphic.draw(g);
        }
    }
    
    public void moveGraphics(int x, int y,int x2, int y2){
        
                g1.move(x,y);
  
                g2.move(x2,y2);
           
       
        
    }

    

    
}
