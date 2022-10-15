package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 3: Lista Estrutura For - Nélio
* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5
*/		
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o número de casos de teste: ");
		int numeroTeste = input.nextInt();
		
		double valor1=0;
		double valor2=0;
		double valor3=0;
		double mediaPonderada=0;
		
		for (int i = 0; i < numeroTeste; i++) {
			System.out.print("Informe o primeiro valor: ");
			valor1 = input.nextDouble();
			System.out.print("Informe o primeiro valor: ");
			valor2 = input.nextDouble();
			System.out.print("Informe o primeiro valor: ");
			valor3 = input.nextDouble();
			
			mediaPonderada = ((valor1*2) + (valor2*3) + (valor3*5))/10;
			System.out.printf("Média Ponderada: %.1f",mediaPonderada);
			System.out.println();
			
		}
		
		input.close();
		
	}

}
