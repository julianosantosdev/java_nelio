package application;

import java.util.Locale;
import java.util.Scanner;

import exercice.BankAccount;

public class ProgramBankAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		BankAccount account = null;

		System.out.print("Enter account number: ");
		String accNumber = sc.next();
		
		sc.nextLine();
		
		System.out.print("Enter account holder: ");
		String accName = sc.nextLine();

		System.out.print("Is there an initial deposit? (y/n) ");
		String choice = sc.next();

		switch (choice) {
		case "y": {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(accNumber, accName, initialDeposit);
			System.out.println(account.toString());
			break;
		}
		case "n": {
			account = new BankAccount(accNumber, accName);
			System.out.println(account);
			break;
		}
		default:
			System.out.println("valor inválido");
			break;
		}
		
		System.out.print("Enter a deposit value: ");
		double depositAmount = sc.nextDouble();
		account.deposit(depositAmount);
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.println(account);

		sc.close();

	}

}
