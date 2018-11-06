/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício1;

/**
 *
 * @author Compartilhamento
 */
public class Lampada {
    public boolean estadoLampada=false;
    
    public void acenderLampada(){
        estadoLampada=true;
     
    }
    public void apagarLampada(){
        estadoLampada=false;
    }
    public boolean verEstadoLampada(){
        return estadoLampada;
    }
}
