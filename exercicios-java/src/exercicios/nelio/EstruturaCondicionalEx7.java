package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 7: Lista Estrutura Condicional - Nélio
* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação
Entrada:4.5 -2.2
Saida: Q4
*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o valor de x: ");
		double x = input.nextDouble();
		System.out.print("Informe o valor de y: ");
		double y = input.nextDouble();
		
		if (x>0 && y>0) {
			System.out.print("Q1");
		} else if(x<0 && y>0) {
			System.out.print("Q2");
		} else if(x<0 && y<0) {
			System.out.print("Q3");
		} else if(x>0 && y<0) {
			System.out.print("Q4");
		} else if(x==0 && y!=0) {
			System.out.print("Eixo Y");
		} else if(y==0 && x!=0) {
			System.out.print("Eixo X");
		} else if(x==0 && y==0) {
			System.out.print("Origem");
		}else {
			System.out.print("Informe valores válidos!!");
		}
		
		input.close();
		
		
	}

}
