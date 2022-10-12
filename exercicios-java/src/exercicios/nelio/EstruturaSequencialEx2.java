package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 2: Lista Estrutura Sequencial - Nélio
 *Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
Entrada: 2.00
Saída: A = 12.5664
*/
		
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		final double PI = 3.14159;
		
		System.out.print("Informe o raio: ");
		double raio = input.nextDouble();
		
		double area = PI*Math.pow(raio, 2);
		
		System.out.printf("A = %.4f",area);
		
		input.close();
		
		
		
		
	}

}
