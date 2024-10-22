package Exercicios;

import java.util.Scanner;

public class atv09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Forneça a porcentagem do IPI a ser acrescido: ");
		final double IPI = sc.nextDouble();
		
		System.out.println("Respectivamente forneça o codigo da peça 1 o valor da peça 1 e a quantidade de peças: ");
		int code1 = sc.nextInt();
		double value1 = sc.nextDouble();
		int quantity1 = sc.nextInt();
		
		System.out.println("Respectivamente forneça o codigo da peça 2 o valor da peça 2 e a quantidade de peças: ");
		int code2 = sc.nextInt();
		double value2 = sc.nextDouble();
		int quantity2 = sc.nextInt();
		
		double valorTotal = (value1*quantity1 + value2*quantity2) * (IPI/100 + 1);
		
		System.out.printf("As peças com os codigos: %d e %d somam o valor de R$%.2f a ser pago.", code1, code2, valorTotal);
		
		sc.close();
	}

}
