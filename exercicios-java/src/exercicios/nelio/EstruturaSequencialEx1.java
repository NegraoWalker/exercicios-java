package exercicios.nelio;

import java.util.Scanner;

public class EstruturaSequencialEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 1: Lista Estrutura Sequencial - Nélio
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
Entrada: 10
		 30
Saída: Soma = 40
 */
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Informe o primeiro valor: ");
	int valor1 = input.nextInt();
	System.out.print("Informe o primeiro valor: ");
	int valor2 = input.nextInt();
	
	int soma = valor1+valor2;
	
	System.out.print("Soma = " + soma);
	
	
	
	
	input.close();
		
		
		
	}

}
