package Exercicios;

import java.util.Scanner;

public class atv07 {
	
	public double x;
	public double y;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		atv07 ponto1, ponto2;
		ponto1 = new atv07();
		ponto2 = new atv07();
		
		System.out.println("Insira x e y respectivamente do ponto 1: ");
		ponto1.x = sc.nextDouble();
		ponto1.y = sc.nextDouble();
		
		System.out.println("Insira x e y respectivamente do ponto 2: ");
		ponto2.x = sc.nextDouble();
		ponto2.y = sc.nextDouble();
		
		double diagonal = Math.sqrt(Math.pow((ponto2.x - ponto1.x), 2) + Math.pow((ponto2.y - ponto1.y), 2));
		
		System.out.printf("A distancia entre P(%.1f, %.1f) e P(%.1f, %.1f) é de: %.1f",
				ponto1.x, ponto1.y, ponto2.x, ponto2.y, diagonal);
		
		sc.close();
	}

}
