package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysMaiorPosicao {

	public static void main(String[] args) {
/*"maior_posicao"
 * Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero)*/		

		
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double maior = 0;
		int posicaoMaior = 0;
		
		System.out.println("Informe a quantidade de números? ");
		int N = input.nextInt();
		
		double[] array = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Digite o número %d: ", i+1);
			array[i] = input.nextDouble();
		}
		
		maior = array[0];

		for (int i = 1; i < N; i++) {
			if (array[i] > maior) {
				maior=array[i];
				posicaoMaior = i;
			}
		}
		
		System.out.println();
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior valor: " + posicaoMaior );
		
		
		input.close();
	}

}
