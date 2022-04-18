package entities;

public class Account {
	
	private int accountNumber;
	public String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void newDeposit(double balance) {
		this.balance += balance;
	}
	
	public void newWithdraw(double balance) {
		this.balance = this.balance - balance - 5;
	}
	
	public String toString() {
		return "\nAccount: " 
				+ getAccountNumber() 
				+ ", Holder: " 
				+ accountHolder 
				+ ", Balance: $ " 
				+ String.format("%.2f%n", getBalance());
	}
}