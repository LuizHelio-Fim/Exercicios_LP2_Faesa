package exercicios;

import java.util.Scanner;

public class Atv07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("Agora insira o valor do financiamento pretendido: ");
		double financ = sc.nextDouble();
		
		if (financ <= (salario*5)) {
			System.out.println("Financiamento Concedido!");
		} else {
			System.out.println("Financiamento Negado!");
		}
		
		System.out.println("Obrigado por nos consultar.");
		
		sc.close();
	}

}
