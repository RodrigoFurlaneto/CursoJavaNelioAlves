package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char initial = sc.next().charAt(0);
		double balance = 0.0;
		if(initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
		}
		Account acc = new Account(accountNumber, accountHolder, balance);
		
		System.out.println();
		System.out.print("Account data: " + acc);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		acc.newDeposit(balance);
		
		System.out.print("Updated account data:" + acc);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		acc.newWithdraw(balance);
		
		System.out.print("Updated account data:" + acc);
		System.out.println();
		
		sc.close();
	}
}
