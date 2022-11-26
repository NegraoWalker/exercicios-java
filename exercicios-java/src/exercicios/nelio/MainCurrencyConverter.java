package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class MainCurrencyConverter {

	public static void main(String[] args) {
/*Exercicio de Fixação Aula 72- Seção 8: 
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
para ser responsável pelos cálculos.
Entrada:
What is the dollar price? 3.10
How many dollars will be bought? 200.00
Saída:
Amount to be paid in reais = 657.20
*/

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.println("What is the dollar price? ");
		converter.setPriceDollar(input.nextDouble());
		
		System.out.println("How many dollars will be bought? ");
		converter.setQuantityDollarInReal(input.nextDouble());
		
		converter.currencyConverterDollarInReal();
		
		input.close();
		
	}

}
