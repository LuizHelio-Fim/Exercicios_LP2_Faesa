package Exercicios;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros serão digitados?");
		int tot = sc.nextInt();
		
		int numeros[] = new int[tot];
		
		for(int i=0; i < tot; i++) {
			System.out.print("Digite o numero " + (i+1) + ":");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("Somatorio de todos os numeros digitados: " + somatorio(numeros));
		
		sc.close();
	}
	
	public static int somatorio(int numeros[]) {
		int somatorio = 0;
		
		for (int i=0; i < numeros.length; i++) {
			somatorio += numeros[i];
		}
		return somatorio;
	}

}
