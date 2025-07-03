package exercice;

public class BankAccount {
	private final String accountNumber;
	private String accountOwner;
	private double balance;

	public BankAccount(String accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
	}

	public BankAccount(String accountNumber, String accountOwner, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		deposit(initialDeposit);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount + 5.00;
	}
	
	public String getAccountOwner() {
		return accountOwner;
	}
	
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return String.format("Account data:%n Account %s, Holder: %s, Balance: $ %.2f", accountNumber, accountOwner, getBalance());
	}
}
