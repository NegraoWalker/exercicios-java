package exercicios.nelio.importantes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {
/*Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()*/

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Definindo o formato para a data do cliente
		
/*-------------------------------------------------Input Program--------------------------------------------------------------------*/
		
		System.out.println("Enter client data: ");
		
		System.out.println("Name: ");
		String name = input.next();//Recebendo o nome do cliente
		
		System.out.println("Email: ");
		String email = input.next(); //Recebendo o email do cliente
		
		System.out.println("Birth date (dd/MM/yyyy): ");
		String dateClient = input.next(); //Recebendo a data de nascimento do cliente
		LocalDate birthDate = LocalDate.parse(dateClient, fmt1);//Definindo o atributo birthDate da classe Client com o valor digitado
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println();
		
		System.out.println("Enter order data: ");
		
		System.out.println("Status: ");
		String statusOrder = input.next(); //Recebendo o status do pedido
		
		OrderStatus status = OrderStatus.valueOf(statusOrder); //Verificando se o valor digitado corresponde as constantes definidas de status na Enum
		
		Order order = new Order(LocalDateTime.now(), status, client);
		
		System.out.println("How many items to this order: ");
		int N = input.nextInt(); //Recebendo a quantidade de produtos
		
		for (int i = 0; i < N; i++) {
			System.out.printf("Enter #%d item data: ", i+1);
			System.out.println();
			
			System.out.println("Product name: ");
			String productName = input.next();//Recebendo o nome do produto
			System.out.println("Product price: ");
			double productPrice = input.nextDouble(); //Recebendo o preço do produto
			System.out.println("Quantity: ");
			int quantityProduct = input.nextInt();//Recebendo a quantidade de produtos
			
			Product product = new Product(productName, productPrice);
			
			OrderItem orderItem = new OrderItem(quantityProduct, productPrice, product);
			order.addItem(orderItem);
		}
		

/*-------------------------------------------------Output Program-------------------------------------------------------------*/		
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		
		input.close();
			
	}

}
