package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 4: Lista Estrutura Sequencial - Nélio
*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
Entrada:
25
100
5.50
Saida:
Number = 25
Salary = U$ 550.00
*/
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe seu ID: ");
		int id = input.nextInt();
		
		System.out.print("Informe o número de horas trabalhadas: ");
		int horasTrabalhadas = input.nextInt();
		
		System.out.print("Informe o valor da hora de trabalho: ");
		double valorHora = input.nextDouble();
		
		double salario = horasTrabalhadas*valorHora;
		
		System.out.println("ID = " + id);
		System.out.printf("Salary = U$%.2f",salario);
		
		
		
		input.close();
		
		
		
	}

}
