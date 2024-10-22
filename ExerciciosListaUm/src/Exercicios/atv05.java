package Exercicios;

import java.util.Scanner;

public class atv05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a temperatura em graus Celcius: ");
		double grausC = sc.nextDouble();
		
		double grausF = (grausC * 1.8) + 32;
		
		System.out.print("\nTemperatura em graus Fahrenheint: " + grausF);
		
		sc.close();

	}

}
