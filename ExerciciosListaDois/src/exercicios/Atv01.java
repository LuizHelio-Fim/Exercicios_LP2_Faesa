package exercicios;

import java.util.Scanner;

public class Atv01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Forneça o numerador: ");
		num1 = sc.nextInt();
		System.out.println("Forneça o denominador: ");
		num2 = sc.nextInt();
		
		if (num2 == 0) {
			System.out.println("Divisão indeterminada");
		} else {
			System.out.printf("Resultado da divisão: %.2f",(double)num1/num2);
		}
		
		sc.close();

	}

}
