package exercicios.nelio;

import java.util.Scanner;

public class EstruturaCondicionalEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 2: Lista Estrutura Condicional - Nélio
*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*Entrada: 12
*Saida: PAR
*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int numero = input.nextInt();
		
		if (numero%2==0) {
			System.out.print("PAR!");
		} else {
			System.out.print("ÍMPAR!");
		}
		
		input.close();
		
	}

}
