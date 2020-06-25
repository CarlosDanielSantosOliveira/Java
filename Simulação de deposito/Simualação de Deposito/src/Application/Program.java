package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int number = entrada.nextInt(); //numero da conta
		System.out.println("Enter account holder");
		entrada.nextLine(); //titular da conta
		String holder = entrada.nextLine();
		System.out.println("Is there an initial deposit (y/n)");
		char response = entrada.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = entrada.nextDouble(); //deposito inicial
			account = new Account(number, holder, initialDeposit); //instanciando a conta pelo contrutor de 3 argumentos
		} else {
			account = new Account (number, holder); //sobrecarga
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = entrada.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = entrada.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("withdraw account data: ");
		System.out.println(account);
		
		entrada.close();
	}

}
