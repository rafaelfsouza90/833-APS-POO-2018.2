package exercício1;

/**
 *
 * @author Rafael Ferreira de Souza
 */

import java.util.Scanner;

public class Caixa {
    public static void main(String[]args){
    Conta cc = new Conta();
    Scanner sc = new Scanner(System.in, "ISO-8859-1");
    System.out.println("Escolha uma opção: ");
    
    int op = sc.nextInt();
    
    switch(op){
        case 1: System.out.println("Digite o valor a sacar: ");
        float saque = sc.nextFloat();
        cc.sacar(saque);
        break;
        case 2: System.out.println("Digite o valor que deseja depositar");
        float deposito = sc.nextFloat();
        cc.depositar(deposito);
        System.out.println("Novo saldo: " + cc.consultar_Saldo());
        break;
        case 3: System.out.println("Saldo atual" + cc.consultar_Saldo());
        break;
        case 4: System.out.println("Sair da operação");
        break;
    }
    }
}
