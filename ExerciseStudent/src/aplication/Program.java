package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		std.name = sc.nextLine();
		std.n1 = sc.nextDouble();
		std.n2 = sc.nextDouble();
		std.n3 = sc.nextDouble();
		
		System.out.println("FINAL GRADE = " + std);
		if (std.sum() > 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + std.toStringFailed() + " POINTS");
		}
		sc.close();
	}

}
