/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício1;

//import exercício1.Calculadora;
import java.util.Scanner;

/**
 *
 * @author nelsonfonseca
 */
public class Calcula {
    public static void main (String[]args){
        Scanner in = new Scanner (System.in);
        Calculadora calc = new Calculadora();
        System.out.println ("Escolha uma opçao: ");
        int opcao = 0;
        while (opcao<1 || opcao>4)
        {
        System.out.println("Calculadora");
        System.out.println("1 - Soma");
        System.out.println("2 - Multiplica");
        System.out.println("3 - Divide");
        System.out.println("4 - Subtrai");
        opcao=in.nextInt();
        }
        switch(opcao){
            case 1: System.out.println (" Soma ");
                System.out.println ("Insira um numero: ");
                Double num1 = in.nextDouble();
                System.out.println ("Insira o segundo numero: ");
                Double num2 = in.nextDouble();
                calc.soma(num1, num2);
                System.out.println ("Total: "+calc.getResultado());
                break;
            case 2: System.out.println (" Multiplica ");
                System.out.println ("Insira um numero: ");
                num1 = in.nextDouble();
                System.out.println ("Insira o segundo numero: ");
                num2 = in.nextDouble();
                calc.multiplica(num1, num2);
                System.out.println ("Total: "+calc.getResultado());
                break;
            case 3: System.out.println (" Divide ");
                System.out.println ("Insira um numero: ");
                num1 = in.nextDouble();
                System.out.println ("Insira o segundo numero: ");
                num2 = in.nextDouble();
                calc.divide(num1, num2);
                System.out.println ("Total: "+calc.getResultado());

                break;
            case 4: System.out.println (" Subtrai ");
                System.out.println ("Insira um numero: ");
                num1 = in.nextDouble();
                System.out.println ("Insira o segundo numero: ");
                num2 = in.nextDouble();
                calc.subtrai(num1, num2);
                System.out.println ("Total: "+calc.getResultado());
            break;
            default:
        } 
        
        
    }
    
}