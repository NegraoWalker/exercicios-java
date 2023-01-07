package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysSomaVetor {

	public static void main(String[] args) {
/*Problema "soma_vetor"
 *Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double soma = 0;
		
		System.out.println("Quantos números você vai digitar (máx 10)? ");
		int N = input.nextInt();
		 
		 double[] array = new double[N];
		
/*----------------------Entrada de dados-------------------------------*/
		for (int i = 0; i < N; i++) {
			System.out.println("Informe um número: ");
			array[i] = input.nextDouble();
			soma+=array[i];
		}
/*----------------------Saída de dados-------------------------------*/
		System.out.println("Array: ");
		for (double num : array) {
			System.out.println(num);
		}
		System.out.println();
		System.out.printf("Soma: %.2f", soma);
		double media = soma/N;
		System.out.println();
		System.out.printf("Média: %.2f", media);
		
		input.close();

	}

}
