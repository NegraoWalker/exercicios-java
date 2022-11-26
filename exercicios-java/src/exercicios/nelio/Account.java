package exercicios.nelio;

public class Account {
//Atributos da classe:
private int numberAccount;
private String nameHolder;
private double balance = 0;
//Métodos da classe:
public Account() {
	
}
public Account(int numberAccount, String nameHolder) {
	this.numberAccount = numberAccount;
	this.nameHolder = nameHolder;
	}

public int getNumberAccount() {
	return numberAccount;
}
public String getNameHolder() {
	return nameHolder;
}
public void setNameHolder(String nameHolder) {
	this.nameHolder = nameHolder;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance= balance;
}
public void dataAccount() {
	System.out.println("Account data: ");
	System.out.printf("Account: %d, Holder: %s, Balance: R$%.2f", this.getNumberAccount(), this.getNameHolder(), this.getBalance());
}
public void updateDataAccount() {
	System.out.println("Update account data: ");
	System.out.printf("Account: %d, Holder: %s, Balance: R$%.2f", this.getNumberAccount(), this.getNameHolder(), this.getBalance());
}

public void deposit(double amount) {
	this.balance += amount;
}

public void withdraw(double amount) {
	this.balance -= amount + 5.00;
}

}


