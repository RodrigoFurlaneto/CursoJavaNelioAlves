import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("PAIR");
		}
		else {
			System.out.println("ODD");
		}
		
		sc.close();
	}

}
