import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, troca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A < B) {
			troca = A;
			A = B;
			B = troca;
		}
		
		if (A % B == 0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}
		
		sc.close();
	}

}
