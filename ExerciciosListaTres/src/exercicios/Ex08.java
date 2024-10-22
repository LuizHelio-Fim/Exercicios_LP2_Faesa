package exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça o primeiro numero: ");
		int primeiroNum = sc.nextInt();
		System.out.println("Forneça o segundo numero: ");
		int segundoNum = sc.nextInt();
		
		int somatorio = 0;
		
		if (primeiroNum < segundoNum) {
			for (int i=primeiroNum; i <= segundoNum; i++) {
				somatorio += i;
			}
		} else {
			for (int i=segundoNum; i <= primeiroNum; i++) {
				somatorio += i;
			}
		}
		
		System.out.printf("A soma de todos os valores entre %d e %d é %d.", primeiroNum, segundoNum, somatorio);
		
		sc.close();
	}

}
