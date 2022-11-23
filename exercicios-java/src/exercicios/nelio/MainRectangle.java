package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class MainRectangle {

	public static void main(String[] args) {
		/*Exercicio de Fixação 1 - Seção 8: 
		 * Fazer um programa para ler os valores da largura e altura
		de um retângulo. Em seguida, mostrar na tela o valor de
		sua área, perímetro e diagonal. Usar uma classe como
		mostrado no projeto ao lado.
		Entrada: 
		3.00 
		4.00
		Saída: 
		Area:12.00
		Perimeter:14.00
		Diagonal:5.00*/
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rectangle.setWidth(input.nextDouble());
		
		System.out.println("Enter rectangle height: ");
		rectangle.setHeight(input.nextDouble());
		
		System.out.printf("AREA = %.2f", rectangle.area());
		System.out.println();
		System.out.printf("PERIMETER = %.2f", rectangle.perimeter());
		System.out.println();
		System.out.printf("DIAGONAL = %.2f", rectangle.diagonal());
		
		input.close();

	}

}
