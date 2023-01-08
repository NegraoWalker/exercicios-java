package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysAbaixoDaMedia {

	public static void main(String[] args) {
/*Problema "abaixo_da_media"
 *Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números: ");
		int n = input.nextInt();
		
		double[] array = new double[n];
		double soma=0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			array[i] = input.nextDouble();
			soma+=array[i];
		}
		
		double media = soma/n;
		System.out.printf("Média dos números: %.2f", media);
		System.out.println();
		
		System.out.println("Números abaixo da média: ");
		for (int i = 0; i < n; i++) {
			if (array[i] < media) {
				System.out.println(array[i]);
			}
		}
		
		input.close();
		
		
		
		
		
		
		
	}

}
