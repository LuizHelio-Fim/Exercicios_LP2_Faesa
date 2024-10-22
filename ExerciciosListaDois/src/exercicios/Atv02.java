package exercicios;

import java.util.Scanner;

public class Atv02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro: ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("O valor é zero");
		} else if (num%2 == 0) {
			System.out.println(num +" É par");
		} else {
			System.out.println(num + " É impar");
		}
		
		sc.close();
	}

}
