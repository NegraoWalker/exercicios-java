package exercicios.leonardo;

import java.util.Locale;
import java.util.Scanner;

public class Desafio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Desafio 8: User informa uma nota válida entre 0 e 10 e armazenar em uma
 * variável total. Isso vai ser rodado até o usuário digitar -1.
 * No final temos que informar a média e a quantidade de notas informadas;
 */
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		int contador = 0;
		int condicao = 0;
		
		
		
		
		while(condicao!=-1) {
			System.out.print("Informe uma nota válida: ");
			double nota = input.nextDouble();
			if (nota>=0 && nota<=10) {
				total+= nota;
				contador++;
			}
			
			System.out.println("Digite -1 para sair do sistema ou 0 para continuar: ");
			condicao += input.nextInt();
			
			
		}
		
		double media = total/contador;
		System.out.printf("A média das notas é: %.2f",media);
		System.out.println();
		System.out.print("O número de notas cadastradas foi: "+contador);
		
		
		
		
		input.close();
		
		
	}

}
