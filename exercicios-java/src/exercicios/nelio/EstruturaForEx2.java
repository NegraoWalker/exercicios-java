package exercicios.nelio;

import java.util.Scanner;

public class EstruturaForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 2: Lista Estrutura For - Nélio
* Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
*/
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Informe a quantidades de valores inteiros a serem lidos: ");
		int x = input.nextInt();
		int valor=0;
		int quantidadeIn = 0;
		int quantidadeOut = 0;
		
		for (int i = 0; i < x; i++) {
			System.out.print("Informe o valor: ");
			valor=input.nextInt();
			
			if (valor>=10 && valor<=20) {
				quantidadeIn++;
			} else {
				quantidadeOut++;
			}
		}
		System.out.println();
		System.out.print("Quantidade de valores in: "+ quantidadeIn);
		System.out.println();
		System.out.print("Quantidade de valores out: "+ quantidadeOut);
		
		input.close();
	}

}
