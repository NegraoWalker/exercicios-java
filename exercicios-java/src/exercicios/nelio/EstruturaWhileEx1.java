package exercicios.nelio;

import java.util.Scanner;

public class EstruturaWhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
/* Exercício 1: Lista Estrutura while - Nélio
* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
Entrada: 2200
Saida: Senha Inválida
*/
		
		Scanner input = new Scanner(System.in);
		
		int senha = 0;
		
		while(senha!=2002) {
			System.out.print("Informe a senha: ");
			senha = input.nextInt();
			if(senha==2002) {
				break;
			}
			System.out.println("Senha Inválida!!");
			System.out.println();
		}
		
		System.out.println("Acesso Permitido!!");
		
		input.close();
		
	}

}
