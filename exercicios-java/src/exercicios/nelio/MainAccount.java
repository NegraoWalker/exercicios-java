package exercicios.nelio;

import java.util.Locale;
import java.util.Scanner;

public class MainAccount {

	public static void main(String[] args) {
/*Exercicio de Fixação Aula 81- Seção 9: 
* Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).
Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.
Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação.
Entrada:
Enter account number: 8532
Enter account holder: Alex Green
Is there na initial deposit (y/n)? y
Enter initial deposit value: 500.00

Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00

Saída:
Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00
*/
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = input.nextInt();
		System.out.println("Enter account holder: ");
		input.nextLine();
		String nameHolder = input.nextLine();
		
		Account account = new Account(number, nameHolder);
		System.out.println();
		
		System.out.println("Is there na initial deposit (y/n)? ");
		char response = input.next().charAt(0);
		
		if (response=='y') {
			System.out.println("Enter initial deposit value:  ");
			double initialValue = input.nextDouble();
			account.setBalance(initialValue);
		} 
		System.out.println();
		account.dataAccount();
		System.out.println();
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		account.deposit(input.nextDouble());
		account.updateDataAccount();
		
		System.out.println();
		System.out.println();
		
		System.out.println("Enter a withdraw value: ");
		account.withdraw(input.nextDouble());
		account.updateDataAccount();
		
		
		input.close();
		
		
		
	}

}
