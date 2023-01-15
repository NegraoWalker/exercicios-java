package exercicios.nelio.importantes;

public class ImportedProductExercFixaSec14 extends ProductExercFixaSec14{
	//Atributos da classe:
	private double customsFee;
	//Métodos da classe:
	public ImportedProductExercFixaSec14() {
		super(); //Importando o construtor padrão da classe pai
	}
	public ImportedProductExercFixaSec14(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	public double getCustomsFee() {
		return customsFee;
	}
	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	//Métodos especiais:
	@Override
	public String priceTag() {
		return super.priceTag() + " " + " ("+ "customsFee: " + "$ " + customsFee + ") ";
	}
}

//super.priceTag() - Chamando o método da classe pai