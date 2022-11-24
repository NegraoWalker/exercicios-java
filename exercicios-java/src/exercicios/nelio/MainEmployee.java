package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
/*Exercicio de Fixação 2 - Seção 8: 
	*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
	seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
	salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
	afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
	projetada abaixo.
		Entrada1: 
		Name: João Silva
		Gross salary:6000.00
		Tax:1000.00
		Saída1:
		Employee: João Silva, $5000.00
		Entrada2:
		Which percentage to increase salary? 10.0
		Saída2:
		Update data: João Silva, $5600.00
		*/
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("What's the employee's name:  ");
		employee.setName(input.nextLine());
		
		System.out.println("What's the employee's gross salary:  ");
		employee.setGrossySalary(input.nextDouble());
		
		System.out.println("What's the employee's tax:  ");
		employee.setTax(input.nextDouble());
		
		System.out.printf("Employee: %s, R$%.2f", employee.getName(),employee.netSalary());
		System.out.println();
		
		System.out.println("Which percentage to increase salary? ");
		System.out.printf("Update data: %s, R$%.2f",employee.getName(),employee.increaseSalary(input.nextDouble()));
		
		input.close();
		

	}

}
