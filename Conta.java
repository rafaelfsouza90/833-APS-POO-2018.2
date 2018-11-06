/*
 * Criar uma classe correspondente a uma Conta de Banco 
   A classe terá como atributos nome, numero da conta, saldo 
   Terá os métodos sacar,depositar, consultar saldo, consultar nome, alterar nome onde:
   –Sacar -> Diminui o valor sacado do valor do saldo 
   –Depositar -> Soma o valor depositado com o valor do saldo 
   –Consultar Saldo -> Retorna o valor do salto atual 
   –Consultar Nome -> Retorna o nome atual 
   –Alterar Nome -> Altera o nome cadastrado 
   Saldo inicial será de 100 reais.
 */

package exercício1;

public class Conta {
    String nome = " ";
    int conta = 2134;
    float saldo = 100;  
    
    public void sacar(float valor){
        saldo = saldo - valor;
    }
    public void depositar(float valor){
        saldo = saldo + valor;
    }
    public float consultar_Saldo(){
        return saldo;
    }
    public String consultar_Nome(){
        return nome;
    }
    public void alterar_Nome(String nomeNovo){
        nome = nomeNovo;
    }
}
