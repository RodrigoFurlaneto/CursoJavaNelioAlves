import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int code1, number1, code2, number2;
		double pieceValue1, pieceValue2, total;

		code1 = sc.nextInt();
		number1 = sc.nextInt();
		pieceValue1 = sc.nextDouble();

		code2 = sc.nextInt();
		number2 = sc.nextInt();
		pieceValue2 = sc.nextDouble();

		total = number1 * pieceValue1 + number2 * pieceValue2;

		System.out.printf("AMOUNT PAYABLE: R$ %.2f%n", total);

		sc.close();
	}

}
