package exercicios.nelio;

public class CurrencyConverter {
//Atributos da classe:
private double priceDollar;
private double quantityDollar;
static double IOF = 1.06;
//Métodos da classe:
public double getPriceDollar() {
	return priceDollar;
}
public void setPriceDollar(double priceDollar) {
	this.priceDollar = priceDollar;
}
public double getQuantityDollarInReal() {
	return quantityDollar;
}
public void setQuantityDollarInReal(double quantityDollarInReal) {
	this.quantityDollar = quantityDollarInReal;
}

public double currencyConverterDollarInReal() {
	double paidInReais = this.priceDollar*this.quantityDollar* IOF;
	System.out.printf("Amount to be paid in reais = %.2f", paidInReais);
	return 0;
}
}
