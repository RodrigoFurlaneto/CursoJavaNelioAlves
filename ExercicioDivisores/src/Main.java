import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = n;
		
		for(int i = 1; i <= n; i++) {
			if (x % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
