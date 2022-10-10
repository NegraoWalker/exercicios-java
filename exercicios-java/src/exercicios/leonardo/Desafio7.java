package exercicios.leonardo;

import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Desafio 7: User informa o nome dos dias da semana e o sistema informa
 * o valor númerico correspondente
 * domingo = 1
 * segunda = 2		
*/	
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o nome do dia da semana: ");
		String nomeDiaSemana = input.next();
		
		if (nomeDiaSemana.equalsIgnoreCase("Domingo")) {
			System.out.print("Dia da semana: " + 1);
		} else if(nomeDiaSemana.equalsIgnoreCase("Segunda-Feira")) {
			System.out.print("Dia da semana: " + 2);
		} else if(nomeDiaSemana.equalsIgnoreCase("Terça-Feira")) {
			System.out.print("Dia da semana: " + 3);
		} else if(nomeDiaSemana.equalsIgnoreCase("Quarta-Feira")) {
			System.out.print("Dia da semana: " + 4);
		} else if(nomeDiaSemana.equalsIgnoreCase("Quinta-Feira")) {
			System.out.print("Dia da semana: " + 5);
		} else if(nomeDiaSemana.equalsIgnoreCase("Sexta-Feira")) {
			System.out.print("Dia da semana: " + 6);
		} else if(nomeDiaSemana.equalsIgnoreCase("Sábado")) {
			System.out.print("Dia da semana: " + 7);
		} else {
			System.out.println("Nome não encontrado!!! Tente de novo");
		}
		
		
		
		input.close();
	}

}
