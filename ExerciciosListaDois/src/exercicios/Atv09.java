package exercicios;

import java.util.Calendar;
import java.util.Scanner;

public class Atv09 {

		public String nome;
		public int idade;
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		Atv09 pessoa1, pessoa2;
		pessoa1 = new Atv09();
		pessoa2 = new Atv09();
		
		System.out.println("Forneça o nome e a idade da pessoa 1: ");
		pessoa1.nome = sc.next();
		pessoa1.idade = sc.nextInt();

		
		System.out.println("Forneça o nome e a idade da pessoa 2: ");
		pessoa2.nome = sc.next();
		pessoa2.idade = sc.nextInt();
		
		if (pessoa1.idade < pessoa2.idade) {
			int ano = cal.get(Calendar.YEAR) - pessoa1.idade;
			System.out.println(pessoa1.nome + " é a pessoa mais nova e nasceu em " + ano);
		} else {
			int ano = cal.get(Calendar.YEAR) - pessoa2.idade;
			System.out.println(pessoa2.nome + " é a pessoa mais nova e nasceu em " + ano);
		}
		
		sc.close();
	}

}
