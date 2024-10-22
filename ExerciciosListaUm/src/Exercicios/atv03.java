package Exercicios;

import java.util.Scanner;

public class atv03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nome do piloto: ");
		String nome = sc.nextLine();
		
		System.out.println("Insira a Distancia percorrida e o tempo para percorrer (em horas) respectivamente: ");
		double distancia = sc.nextDouble();
		int horas = sc.nextInt();
		
		double velMedia = distancia/horas;
		
		System.out.printf("A velocidade média de %s foi %.2f km/h", nome, velMedia);
		
		sc.close();
	}

}
