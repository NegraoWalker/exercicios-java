package exercicios.nelio.importantes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProductExercFixaSec14 extends ProductExercFixaSec14{
	//Atributos da classe:
	private LocalDate manufactureDate;
	//Métodos da classe:
	public UsedProductExercFixaSec14() {
		super();
	}
	public UsedProductExercFixaSec14(String name, double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	//Métodos especiais:
	@Override
	public String priceTag() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return super.priceTag() + "(" + "used" + ")" + " " + " ("+ "Manufacture date: " + fmt.format(manufactureDate) +") ";
	}
}
