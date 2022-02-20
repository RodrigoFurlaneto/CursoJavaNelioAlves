import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, tempo;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		tempo = 0;
		if (x == y) {
			tempo = 24;
		}
		else if (x > y) {
			tempo = 24 - x;
			tempo += y;
		}
		else {
			tempo = y -x;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		
		sc.close();
	}

}
