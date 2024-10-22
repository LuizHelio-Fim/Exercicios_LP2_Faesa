package Exercicios;

import java.util.Scanner;

public class atv04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double TULIPA = 1.80;
		final double PIZZA_GRANDE = 25.00;
		final double COBERTURA_EXTRA = 3.50;
		
		System.out.println("Quantas pessoas vão comer? ");
		int qntPessoas = sc.nextInt();
		
		System.out.println("Quantas tulipas serão pedidas? "); 
		int qntTulipa = sc.nextInt();
		
		System.out.println("Quantas pizzas serão pedidas? "); 
		int qntPizza = sc.nextInt();
		
		System.out.println("Quantas coberturas serão pedidas?"); 
		int qntCobertura = sc.nextInt();
		
		double precoTulipa = TULIPA * qntTulipa;
		double precoPizza = PIZZA_GRANDE * qntPizza;
		double precoCobertura = COBERTURA_EXTRA * qntCobertura;
		
		double preco = precoTulipa + precoPizza + precoCobertura;
		double garcom = preco * 0.1;
		
		System.out.printf("CONTA:%nPREÇO: R$%.2f%n10%%: R$%.2f%nPREÇO Final: R$%.2f%nPara cada pessoa: R$%.2f", 
                preco, garcom, (preco + garcom), (preco + garcom) / qntPessoas);

		
		sc.close();
	}

}
