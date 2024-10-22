package exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int i = 0, somatorio = 0, cont = 0;
		
		while (i != -1) {
			System.out.println("Forneça o numero que deseja (Digite -1 para parar): ");
			i = sc.nextInt();
			
			if (i != -1) {
				somatorio += i;
				cont += 1;
			}
		}
		
		int media = somatorio/cont;
		
		System.out.printf("A média dos numeros Digitados é %d", media);
		
		sc.close();
	}

}
