import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = n;
		
		if(x != 0) {
			for(int i = 1; i < n; i++) {
				x = x * i;
			}
		}
		else {
			x = 1;
		}
		
		System.out.println(x);
		
		sc.close();
	}

}
