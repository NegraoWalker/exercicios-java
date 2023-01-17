package exercicios.nelio.importantes;

public class Individual extends TaxPayer {
	private double healthExpenditures;
	
	public Individual() {
		super();
	}
	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	public double getHealthExpenditures() {
		return healthExpenditures;
	}
	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override //Método abstrato da classe pai implementado na classe filha:
	public double tax() {
		if (super.getAnualIncome() < 20000.0) { //O valor de comparação tem que ser no formato de double
			//15% imposto
			return super.getAnualIncome()*0.15 - healthExpenditures*0.5;
		} else if(super.getAnualIncome() >= 20000.0) {
			//25% imposto
			return super.getAnualIncome()*0.25 - healthExpenditures*0.5;
		}
		return 0;
	}
	
}
