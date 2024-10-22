package exercicios;

import java.util.Scanner;

public class Atv05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu saldo médio do ultimo ano: ");
		double saldoMedio = sc.nextDouble();
		
		if (saldoMedio < 201) {
			System.out.println("Saldo médio: R$" + saldoMedio 
							 + "\nCrédito: Nenhum Crédito");
		} else if (saldoMedio < 401) {
			System.out.println("Saldo médio: R$" + saldoMedio 
					 + "\nCrédito: R$" + (0.1*saldoMedio));
		} else {
			System.out.println("Saldo médio: R$" + saldoMedio 
					 + "\nCrédito: R$" + (0.2*saldoMedio));
		}
		
		sc.close();
	}

}
