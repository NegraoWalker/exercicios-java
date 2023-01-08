package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysNumerosPares {

	public static void main(String[] args) {
/*Problema "numeros_pares"
 *Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int pares = 0;
		
		System.out.println("Informe a quantidade de números? ");
		int N = input.nextInt();
		
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Digite o número %d: ", i+1);
			array[i] = input.nextInt();
		}
		System.out.println();
		System.out.println("Números pares: ");
		for (int i = 0; i < N; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
				pares++;
			}
		}
		System.out.println();
		System.out.println("Quantidade de pares: " + pares);
		
		input.close();
		
		
	}

}
