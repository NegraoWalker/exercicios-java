package exercicios.nelio.importantes;

public class AccountExFixSec15 {
	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public AccountExFixSec15() {
		
	}

	public AccountExFixSec15(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance = amount;
	}
	
	public void withdraw(double amount) {
		//Implementar
		this.balance = this.balance - amount;
		if (balance <= 0) {
			throw new WithdrawError("Withdraw error: Not enough balance!"); //Exceção se o user quer sacar com o saldo vazio
		} else if(amount > withdrawLimit) {
			throw new WithdrawError("The amount exceeds withdraw limit!"); //Exceção se o user quer sacar um valor que excede o limite dele
		}
		
		
	}
	
	
	
	
	
	
}
