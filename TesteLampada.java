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
public class TesteLampada {
    public static void main(String[] args) {
       
        Lampada lamp = new Lampada();
        boolean valorAtual=lamp.verEstadoLampada();
            System.out.println(valorAtual);
        lamp.acenderLampada();
            System.out.println(lamp.verEstadoLampada());
        lamp.apagarLampada();
            System.out.println(lamp.verEstadoLampada());
        
    }
    
}
