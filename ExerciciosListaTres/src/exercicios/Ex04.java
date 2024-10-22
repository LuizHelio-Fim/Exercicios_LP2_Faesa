package exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, resto = 0;
		
		System.out.println("Forneça 200 numeros inteiros: ");
		for (int i=0; i < 200; i++) {
			System.out.printf("%dº: ", (i+1));
			num = sc.nextInt();
			
			resto += num%3;
		}
		
		System.out.printf("Soma dos restos da divisão: %d", resto);
		
		sc.close();
	}

}
