package exercicio01;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int op;
		Locadora locadora = new Locadora(100);
		
		do {
			System.out.println("MENU LOCADORA\n"
					+ "1. Cadastrar Filme\n"
					+ "2. Pesquisar quantidade de filmes por genero\n"
					+ "3. Remover Filme\n"
					+ "4. Ver Filmes\n"
					+ "0. Sair");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					cadastrarFilme(locadora);
					break;
				case 2:
					pesquisarGenero(locadora);
					break;
				case 3:
					removerFilme(locadora);
					break;
				case 4:
					System.out.println(locadora.toString());
					break;
				case 0:
					System.out.println("Fim do programa.");
					break;
				default:
					System.out.println("Opção Inválida. Tente Novamente\n");
			}
		} while (op != 0);

	}
	
	static void cadastrarFilme(Locadora t) {
		Filme filme = new Filme();
		
		int code;
		String tituloFilme;
		char genero;
		
		System.out.println("Digite o Código do Filme: ");
		code = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o Titulo do Filme: ");
		tituloFilme = sc.nextLine();
		System.out.println("Digite o Gênero do Filme (A – ação, T – terror, D – drama): ");
		genero = sc.next().charAt(0);
		
		filme = new Filme(code, tituloFilme, genero);
		if (t.inserirDados(filme)) {
			System.out.println("Operação Realizada com Sucesso!");
		} else {
			System.out.println("Operação Não Realizada. Arquivo Cheio!");
		}
	}
	
	static void pesquisarGenero(Locadora t) {
		char genero;
		int quantidade;
		
		System.out.println("Digite o Gênero do Filme (A – ação, T – terror, D – drama): ");
		genero = sc.next().charAt(0);
		quantidade = t.pesquisarGenero(genero);
		
		if(quantidade == 0) {
			System.out.println("Não existem filmes desse Gênero.");
		} else {
			System.out.println("Existem " + quantidade + " Filmes desse Gênero.");
		}
	}
	
	static void removerFilme(Locadora t) {
		String titulo;
		
		sc.nextLine();
		System.out.println("Digite o Titulo do Filme: ");
		titulo = sc.nextLine();
		
		if (t.removerDados(titulo)) {
			System.out.println("Operação Realizada com Sucesso!");
		} else {
			System.out.println("Operação Não Realizada. Filme não Encontrado.");
		}
	}

}
