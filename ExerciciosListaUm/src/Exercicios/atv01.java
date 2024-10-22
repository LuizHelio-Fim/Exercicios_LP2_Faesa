package Exercicios;

import java.util.Scanner;

public class atv01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça 3 valores inteiros: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int mediaPonderada = ((num1*2)+(num2*3)+(num3*5))/10;
		
		System.out.println("Media Ponderada: " + mediaPonderada);
		
		sc.close();
	}

}
