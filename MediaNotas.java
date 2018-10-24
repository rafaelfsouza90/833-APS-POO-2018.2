//Escrever um programa que calcume a média final do aluno.
// OBS: Usuário deve digitar as notas do 1º e 2º bimestre
// A nota do 1º bimestre tem peso 2 e a do 2º bimestre tem peso3
//=> Média ponderada <=
package medianotas;
import java.util.Scanner;
public class MediaNotas{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
              
        System.out.println("Digite a primeira nota: ");
        float nota1 = in.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float nota2 = in.nextFloat();
        
        float media = (nota1*2+nota2*3)/5;
       
        System.out.println("Média Final: " + media);
        
       
    }
    
}