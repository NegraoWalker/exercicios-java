package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysMaisVelho {

	public static void main(String[] args) {
/*Problema "mais_velho"
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.*/

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de pessoas: ");
		int n = input.nextInt();
		
		String[] nomes = new String[n];
		int[] idades = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %d pessoa: ",  i+1);
			System.out.println();
			System.out.println("Nome: ");
			nomes[i] = input.next();
			System.out.println("Idade: ");
			idades[i] = input.nextInt();
		}
		
		int maiorIdade = idades[0];
		int indiceNome = 0;
		
		System.out.println("Pessoa com maior idade: ");
		for (int i = 1; i < n; i++) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
				indiceNome = i;
			}
		}
		System.out.println(nomes[indiceNome]);
		
		
		
		input.close();
		
		
		
		
		
		
		
		
	}

}
