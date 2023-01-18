package exercicios.nelio.importantes;

import java.util.Locale;
import java.util.Scanner;

public class MainAccountExFixSec15 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = input.nextInt();
		System.out.print("Holder: ");
		String holder = input.next();
		System.out.print("Initial balance: ");
		double balance = input.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = input.nextDouble();
		
		AccountExFixSec15 account = new AccountExFixSec15(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		double withdraw = input.nextDouble();
		
		//Output:
		try {
			account.withdraw(withdraw);
			System.out.println("New balance: " + account.getBalance());
		} catch (WithdrawError e) {
			System.err.println( e.getMessage());
		}
		
		input.close();

	}

}
