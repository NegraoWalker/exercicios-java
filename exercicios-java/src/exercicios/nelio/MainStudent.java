package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
/*Exercicio de Fixação 3 - Seção 8: 
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
resolver este problema
Entrada:
Alex Green
27.00
31.00
32.00
Saída:
FINAL GRADE: 90.00
PASS
*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Informe o nome do aluno: ");
		student.setName(input.nextLine());
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = input.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = input.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		double nota3 = input.nextDouble();
		
		student.finalMedia(nota1, nota2, nota3);
		
		
		input.close();
	}

}
