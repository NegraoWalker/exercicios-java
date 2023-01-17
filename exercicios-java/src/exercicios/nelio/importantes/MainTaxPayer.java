package exercicios.nelio.importantes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainTaxPayer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = input.nextInt(); //Recebendo a quantidade contribuintes
		System.out.println();
	
		for (int i = 0; i < n; i++) {
			System.out.printf("Tax payer #%d data: ", i+1);
			System.out.println();
			System.out.print("Individual or company (i/c) : ");
			char ch = input.next().charAt(0);
			if (ch == 'i') {
				System.out.print("Name: ");
				String name = input.next();
				System.out.print("Anual income: ");
				double anualIncome = input.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = input.nextDouble();
				
				Individual individual = new Individual(name, anualIncome, healthExpenditures); //Instanciando o objeto do tipo Individual com os atributos coletados
				list.add(individual); //Adicionando na lista o objeto do tipo Individual
				
			} else if(ch == 'c') {
				System.out.print("Name: ");
				String name = input.next();
				System.out.print("Anual income: ");
				double anualIncome = input.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmployees = input.nextInt();
				
				Company company = new Company(name, anualIncome, numberOfEmployees);
				list.add(company);
			}
		}
		
		double sum = 0.0;
		System.out.println("TAXES PAID: ");
		for (TaxPayer taxPayer : list) {
			System.out.printf("%s : $ %.2f\n", taxPayer.getName(), taxPayer.tax()); //Imprimindo o valor do imposto pago por cada tipo de contribuinte
			sum+= taxPayer.tax();
		}
		
		System.out.printf("TOTAL TAXES: $ %.2f", sum); //Imprimindo o valor total dos impostos dos contribuintes
		input.close();

	}

}
