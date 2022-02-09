package com.ruben.test.gui;


import javax.swing.JFrame;

/**
 *
 * @author Ruben Salazar
 */
public class Window {
    
    public Window(){
        
        JFrame ventana = new JFrame();
        ventana.add(new VisualManager());
        ventana.setSize(1000, 1000);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Window ventana = new Window();
        
       
        
    } // Termina el main
    
    public void calcularPosicion(){
         // x robot
        int x2 = 1;
        // y robot
        int y2 = 2;
        // posicion robot
        String posInicial = "N";
        // posicion final robot
        String posFinal = "";
        //instrucciones
        String instr = "LMLMLMLMM";
        
        //longitud instrucciones
        int longTotal = instr.length();

        for (int i=0; i < longTotal;i++){
               
                    switch (instr.substring(i,i+1)) {
                            case "L":
    //                               
                                    if(posInicial.equals("N") && i==0){
                                        posFinal = "Izquierda";
                                    }
                                    if(posInicial.equals("E") && i==0){
                                        posFinal = "Arriba";
                                    }
                                    if(posInicial.equals("S") && i==0){
                                        posFinal = "Derecha";
                                    }
                                    if(posInicial.equals("O") && i==0){
                                        posFinal = "Abajo";
                                    }

                                    // Cuando ya ha comenzado
                                    if(posFinal.equals("Arriba") && i!=0){
                                        posFinal = "Izquierda";
                                        break;
                                    }
                                     if(posFinal.equals("Derecha") && i!=0){
                                        posFinal = "Arriba";
                                        break;
                                    }
                                      if(posFinal.equals("Abajo") && i!=0){
                                        posFinal = "Derecha";
                                        break;
                                    }
                                       if(posFinal.equals("Izquierda") && i!=0){
                                        posFinal = "Abajo";
                                        break;
                                    }
                                    break;
                            case "M":
                                   if(posInicial.equals("N") && i==0){
                                        y2++;
                                        posFinal="Arriba";
                                    }
                                    if(posInicial.equals("E") && i==0){
                                        x2++;
                                        posFinal="Derecha";
                                    }
                                    if(posInicial.equals("S") && i==0){
                                       y2--;
                                       posFinal="Abajo";
                                    }
                                    if(posInicial.equals("O") && i==0){
                                        x2--;
                                        posFinal="Izquierda";
                                    }

                                    // Cuando ya ha comenzado
                                    if(posFinal.equals("Izquierda") && i!=0){
                                        x2--;
                                    }
                                    if(posFinal.equals("Derecha") && i!=0){
                                        x2++;
                                    }
                                    if(posFinal.equals("Arriba") && i!=0){
                                        y2++;
                                    }
                                    if(posFinal.equals("Abajo") && i!=0){
                                        y2--;
                                    }
                                    break;
                            case "R":
                                    if(posInicial.equals("N") && i==0){
                                        posFinal = "Derecha";
                                    }
                                    if(posInicial.equals("E") && i==0){
                                        posFinal = "Abajo";
                                    }
                                    if(posInicial.equals("S") && i==0){
                                        posFinal = "Izquierda";
                                    }
                                    if(posInicial.equals("O") && i==0){
                                        posFinal = "Arriba";
                                    }

                                    // Cuando ya ha comenzado
                                    if(posFinal.equals("Arriba") && i!=0){
                                        posFinal = "Derecha";
                                        break;
                                    }
                                     if(posFinal.equals("Derecha") && i!=0){
                                        posFinal = "Abajo";
                                        break;
                                    }
                                      if(posFinal.equals("Abajo") && i!=0){
                                        posFinal = "Izquierda";
                                        break;
                                    }
                                       if(posFinal.equals("Izquierda") && i!=0){
                                        posFinal = "Arriba";
                                        break;
                                    }
                                    break;
                            default:
                                    break;
                    } // Termina el switch
                    
            } // Termina el for
    } // termina método calcularPosicion()
    
}
