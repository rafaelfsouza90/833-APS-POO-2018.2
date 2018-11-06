/*
 * Após a execução deste trecho de código, os valores de cont1, cont2 e cont3 serão, respectivamente
 */
package exercício2;

/**
 *
 * @author Rafael Ferreira de Souza
 */
public class Cont123 {
    public static void main(String[] args) {
        int cont1 = 3;
        int cont2 = 2;
        int cont3 = 1;
        cont1 += cont3++;
        cont1 -= cont2;
        cont3 = cont2++;
        
        System.out.println("cont1: " + cont1 );
        System.out.println("cont2: " + cont2);
        System.out.println("cont3: " + cont3);
    }
}
