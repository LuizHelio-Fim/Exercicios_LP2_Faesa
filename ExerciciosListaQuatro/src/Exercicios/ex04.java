package Exercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira uma frase ou palavra: ");
		String tamanho = sc.nextLine().toLowerCase();
		
		System.out.println("Existem " + tamanhoString(tamanho) + " vogais nessa String.");
		
		sc.close();
	}
	
	public static int tamanhoString(String tamanho) {
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		int numVogais = 0;
		
		for (int i=0; i < tamanho.length(); i++) {
			char letra = tamanho.charAt(i);
		
			for (char vogal : vogais) {
				if (letra == vogal) {
					numVogais++;
					break;
				}
			}
		}
		return numVogais;
	}
}
