package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 5: Lista Estrutura Sequencial - Nélio
* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
Entrada:
12 1 5.30
16 2 5.10
Saida
Valor a pagar: R$15.50
 */
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Informe o código da peça 1: ");
		int peca1 = input.nextInt();
		System.out.print("Informe o número de peças da peça 1: ");
		int numeroPecas1 = input.nextInt();
		System.out.print("Informe o valor unitário da peça 1: ");
		double valorUnitarioPeca1 = input.nextDouble();
		
		System.out.print("Informe o código da peça 2: ");
		int peca2 = input.nextInt();
		System.out.print("Informe o número de peças da peça 2: ");
		int numeroPecas2 = input.nextInt();
		System.out.print("Informe o valor unitário da peça 2: ");
		double valorUnitarioPeca2 = input.nextDouble();
		
		double valorAPagarPeca1 = valorUnitarioPeca1*numeroPecas1;
		double valorAPagarPeca2 = valorUnitarioPeca2*numeroPecas2;
		
		double valorTotalAPagar = valorAPagarPeca1+valorAPagarPeca2;
		
		System.out.printf("Valor a pagar: R$%.2f",valorTotalAPagar);
		
		
		input.close();
	}

}
