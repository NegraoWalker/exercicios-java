package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysAlturasMain {

	public static void main(String[] args) {
/*Problema "alturas"
 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.*/

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double somaAlturas=0;
		int idadesPorcentagem = 0;
		
		System.out.println("Quantas pessoas? ");
		int N = input.nextInt();
		
		ListaArraysAlturas[] array = new ListaArraysAlturas[N]; //Instanciando um array de objetos
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Dados da pessoa %d:", i+1);
			System.out.println();
			System.out.println("Nome: ");
			String nome = input.next(); //Nunca mais usar NextLine para receber dados!!!!!
			System.out.println("Idade: ");
			int idade = input.nextInt();
			System.out.println("Altura: ");
			double altura = input.nextDouble();
			
			array[i] = new ListaArraysAlturas(nome, idade, altura); //Instanciando o construtor para passar os atributos
			somaAlturas += array[i].getAltura(); //Somando as alturas
		}
		double alturaMedia = somaAlturas/N;
		System.out.printf("Altura média: %.2f", alturaMedia);
		System.out.println();
		
		for (int i = 0; i < N; i++) {
			if (array[i].getIdade() < 16) {
				idadesPorcentagem++;
			}
		}
		
		System.out.println(array[0].getNome());
		
		double valorIdadesPorcentagem = ((double) idadesPorcentagem/N)*100;
		System.out.println("Pessoas com idade inferior a 16 anos: " + valorIdadesPorcentagem + "%");
		System.out.println("Nomes das pessoas com idade inferior a 16 anos:");
		for (int i = 0; i < N; i++) {
			if (array[i].getIdade() < 16) {
				System.out.println(array[i].getNome());
			}
		}
		
		
		input.close();
		
		
	}

}
