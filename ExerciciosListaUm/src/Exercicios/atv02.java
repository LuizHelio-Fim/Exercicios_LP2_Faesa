package Exercicios;

import java.util.Scanner;

public class atv02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a KM inicial: ");
		double kmInicial = sc.nextDouble();
		
		System.out.println("Insira a KM Final: ");
		double kmFinal = sc.nextDouble();
		
		System.out.println("Insira quantos Litros de gasolina foi comprado: ");
		double gas = sc.nextDouble();
		
		double kmTotal = kmFinal - kmInicial;
		double media = kmTotal/gas;
		
		System.out.printf("Você fez %.2f km/l", media);
		
		sc.close();
	}

}
