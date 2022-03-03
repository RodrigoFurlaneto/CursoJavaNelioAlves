import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++) {
			
			int y = sc.nextInt();
			int z = sc.nextInt();
			
			if (z != 0) {
				double div = (double) y / z;
				System.out.printf("%.1f%n", div);
			}
			else {
				System.out.println("Divisão impossivel");
			}
		}
		sc.close();
	}

}
