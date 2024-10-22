package exercicios;

import java.util.Scanner;

public class Atv14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double valorPago = 0;
		
		System.out.println("Forneça o seu tipo de consumidor (I, C, R):");
		String consumidor = sc.next().toUpperCase();
		
		System.out.println("Forneça a quantidade de energia consumida (kW): ");
		double consumo = sc.nextDouble();
		
		switch (consumidor) {
			case "I":
				valorPago = 0.68 * consumo + 34;
				break;
			case "C":
				valorPago = 0.37 * consumo + 45;
				break;
			case "R":
				valorPago = 0.77 * consumo - 22;
				break;
			default:
				System.out.println("Opção Invalida");
		}
		
		if (valorPago != 0) {
			System.out.println("Valor total a ser pago: R$" + valorPago);			
		}
		
		sc.close();
	}

}
