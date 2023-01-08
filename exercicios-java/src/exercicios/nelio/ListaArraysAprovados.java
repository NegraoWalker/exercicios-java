package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ListaArraysAprovados {

	public static void main(String[] args) {
/*Problema "aprovados"
 *Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de alunos: ");
		int n = input.nextInt();
		
		String[] nomesAlunos = new String[n];
		double[] notasAlunos1Semestre = new double[n];
		double[] notasAlunos2Semestre = new double[n];
		double[] mediaNotas = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Digite o nome, a primeira e segunda nota do aluno%d", i+1);
			System.out.println();
			System.out.println("Nome: ");
			nomesAlunos[i] = input.next();
			System.out.println("Nota 1 semestre: ");
			notasAlunos1Semestre[i] = input.nextDouble();
			System.out.println("Nota 2 semestre: ");
			notasAlunos2Semestre[i] = input.nextDouble();
			
			mediaNotas[i] = (notasAlunos1Semestre[i] + notasAlunos2Semestre[i])/2;
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i = 0; i < n; i++) {
			if (mediaNotas[i] >= 6) {
				System.out.println(nomesAlunos[i]);
			}
		}
		
		
		input.close();
		
		
		
		
	}

}
