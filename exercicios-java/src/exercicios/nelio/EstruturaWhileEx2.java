package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Exercício 2: Lista Estrutura while - Nélio
*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double x=1;
		double y=1;
		
	while(x!=0 || y!=0) {
		System.out.print("Informe o valor de x: ");
		x = input.nextDouble();
		System.out.print("Informe o valor de y: ");
		y = input.nextDouble();
		
		if(x==0 || y==0) {
			break;
		} else if (x>0 && y>0) {
			System.out.print("Q1");
			System.out.println();
		} else if(x<0 && y>0) {
			System.out.print("Q2");
			System.out.println();
		} else if(x<0 && y<0) {
			System.out.print("Q3");
			System.out.println();
		} else if(x>0 && y<0) {
			System.out.print("Q4");
			System.out.println();
		}
	}
		input.close();
	}

}
