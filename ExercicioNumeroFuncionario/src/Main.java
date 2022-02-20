import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number, hour;
		double valueHour, salary;
		
		number = sc.nextInt();
		hour = sc.nextInt();
		valueHour = sc.nextDouble();
		
		salary = hour * valueHour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}

}
