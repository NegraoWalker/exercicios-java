package exercicios.leonardo;

import java.util.Locale;
import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Desafio 5: Criar uma calculadora básica:
 * Ler numero 1 do user
 * Ler numero 2 do user
 * Ler a operação: + - / * %
 * Informar o calculo		
*/		
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Informe o primeiro número: ");
		double numero1 = input.nextDouble();
		System.out.print("Informe o segundo número: ");
		double numero2 = input.nextDouble();
		
		System.out.print("Informe o símbolo da operação desejada: ");
		char simboloOp = input.next().charAt(0);
		
		switch (simboloOp) {
		case '+':
			double resultado1 = numero1+numero2;
			System.out.printf("Resultado da Operação: %.2f", resultado1);
			break;
		case '-':
			double resultado2 = numero1-numero2;
			System.out.printf("Resultado da Operação: %.2f", resultado2);
			break;
		case '*':
			double resultado3 = numero1*numero2;
			System.out.printf("Resultado da Operação: %.2f", resultado3);
			break;
		case '/':
			double resultado4 = numero1/numero2;
			System.out.printf("Resultado da Operação: %.2f", resultado4);
			break;
		case '%':
			double resultado5 = numero1%numero2;
			System.out.printf("Resultado da Operação: %.2f", resultado5);
			break;
		default:
			break;
		}
		
		
		input.close();
		
		
	}

}
