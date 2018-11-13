// Criar uma terceira matriz que é a matriz soma das anteriores e imprimí-laao final.
//Como vou somar os elementos da matriz?

package exercício2;

public class Matriz {

      public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
		int[ ][ ] matriz1 = new int[2][2];
		for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
		System.out.println("Digite a primeira matriz: ");
		matriz1[i][j]=sc.nextInt();
		}
		}
		for (int i = 0; i < 2; i++) {
			System.out.println("");
		for (int j = 0; j < 2; j++)
		System.out.print(matriz1[i][j] + " ");
		}
		System.out.println("");
		
		
		
	int[ ][ ] matriz2 = new int[2][2];
	for (int i = 0; i < 2; i++) {
	for (int j = 0; j < 2; j++) {
	System.out.println("Digite a segunda matriz: ");
	matriz2[i][j]=sc.nextInt();
	}
	}
	
	for (int i = 0; i < 2; i++) {
		System.out.println("");
	for (int j = 0; j < 2; j++)
	System.out.print(matriz2[i][j] + " ");
	}
	System.out.println("");

	
	int[][] matrizfinal = new int[2][2];
	
	for (int i = 0; i < 2; i++) {
	for (int j = 0; j < 2; j++) {
		
		matrizfinal[i][j] = matriz1[i][j]+matriz2[i][j];
		
	
	 }
	}
	
	System.out.println("\n\n-------------------------------------");
	System.out.println("O resultado das somas das matrizes é:");
	for (int i = 0; i < 2; i++) {
		System.out.println("");
		for (int j = 0; j < 2; j++) {
		System.out.print(matrizfinal[i][j]);
			}
		}

	}
    
}
