package exercicios.nelio;

import java.util.Scanner;

public class EstruturaCondicionalEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 1: Lista Estrutura Condicional - Nélio
*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*Entrada: -10
*Saida: Negativo
*/		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o número: ");
		int numero = input.nextInt();
		
		if (numero < 0) {
			System.out.print("Negativo!");
		} else {
			System.out.print("Positivo!");
		}
		
		input.close();
		
	}

}
