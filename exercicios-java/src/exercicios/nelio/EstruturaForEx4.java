package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Exercício 4: Lista Estrutura For - Nélio
*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"
*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o número de casos de teste: ");
		int numeroTeste = input.nextInt();
		
		int valor1=0;
		int valor2=0;
		double divisao=0;
		
		for (int i = 0; i < numeroTeste; i++) {
			System.out.print("Informe o primeiro valor: ");
			valor1 = input.nextInt();
			System.out.print("Informe o primeiro valor: ");
			valor2 = input.nextInt();
			
			if(valor2==0) {
				System.out.println("Divisão impossível!!");
			}else {
				divisao = (double) valor1/valor2;
				System.out.printf("Valor da divisão: %.1f",divisao);
				System.out.println();
			}
			
		}
		
		input.close();
		
		
	}

}
