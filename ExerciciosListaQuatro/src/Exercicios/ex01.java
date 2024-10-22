package Exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero para ver se ele é par ou impar: ");
		int num = sc.nextInt();
		
		String verificado;
		if (verificarPar(num) == true) {
			verificado = "PAR";
		} else {
			verificado = "IMPAR";
		}
		
		System.out.println("o numero " + num + " é " + verificado);
		
		sc.close();
	}

	public static boolean verificarPar(int num) {
		boolean verificador;
		if (num%2 == 0) {
			verificador = true;
		} else {
			verificador = false;
		}
		return verificador;
	}
	
}
