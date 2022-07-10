package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;
import exception.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int numberAccount = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holderAccount = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			Account acc = new Account(numberAccount, holderAccount, balance, limit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double withdraw = sc.nextDouble();
		
		try {
			acc.withdraw(withdraw);
			System.out.printf("New balance: %.2f%n", acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
