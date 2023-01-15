package exercicios.nelio.importantes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
//Atributos da classe:
private LocalDateTime moment;
private OrderStatus status; 

private Client client;
private  List<OrderItem> list = new ArrayList<OrderItem>(); //Lista para armazenar os itens de pedido
//Métodos da classe:
public Order() {
	
}
public Order(LocalDateTime moment, OrderStatus status, Client client) {
	this.moment = moment;
	this.status = status;
	this.client = client;
}
public LocalDateTime getMoment() {
	return moment;
}
public void setMoment(LocalDateTime moment) {
	this.moment = moment;
}
public OrderStatus getStatus() {
	return status;
}
public void setStatus(OrderStatus status) {
	this.status = status;
}

//Métodos específicos:
	public void addItem(OrderItem item) { //Método que vai adicionar um item de pedido a lista
		list.add(item);
	}
	public void removeItem(OrderItem item) { //Método que vai remover um item de pedido a lista
		list.remove(item);
	}
	public double total() {
		// Soma de todos os itens do pedido * quantidade
		double sum = 0;
		for (OrderItem orderItem : list) {
			sum+=orderItem.subTotal();
		}
		return sum;
	}
//	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(fmt.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : list) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}

/*Tradução:
* Order = Pedido
* OrderItem = Item do Pedido
*/



