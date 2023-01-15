package exercicios.nelio.importantes;

public class OrderItem {
//Atributos da classe:
private Integer quantity;
private Double price;

private Product product; //Instanciando um objeto da classe Product
//Métodos da classe:
public OrderItem() {
	
}
public OrderItem(Integer quantity, Double price, Product product) {
	this.quantity = quantity;
	this.price = price;
	this.product = product;
}

public Integer getQuantity() {
	return quantity;
}
public void setQuantity(Integer quantity) {
	this.quantity = quantity;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) { //Como receber o preço do produto aqui? Porque ambos são iguais
	this.price = price;
}
//Métodos específicos:
public double subTotal() {
	//Item do pedido * quantidade
	return this.price*this.quantity;
}

@Override
public String toString() {
	return product.getName() 
			+ ", $" 
			+ String.format("%.2f", price) 
			+ ", Quantity: " 
			+ quantity + 
			", Subtotal: $" 
			+ String.format("%.2f", subTotal());
}


}


/*Tradução:
* OrderItem = Item do Pedido
*/