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
public class Calculadora {
     public double num1, num2, result;
    
    public Calculadora(){
        num1 = 0;
        num2 = 0;
        result = 0;
    }
    
    public void soma(double num1, double num2){
        result = num1+num2;
    }
    
    public void multiplica(double num1, double num2){
        result = (num1 * num2);
    }
    
    public void divide(double num1, double num2){
        result = num1/num2;
    }
    
    public void subtrai(double num1, double num2){
        result = num1-num2;
    }
    
    public double getResultado(){
        return result;
    }
}
