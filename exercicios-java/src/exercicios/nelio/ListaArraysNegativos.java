package exercicios.nelio;

import java.util.Scanner;

public class ListaArraysNegativos {

	public static void main(String[] args) {
/*Problema "negativos":
 *Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */		
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("Quantos números você vai digitar (máx 10)? ");
		int N = input.nextInt();

/*----------------------Entrada de dados-------------------------------*/
		for (int i = 0; i < N; i++) {
			System.out.println("Informe um número: ");
			array[i] = input.nextInt();
		}
/*----------------------Sáida de dados-------------------------------*/
		System.out.println("Números negativos: ");
		for (int num : array) {
			if (num < 0) {
				System.out.println(num);
			}
		}
		input.close();
	}

}
