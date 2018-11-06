/*
* Utilizar mesmo exercício da aula passada 
* Nele, verificar a situação do aluno (Aprovado ou em Recuperação), sendo a média 7. 
* Ao final, exibir no console a situação do aluno 
 */
package exercício1;
import java.util.Scanner;
public class Exercício1 {

    
    public static void main(String[] args) {
                
    double av1, av2, media;
    Scanner in = new Scanner (System.in);
    
        System.out.print ("Insira a primeira nota: ");
            av1 = 2 * in.nextDouble();
        System.out.print ("Insira a segunda nota: ");
            av2 = 3 * in.nextDouble();
            media = (av1+av2)/5;
        System.out.println ("Média final: " +media);
        
            if(media>=7){
                System.out.println ("Você foi aprovado.");
            }else{
                    System.out.println("Você não foi aprovado");
            
        } 
    }   
    
}
