package exercicios.nelio.importantes;

public class Product {
//Atributos da classe:
private String name;
private Double price;
//Métodos da classe:
public Product() {
	
}
public Product(String name, Double price) {
	this.name = name;
	this.price = price;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

		
}
