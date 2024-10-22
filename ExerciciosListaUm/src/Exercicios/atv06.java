package Exercicios;

import java.util.Scanner;

public class atv06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro: ");
		int num = sc.nextInt();
		
		int numTriplo = num*3;
		int numMetade = num/2;
		double numCubico = Math.cbrt(num);
		double numElevado = Math.pow(num, 2.0/3.0);
		
		System.out.println("O Triplo de " + num + " é " + numTriplo);
		System.out.println("A Metade de " + num + " é " + numMetade);
		System.out.println("A raiz cubica de " + num + " é " + numCubico);
		System.out.println(num + " elevado a 2/3 é " + numElevado);
		
		sc.close();

	}

}
