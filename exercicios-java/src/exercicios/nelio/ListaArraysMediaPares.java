package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysMediaPares {

	public static void main(String[] args) {
/*Problema "media_pares"
 *Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Informe a quantidade de números: ");
		int n = input.nextInt();
		
		int[] array = new int[n];
		int soma=0;
		int contador = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			array[i] = input.nextInt();
			if(array[i] % 2 == 0) {
				soma+=array[i];
				contador++;
			}	
		}
		double media = (double) soma/n;
		
		if (contador > 0) {
			System.out.printf("Média dos números pares: %.2f", media);
		} else {
			System.out.println("Nenhum número par digitado!!");
		}
		
		
		input.close();
		
		
	}

}
