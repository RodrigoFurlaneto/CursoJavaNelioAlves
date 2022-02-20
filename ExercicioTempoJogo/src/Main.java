import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, tempo;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		tempo = 0;
		if (x < y) {
			tempo = y - x;
		}
		else {
			tempo = 24 - x + y;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		
		sc.close();
	}

}
