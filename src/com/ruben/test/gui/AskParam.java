package com.ruben.test.gui;



import com.ruben.test.graphicsObjects.Graphic;
import com.ruben.test.graphicsObjects.Robot;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 *
 * @author Ruben Salazar
 */
public class AskParam extends JFrame implements ActionListener{
    

    public AskParam(){
        setSize(500, 500);
        setBackground(Color.white);
        Window.botonEnviar = new JButton("Send");
        Window.botonEnviar.addActionListener((ActionListener) this);
        Window.instrucciones = new JTextArea();
        Window.instrucciones.setLineWrap(true);
        Window.etiqueta = new JLabel("Insert input for Robots: ");
        this.setLayout(new FlowLayout());
        this.setSize(500,200);
        this.add(Window.etiqueta);
        this.add(Window.instrucciones);
        this.add(Window.botonEnviar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
  
    }
    
    //Recogemos las instruccioens insertadas

    public void actionPerformed(ActionEvent e){
        String text = Window.instrucciones.getText();
        Window.instruccionesLeidas = text.split("\\r?\\n");
        
        // Tamaño de la ventana
        String tamano = Window.instruccionesLeidas[0];
        String[] splitedTamano = tamano.split("\\s+");
        //Cogemos la longitud X
        Window.tamanoX = Integer.valueOf(splitedTamano[0]);
        //Cogemos la altura Y
        Window.tamanoY = Integer.valueOf(splitedTamano[1]); 
        
        // Posicion e instrucciones Robot 1
        String posicionR1 = Window.instruccionesLeidas[1];
        String[] splitedPosicionRobot = posicionR1.split("\\s+");
        
        //Recogemos el tamaño X para el Robot1
        Window.xR = Integer.valueOf(splitedPosicionRobot[0]);
        //Recogemos el tamaño Y para el Robto1
        Window.yR = Integer.valueOf(splitedPosicionRobot[1]);
        
        //Recogemos las instrucciones para el Robot1
        String instr = Window.instruccionesLeidas[2];
        Window.instrR = instr;
        //Recogemos la posicion inicial del Robot1
        Window.posInicialR = splitedPosicionRobot[2];
        
        // Posicion e instrucciones Robot 2
        String posicionR2 = Window.instruccionesLeidas[3];
        String[] splitedPosicionRobot2 = posicionR2.split("\\s+");
        
        //Recogemos el tamaño X para el Robot2
        Window.xR2 = Integer.valueOf(splitedPosicionRobot2[0]);
        //Recogemos el tamaño Y para el Robto2
        Window.yR2 = Integer.valueOf(splitedPosicionRobot2[1]);
        //Recogemos las instrucciones para el Robot2
        String inst2 = Window.instruccionesLeidas[4];
        Window.instrR2 = inst2;
        //Recogemos la posicion inicial del Robot2
        Window.posInicialR2 = splitedPosicionRobot2[2];
        
        System.out.println("Tamaño x + y"+Window.tamanoX + " " + Window.tamanoY);
        System.out.println("Tamaño R1 x + y" + Window.xR + " " + Window.yR);
        System.out.println("Instrucciones R1 "+ Window.instrR);
        
        System.out.println("Tamaño x + y"+Window.tamanoX + " " + Window.tamanoY);
        System.out.println("Tamaño R2 x + y" + Window.xR2 + " " + Window.yR2);
        System.out.println("Instrucciones R2 "+ Window.instrR2);
         this.setVisible(false);
         // HAY QUE LLAMAR AL METODO WINDOW CALCULAR POSICION Y PASARLE PARAM A WINDOW PARA HACER EL VISUAL MANAGER DEL ROBOT
         Window ventana = new Window(Window.tamanoX, Window.tamanoY,
            Window.xR, Window.yR, Window.posInicialR, Window.posFinalR, Window.instrR,
            Window.xR2, Window.yR2, Window.posInicialR2, Window.posInicialR2, Window.instrR2);
         
         
    }

    

    
}
