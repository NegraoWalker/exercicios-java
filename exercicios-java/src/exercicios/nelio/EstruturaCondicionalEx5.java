package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 5: Lista Estrutura Condicional - Nélio
* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.

*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		final double ITEM1 = 4.00;
		final double ITEM2 = 4.50;
		final double ITEM3 = 5.00;
		final double ITEM4 = 2.00;
		final double ITEM5 = 1.50;
		
		System.out.print("Informe o código do item: ");
		int codigoItem = input.nextInt();
		
		System.out.print("Informe a quantidade do item: ");
		int quantidadeItem = input.nextInt();
		
		double total;
		switch (codigoItem) {
		case 1:
			total = quantidadeItem*ITEM1;
			System.out.printf("Total: R$%.2f",total);
			break;
		case 2:
			total = quantidadeItem*ITEM2;
			System.out.printf("Total: R$%.2f",total);
			break;
		case 3:
			total = quantidadeItem*ITEM3;
			System.out.printf("Total: R$%.2f",total);
			break;
		case 4:
			total = quantidadeItem*ITEM4;
			System.out.printf("Total: R$%.2f",total);
			break;
		case 5:
			total = quantidadeItem*ITEM5;
			System.out.printf("Total: R$%.2f",total);
			break;
		default:
			System.out.print("Código de item inválido!!");
			break;
		}
		
		input.close();
		
		
	}

}
