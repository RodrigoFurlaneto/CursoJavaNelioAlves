import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, imposto;
		x = sc.nextDouble();
		
		if (x >= 0 && x <= 2000.0) {
			System.out.println("Isento");
		}
		else if (x <= 3000.0) {
			imposto = (x - 2000.0) * 0.08;
		}
		else if (x <= 4500.0) {
			imposto = (x - 3000.0) * 0.18;
			imposto = imposto + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else {
			imposto = (x - 4500.0) * 0.28;
			imposto = imposto + 1500.0 * 0.18;
			imposto = imposto + 1000.0 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}

}
