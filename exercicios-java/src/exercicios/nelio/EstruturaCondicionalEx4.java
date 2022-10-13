package exercicios.nelio;

import java.util.Scanner;

public class EstruturaCondicionalEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 4: Lista Estrutura Condicional - Nélio
* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
Entrada:16 2
Saida: O JOGO DUROU 10 HORA(S)
*/		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o horário de inicio do jogo: ");
		int horaInicial = input.nextInt();
		System.out.print("Informe o horário que finalizou o jogo: ");
		int horaFinal = input.nextInt();
		
		int duracaoJogo;
		
		if (horaInicial>horaFinal) {
			duracaoJogo = 24 - horaInicial + horaFinal;
			System.out.printf("O jogo durou %d hora(s)",duracaoJogo);
		} else if(horaFinal>horaInicial) {
			duracaoJogo = horaFinal - horaInicial;
			System.out.printf("O jogo durou %d hora(s)",duracaoJogo);
		} else if(horaFinal==0 && horaInicial==0) {
			System.out.printf("O jogo durou 24 hora(s)");
		}
		else {
			System.out.printf("O jogo tem duração mínima de 1 hora e máxima de 24 horas!! Entre com outros valores!!");
		}
		
		input.close();
		
		
	}

}
