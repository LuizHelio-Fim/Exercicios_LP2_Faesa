package Exercicios;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        
        System.out.println("O fatorial de " + num + " é " + fatorial(num));
        
        sc.close();
	}
	
	public static long fatorial(int num) {
		long fatorial = 1;
		for (int i = 1; i <= num; i++) {
			fatorial *= i;  
		}
		return fatorial;
	}

}
