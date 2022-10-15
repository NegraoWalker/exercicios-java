package exercicios.nelio;

import java.util.Scanner;

public class EstruturaForEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Exercício 7: Lista Estrutura For - Nélio
*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de linhas: ");
		int linhas = input.nextInt();
		
		for (int i = 1; i <= linhas; i++) {
			System.out.printf("%d %d %d",i,i*i,i*i*i);
			System.out.println();
		}
		
		
		input.close();
	}

}
