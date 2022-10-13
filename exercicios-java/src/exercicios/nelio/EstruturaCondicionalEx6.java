package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 6: Lista Estrutura Condicional - Nélio
* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
Entrada: 25.01
Saida: Intervalo (25,50]
*/
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		double num = input.nextDouble();
		
		if (num>=0 && num<=25) {
			System.out.print("Intervalo (0,25]");
		} else if(num>25 && num<=50) {
			System.out.print("Intervalo (25,50]");
		} else if(num>50 && num<=75) {
			System.out.print("Intervalo (50,75]");
		} else if(num>75 && num<=100) {
			System.out.print("Intervalo (75,100]");
		} else {
			System.out.print("Fora do intervalo!!");
		}
		
		
		input.close();
		
		
	}

}
