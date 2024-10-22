package Exercicios;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira seu nome completo: ");
		String nomeCompleto = sc.nextLine();
		
		String nome = nomeSemSobrenome(nomeCompleto);
		
		System.out.println("Primeiro nome: " + nome);
		
		sc.close();
	}
	
	public static String nomeSemSobrenome(String nomeCompleto) {
		String nome[] = nomeCompleto.split(" ");
		String primeiroNome = nome[0];
		
		return primeiroNome;
	}

}
