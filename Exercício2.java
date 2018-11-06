/*
 * Crie um programa em Java que peça para o usuário digitar uma frase,
 * e logo em seguida informa a quantidade de letras digitadas,
 * e quantas letras ‘a’ tem na frase
 */
package exercício2;
import java.util.Scanner;
/**
 *
 * @author Compartilhamento
 */
public class Exercício2 {
    public static void main(String[] args) {
    
        System.out.println ("Digite uma frase para contagem \"a\": ");
            Scanner in = new Scanner (System.in);
            String quantidade = in.nextLine();
            int qtoficial = quantidade.length();
            
            System.out.println ("Esta frase contém \""+qtoficial+"\" letras.");
            String letraA = quantidade;
                int total = qtoficial;
                int cont=0;
                for (int i=0; i<letraA.length();i++){
                    if (('a' == letraA.charAt(i)) || ('A'==letraA.charAt(i))){
                    cont++;
                    }
                }
            System.out.println ("O total de letras A em sua frase é de: "+cont);    
    }
}
