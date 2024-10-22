package exercicios;

import java.util.Scanner;

public class Atv06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco;
		
		System.out.println("Informe o código da carga: ");
		int code = sc.nextInt();
		
		if (code < 10 || code > 40 ) {
			System.out.println("Código invalido");
			System.exit(0);
		}
		
		System.out.println("Informe o peso: (em Ton)");
		double peso = sc.nextDouble();
		
		double pesoKg = peso*1000;
		
		if (code > 9 && code < 21) {
			preco = pesoKg*100;
		} else if (code < 31) {
			preco = pesoKg*250;
		} else {
			preco = pesoKg*330;
		} 
		
		System.out.printf("Peso da Carga(Kg): %.1f%n"
						+ "Preço da Carga: R$%.2f", pesoKg, preco);
		
		
		sc.close();
	}

}
