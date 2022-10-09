package exercicios.leonardo;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Desafio 2: Receber 3 salários e calcular a média.
 			*O user pode digitar com separador vírgula ou ponto => Vou usar o
 			*método replaceAll()
 			*Temos que receber no formato de String e converter => Usei o 
 			*parseDouble
 			*Para mudar de , para . usei o Locale para US
 			*/
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro salário: ");
		String salario1 = input.next().replaceAll(",", ".");
		System.out.print("Digite o valor do primeiro salário: ");
		String salario2 = input.next().replaceAll(",", ".");
		System.out.print("Digite o valor do primeiro salário: ");
		String salario3 = input.next().replaceAll(",", ".");
		
		double salario1Novo = Double.parseDouble(salario1);
		double salario2Novo = Double.parseDouble(salario2);
		double salario3Novo = Double.parseDouble(salario3);
		
		Locale.setDefault(Locale.US);
		
		double mediaSalarios = (salario1Novo + salario2Novo + salario3Novo)/3;
		
		System.out.printf("A média é: %.2f", mediaSalarios);
		
		input.close();
		
		
		
		
		
		
	}
	

}
