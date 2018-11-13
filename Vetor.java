// Escreva um programa que receba um vetor com 5 números inteiros. Em seguida,
// determine e imprima na tela o maior elemento par do vetor (se houver), 
// o menor elemento ímpar do vetor (se houver), o somatório dos elementos
// do vetor (se houver), o somatório dos elementos do vetor e a média. 

package exercício1;
import java.util.Scanner;
/**
 *
 * @author Rafael Ferreira de Souza
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];
        for(int i=0;i<5;i++){
            
            System.out.println("Digite: ");
            vetor[i]=sc.nextInt();
        }
        for (int i=0;i<5;i++){               
            System.out.println(vetor[i]);
        }
        
        
    }
    
}
