package exercicios.nelio;

import java.util.Scanner;

public class EstruturaForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 1: Lista Estrutura For - Nélio
* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
Entrada: 8
Saida:
1
3
5
7
*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int x = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i%2==0) {
				
			} else {
				System.out.println(i);
			}
			
		}
		
		input.close();
		
	}

}
