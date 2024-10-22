package exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double altura, maiorAltura = 1.0, segundaMaior = 1.0;

		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();
		
		while (altura != 0) {
			if (altura >= segundaMaior) {
				if (altura >= maiorAltura) {
					segundaMaior = maiorAltura;
					maiorAltura = altura;					
				} else if (altura >= segundaMaior) {
					segundaMaior = altura;
				}
			}
			
			System.out.println("Digite sua altura: ");
			altura = sc.nextDouble();
		}
		
		System.out.println("Maior Altura: " + maiorAltura);
		System.out.println("Segunda Maior Altura: " + segundaMaior);
		
		sc.close();
	}

}
