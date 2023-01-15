package exercicios.nelio.importantes;

public class ProductExercFixaSec14 {
	//Atributos da classe:
	private String name;
	private double price;
	//Métodos da classe:
	public ProductExercFixaSec14() {
		
	}
	public ProductExercFixaSec14(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Métodos especiais:
	public String priceTag() {
		return name + " " + "$"+ price;
	}
}
