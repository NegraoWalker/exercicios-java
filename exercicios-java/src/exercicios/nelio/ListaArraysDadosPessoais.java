package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysDadosPessoais {

	public static void main(String[] args) {
/*Problema "dados_pessoas"
 *Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas: ");
		int n = input.nextInt();
		
		double[] alturas = new double[n];
		char[] generos = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Pessoa %d", i+1);
			System.out.println();
			System.out.println("Altura: ");
			alturas[i] = input.nextDouble();
			System.out.println("Gênero (F) ou (M): ");
			generos[i] = input.next().charAt(0);
		}
		
		double maiorAltura = alturas[0];
		double menorAltura = alturas[0];
		
		for (int i = 1; i < n; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		
		System.out.println("Menos altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		
		
//		double[] mediaAlturasMulheres = new double[n];
		double soma = 0;
		int contadorMulheres = 0;
		int contadorHomens = 0;
		for (int i = 0; i < n; i++) {
			if (generos[i] == 'F') {
				soma+=alturas[i];
				contadorMulheres++;
			} else {
				contadorHomens++;
			}
		}
		
		double media = soma/contadorMulheres;
		System.out.printf("Média das alturas das mulheres: %.2f", media);
		System.out.println("Número de homens: " + contadorHomens);
		
		
		
		
		
		
		input.close();
		
		
		
	}

}
