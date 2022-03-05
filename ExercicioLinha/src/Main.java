import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			int x = (int)Math.pow(i, 2);
			int y = (int)Math.pow(i, 3);
			System.out.println(i + " " + x + " " + y);
		}
		
		sc.close();
	}

}
