package exercicios.leonardo;

public class Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Desafio 1: Convers�o de uma temperatura dada em Fahrenheit
 			para Celsius
 			
 			formula �C = (�F-32) * (5/9)
 			*/
		
		final double FATOR = 5.0/9.0;
		
		double f = 86;
		double c = (f - 32) * FATOR;
		
		System.out.println("Temperatura em graus Celsius: " + c + "�C");
		

	}

}
