package exercicios;

import java.util.Scanner;

public class Atv12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu sexo: (M/F)");
		String sexo = sc.next().toUpperCase();
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (sexo.equals("M") && idade > 20) {
			System.out.println("Maior idade");
		} else if (sexo.equals("F") && idade > 17) {
			System.out.println("Maior idade");
		} else {
			System.out.println("Menor idade");
		}
		
		sc.close();
	}

}
