import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("NEGATIVE");
		}
		else {
			System.out.println("NOT NEGATIVE");
		}
	
		sc.close();
	}

}
