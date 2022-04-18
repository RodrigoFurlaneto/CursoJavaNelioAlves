package entities;

public class Account {
	
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public Account(int accountNumber, String accountHolder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		newDeposit(initialDeposit);
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
	
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public void newDeposit(double balance) {
		this.balance += balance;
	}
	
	public void newWithdraw(double balance) {
		this.balance -= balance + 5;
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