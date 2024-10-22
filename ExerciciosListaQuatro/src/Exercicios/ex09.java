package Exercicios;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Forneça 2 numeros para saber o Máximo Divisor Comum: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("O maximo Divisor comum de " + num1 + " e " + num2 + " é: " + maxDivisorComum(num1, num2));
		
		sc.close();
	}
	
	public static int maxDivisorComum(int num1, int num2) {
		while (num2 != 0) {
			int temp = num2;
			num2 = num1%num2;
			num1 = temp;
		}
		return num1;
	}

}
