package exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça qual tabuada deseja: ");
		int tabuada = sc.nextInt();
		System.out.println("Até qual numero? ");
		int parada = sc.nextInt();
		
		for (int i=1; i <= parada; i++) {
			System.out.printf("%d x %d = %d%n", i, tabuada, (i*tabuada));
		}
		
		sc.close();
	}

}
