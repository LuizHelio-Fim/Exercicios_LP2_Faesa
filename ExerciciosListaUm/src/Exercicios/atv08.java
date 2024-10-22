package Exercicios;

import java.util.Scanner;

public class atv08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Forneça um numero inteiro: ");
		int num = sc.nextInt();
		
		System.out.println("O SUCESSOR de " + num + " é " + (num+1) + ". E o ANTECESSOR é " + (num-1));
		
		sc.close();
	}

}
