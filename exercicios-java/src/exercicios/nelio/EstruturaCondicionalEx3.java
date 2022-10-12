package exercicios.nelio;

import java.util.Scanner;

public class EstruturaCondicionalEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 3: Lista Estrutura Condicional - Nélio
* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente
Entrada:
6 24
Saida:
São Multíplos!!
*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int num1 = input.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = input.nextInt();
		
		if (num1>num2 && num1%num2==0) {
			System.out.print("Multíplos!!");
		} else if(num2>num1 && num2%num1==0 ) {
			System.out.print("Multíplos!!");
		}
		else {
			System.out.print("Não são Multíplos!!");
		}
		
		
		input.close();
		
	}

}
