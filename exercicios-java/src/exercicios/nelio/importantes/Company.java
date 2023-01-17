package exercicios.nelio.importantes;

public class Company extends TaxPayer {
	private int numberOfEmployees;
	
	public Company() {
		super();
	}
	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	@Override //Método abstrato da classe pai implementado na classe filha:
	public double tax() {
		if (numberOfEmployees > 10) {
			return super.getAnualIncome()*0.14;
		} else if(numberOfEmployees <= 10) {
			return super.getAnualIncome()*0.16;
		}
		return 0;
	}
	
}
