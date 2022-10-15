package exercicios.nelio;

import java.util.Scanner;

public class EstruturaForEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 5: Lista Estrutura For - Nélio
* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = input.nextInt();
		int fatorial=1;
		
		for (int i = numero; i >= 1; i--) {
			fatorial*=i;
		}
		System.out.printf("%d! = %d",numero,fatorial);
		
		input.close();
		
		
		
	}

}
