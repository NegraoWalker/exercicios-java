package exercicios.leonardo;

import java.util.Locale;

public class Desafio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Desafio3:Resolver a equação abaixo:
 * a = [6*(3+2)]^2
 * b = a/(3*2)
 * c = ((1-5)*(2-7))/2
 * d = c^2
 * e = (b - d)^3
 * f = 10^3
 * resultado = e/f
 * Vou usar o pacote Math para realizar a potenciação
 * 
 * */
		Locale.setDefault(Locale.US);
		
		double a = Math.pow(6*(3+2), 2);
		double b = a/(3*2);
		double c = ((1-5)*(2-7))/2;
		double d = Math.pow(c, 2);
		double e = Math.pow((b-d), 3);
		double f = Math.pow(10, 3);
		
		double resultado = e/f;
		
		System.out.printf("Resultado: %.0f",resultado);
		
		
		
		
		
	}

}
