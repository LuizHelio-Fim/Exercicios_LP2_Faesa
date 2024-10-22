package exercicios;

import java.util.Scanner;

public class Atv13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de hastes de Cobre compradas: ");
		int hCobre = sc.nextInt();
		
		System.out.println("Agora a quantidade de hastes de Aluminio compradas: ");
		int hAluminio = sc.nextInt();
		
		int totalComprado = hCobre + hAluminio;
		double precoTotal = (hCobre*2.0) + (hAluminio*4.0);
		
		if (totalComprado < 5) {
			System.out.printf("VALOR TOTAL A PAGAR: "
							+ "%nR$ %.2f"
							+ "%n%nDesconto: "
							+ "%nNULO", precoTotal);
		} else if (totalComprado < 16) {
			System.out.printf("VALOR TOTAL A PAGAR: "
					+ "%nR$ %.2f"
					+ "%n%nDesconto: "
					+ "%nR$%.2f", precoTotal - (precoTotal*0.1), precoTotal*0.1);
		} else if (totalComprado < 21) {
			System.out.printf("VALOR TOTAL A PAGAR: "
					+ "%nR$ %.2f"
					+ "%n%nDesconto: "
					+ "%nR$%.2f", precoTotal - (precoTotal*0.15), precoTotal*0.15);
		} else {
			System.out.printf("VALOR TOTAL A PAGAR: "
					+ "%nR$ %.2f"
					+ "%n%nDesconto: "
					+ "%nR$%.2f", precoTotal - (precoTotal*0.2), precoTotal*0.2);
		}
		
		sc.close();
	}

}
