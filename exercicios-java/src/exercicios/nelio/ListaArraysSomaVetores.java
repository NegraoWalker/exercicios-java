package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysSomaVetores {

	public static void main(String[] args) {
/*soma_vetores
 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado.*/

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números? ");
		int N = input.nextInt();
		
		int[] arrayA = new int[N];
		int[] arrayB = new int[N];
		int[] arrayC = new int[N];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < N; i++) {
			arrayA[i] = input.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for (int i = 0; i < N; i++) {
			arrayB[i] = input.nextInt();
		}
		
		System.out.println("Vetor C: ");
		for (int i = 0; i < N; i++) {
			arrayC[i] = arrayA[i] + arrayB[i];
			System.out.println(arrayC[i]);
		}
		
		input.close();
		
		
		
		
		
	}

}
