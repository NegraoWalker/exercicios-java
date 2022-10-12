package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/* Exercício 6: Lista Estrutura Sequencial - Nélio
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada:
3.0 4.0 5.2
Saida:
triângulo: 7.800
círculo: 84.949
trapézio: 18.200
quadrado: 16.000
retângulo: 12.000
 */
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		
		System.out.print("Informe o valor de A: ");
		double a = input.nextDouble();
		System.out.print("Informe o valor de B: ");
		double b = input.nextDouble();
		System.out.print("Informe o valor de C: ");
		double c = input.nextDouble();
		
		double areaTriangulo = (a*c)/2;
		double areaCirculo = PI*Math.pow(c, 2);
		double areaTrapezio = (a+b)*c/2;
		double areaQuadrado = b*b;
		double areaRetangulo = a*b;
		
		System.out.printf("Triângulo: %.3f",areaTriangulo);
		System.out.println();
		System.out.printf("Círculo: %.3f",areaCirculo);
		System.out.println();
		System.out.printf("Trapézio: %.3f",areaTrapezio);
		System.out.println();
		System.out.printf("Quadrado: %.3f",areaQuadrado);
		System.out.println();
		System.out.printf("Retângulo: %.3f",areaRetangulo);
		
		input.close();
		
		
	}

}
