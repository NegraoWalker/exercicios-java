package exercicios.nelio;

import java.util.Scanner;

public class EstruturaForEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Exercício 6: Lista Estrutura For - Nélio
*Ler um número inteiro N e calcular todos os seus divisores.
*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		
		input.close();
	}

}
