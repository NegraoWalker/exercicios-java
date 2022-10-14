package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhileEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Exercício 3: Lista Estrutura while - Nélio
* Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo
*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int codigo = 0;
		int a = 0;
		int g = 0;
		int d = 0;
		
		while(codigo!=4) {
			System.out.print("Informe o código do produto: ");
			codigo = input.nextInt();
			
			if(codigo==4) {
				break;
			}
			
			if(codigo==1) {
				a++;
			} else if(codigo==2) {
				g++;
			} else if(codigo==3) {
				d++;
			} else {
				System.out.print("Informe um código válido!!");
				System.out.println();
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.print("Muito Obrigado!!");
		System.out.println();
		System.out.println();
		
		System.out.printf("Álcool: %d",a);
		System.out.println();
		
		System.out.printf("Gasolina: %d",g);
		System.out.println();
		
		System.out.printf("Diesel: %d",d);
		
		input.close();
		
		
	}

}
