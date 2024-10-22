package Exercicios;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça um numero para saber se ele é primo: ");
		int num = sc.nextInt();
		
		if (descobrirPrimo(num) == true) {
			System.out.println("O numero " + num + " é PRIMO");			
		} else {
			System.out.println("O numero " + num + " NÃO é PRIMO");	
		}
		
		sc.close();
	}
	
	public static boolean descobrirPrimo(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0 ) {
				return false;
			}
		}
		return true;
	}

}
