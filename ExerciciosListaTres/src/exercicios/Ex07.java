package exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Forneça o numero de parada: ");
		int num = sc.nextInt();
		
		for (int i=0; i<=num; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
