import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		double total;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		total = 0;
		switch (x) {
		case 1:
			total = 4.0 * y;
			break;
		case 2:
			total = 4.5 * y;
			break;
		case 3:
			total = 5.0 * y;
			break;
		case 4:
			total = 2.0 * y;
			break;
		case 5:
			total = 1.5 * y;
			break;		
		}
		
		System.out.printf("Total: R$ %.2f", total);
		
		sc.close();
	}

}
