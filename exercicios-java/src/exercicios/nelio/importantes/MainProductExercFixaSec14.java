package exercicios.nelio.importantes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProductExercFixaSec14 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<ProductExercFixaSec14> list = new ArrayList<ProductExercFixaSec14>();
		
		System.out.print("Enter the number of products: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data: ", i+1);
			System.out.println();
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = input.next().charAt(0);
			if (ch == 'c') {
				System.out.print("Name: ");
				String name = input.next();
				System.out.print("Price: ");
				double price = input.nextDouble();
				
				ProductExercFixaSec14 product = new ProductExercFixaSec14(name, price);
				list.add(product);
			} else if(ch == 'i') {
				System.out.print("Name: ");
				String name = input.next();
				System.out.print("Price: ");
				double price = input.nextDouble();
				System.out.print("Customs fee: ");
				double customsFee = input.nextDouble();
				
				ImportedProductExercFixaSec14 imported = new ImportedProductExercFixaSec14(name, price, customsFee);
				list.add(imported);
			} else if(ch == 'u') {
				System.out.print("Name: ");
				String name = input.next();
				System.out.print("Price: ");
				double price = input.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String inputDate = input.next();
				LocalDate date = LocalDate.parse(inputDate, fmt);
				
				UsedProductExercFixaSec14 used  = new UsedProductExercFixaSec14(name, price, date);
				list.add(used);
			}
		}
		
		System.out.println("PRICE TAGS: ");
		for (ProductExercFixaSec14 productExercFixaSec14 : list) {
			System.out.println(productExercFixaSec14.priceTag());
		}
		
		input.close();

	}

}
