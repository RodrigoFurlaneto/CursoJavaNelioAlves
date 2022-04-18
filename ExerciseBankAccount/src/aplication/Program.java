package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		if(initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			acc = new Account(accountNumber, accountHolder, balance);
		}
		else {
			acc = new Account(accountNumber, accountHolder);
		}
		
		System.out.println();
		System.out.print("Account data: " + acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		acc.newDeposit(deposit);
		
		System.out.print("Updated account data:" + acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		acc.newWithdraw(withdraw);
		
		System.out.print("Updated account data:" + acc);
		System.out.println();
		
		sc.close();
	}
}
