package exercicios.nelio;

public class Employee {
//Atributos da classe:
	private String name;
	private double grossySalary;
	private double tax;
//Métodos da classe:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossySalary() {
		return grossySalary;
	}
	public void setGrossySalary(double grossySalary) {
		this.grossySalary = grossySalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return this.grossySalary - this.tax;
	}
	public double increaseSalary(double percentage) {
		double c = this.grossySalary*(percentage/100);
		return this.netSalary() + c;
	}
}
