package exercicios.nelio;

import java.util.Scanner;

public class EstruturaSequencialEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* Exercício 3: Lista Estrutura Sequencial - Nélio
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
Entrada:
5
6
7
8
Saida: Diferença = -26
*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor de A: ");		
		int a = input.nextInt();
		System.out.print("Informe o valor de B: ");	
		int b = input.nextInt();
		System.out.print("Informe o valor de C: ");	
		int c = input.nextInt();
		System.out.print("Informe o valor de D: ");	
		int d = input.nextInt();
		
		int diferenca = ((a*b) - (c*d));
		
		System.out.print("Diferença = " + diferenca);
		input.close();

	}

}
