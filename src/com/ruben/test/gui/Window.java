package com.ruben.test.gui;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Ruben Salazar
 */
public class Window {
    
    public static JButton botonEnviar;
    public static JTextArea instrucciones;
    public static JLabel etiqueta;
    public static String instruccionesLeidas[];
    public static int tamanoX;
    public static int tamanoY;
    public static int xR;
    public static int yR;
    public static String posInicialR;
    public static String posFinalR;
    public static String instrR;
    public static int xR2;
    public static int yR2;
    public static String posInicialR2;
    public static String posFinalR2;
    public static String instrR2;
   
    
    public Window(int t1, int t2,int x1, int y1, String posic1, String posicF1, String param1,
            int x2, int y2, String posic2, String posicF2, String param2){
        
        JFrame ventana = new JFrame();
        System.out.println("Tamaño del lienzo " + t1 + " " + t2);
        ventana.add(new VisualManager(t1,t2,x1,y1,x2,y2));
        ventana.setSize(600, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        AskParam ask = new AskParam();
    
    } // Termina el main
    
    public static void calcularPosicion(int x2X,int y2Y, String posInicialX, String instrX){
         // x robot
        xR = x2X;
        // y robot
        yR = y2Y;
        // posicion robot
        posInicialR = posInicialX;
        // posicion final robot
        posFinalR = "";
        //instrucciones
        instrR = instrX;
        
        //longitud instrucciones
        int longTotal = instrR.length();

        for (int i=0; i < longTotal;i++){
               
                    switch (instrR.substring(i,i+1)) {
                            case "L":
    //                               
                                    if(posInicialR.equals("N") && i==0){
                                        posFinalR = "Izquierda";
                                    }
                                    if(posInicialR.equals("E") && i==0){
                                        posFinalR = "Arriba";
                                    }
                                    if(posInicialR.equals("S") && i==0){
                                        posFinalR = "Derecha";
                                    }
                                    if(posInicialR.equals("O") && i==0){
                                        posFinalR = "Abajo";
                                    }

                                    // Cuando ya ha comenzado
                                    if(posFinalR.equals("Arriba") && i!=0){
                                        posFinalR = "Izquierda";
                                        break;
                                    }
                                     if(posFinalR.equals("Derecha") && i!=0){
                                        posFinalR = "Arriba";
                                        break;
                                    }
                                      if(posFinalR.equals("Abajo") && i!=0){
                                        posFinalR = "Derecha";
                                        break;
                                    }
                                       if(posFinalR.equals("Izquierda") && i!=0){
                                        posFinalR = "Abajo";
                                        break;
                                    }
                                    break;
                            case "M":
                                   if(posInicialR.equals("N") && i==0){
                                        yR++;
                                        posFinalR="Arriba";
                                    }
                                    if(posInicialR.equals("E") && i==0){
                                        xR++;
                                        posFinalR="Derecha";
                                    }
                                    if(posInicialR.equals("S") && i==0){
                                       yR--;
                                       posFinalR="Abajo";
                                    }
                                    if(posInicialR.equals("O") && i==0){
                                        xR--;
                                        posFinalR="Izquierda";
                                    }

                                    // Cuando ya ha comenzado
                                    if(posFinalR.equals("Izquierda") && i!=0){
                                        xR--;
                                    }
                                    if(posFinalR.equals("Derecha") && i!=0){
                                        xR++;
                                    }
                                    if(posFinalR.equals("Arriba") && i!=0){
                                        yR++;
                                    }
                                    if(posFinalR.equals("Abajo") && i!=0){
                                        yR--;
                                    }
                                    break;
                            case "R":
                                    if(posInicialR.equals("N") && i==0){
                                        posFinalR = "Derecha";
                                    }
                                    if(posInicialR.equals("E") && i==0){
                                        posFinalR = "Abajo";
                                    }
                                    if(posInicialR.equals("S") && i==0){
                                        posFinalR = "Izquierda";
                                    }
                                    if(posInicialR.equals("O") && i==0){
                                        posFinalR = "Arriba";
                                    }

                                    // Cuando ya ha comenzado
                                    if(posFinalR.equals("Arriba") && i!=0){
                                        posFinalR = "Derecha";
                                        break;
                                    }
                                     if(posFinalR.equals("Derecha") && i!=0){
                                        posFinalR = "Abajo";
                                        break;
                                    }
                                      if(posFinalR.equals("Abajo") && i!=0){
                                        posFinalR = "Izquierda";
                                        break;
                                    }
                                       if(posFinalR.equals("Izquierda") && i!=0){
                                        posFinalR = "Arriba";
                                        break;
                                    }
                                    break;
                            default:
                                    break;
                    } // Termina el switch
                    
            } // Termina el for
    } // termina método calcularPosicion()
    
}
