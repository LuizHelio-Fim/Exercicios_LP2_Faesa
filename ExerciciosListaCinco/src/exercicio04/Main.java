package exercicio04;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		LojaBrinquedo vetor = new LojaBrinquedo(100);
		int op;
		
		do {
			System.out.println("MENU\n"
							+ "1. Adicionar Brinquedo\n"
							+ "2. Remover Brinquedo\n"
							+ "3. Lucro de Determinado Brinquedo\n"
							+ "4. Produtos Abaixo do Estoque\n"
							+ "0. Sair");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					adicionarBrinquedo(vetor);
					break;
				case 2:
					removerBrinquedo(vetor);
					break;
				case 3:
					lucroBrinquedo(vetor);
					break;
				case 4:
					abaixoEstoque(vetor);
					break;
				case 0:
					System.out.println("Fim do Programa.");
					break;
				default:
					System.out.println("ERRO: Valor Digitado Inválido!");
			}
			
		} while (op != 0);
	}
	
	static void adicionarBrinquedo(LojaBrinquedo t) {
		Brinquedo novo = new Brinquedo();
		
		int code;
		String desc;
		double precoCompra;
		double precoVenda;
		int qntEstoque;
		int estoqueMin;
		
		System.out.println("Digite o Código do Produto: ");
		code = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite uma Descrição do Produto: ");
		desc = sc.nextLine();
		System.out.println("Digite o Preço da Compra: ");
		precoCompra = sc.nextDouble();
		System.out.println("Digite o Valor a ser Vendido: ");
		precoVenda = sc.nextDouble();
		System.out.println("Digite a Quantidade Minima do Estoque: ");
		estoqueMin = sc.nextInt();
		System.out.println("Digite a Quantidade Atual do Estoque: ");
		qntEstoque = sc.nextInt();
		
		novo = new Brinquedo(code, desc, precoCompra, precoVenda, qntEstoque, estoqueMin);
		
		if (t.entradaDados(novo)) {
			System.out.println("Dados Cadastrados Com Sucesso!");
		} else {
			System.out.println("Dados Não Cadastrados. Lista Cheia!");
		}
	}
	
	static void removerBrinquedo(LojaBrinquedo t) {
		int code;
		
		System.out.println("Digite o Código do Produto: ");
		code = sc.nextInt();
		sc.nextLine();
		
		if(t.saidaDados(code)) {
			System.out.println("Produto Removido com Sucesso!");
		} else {
			System.out.println("Produto Não Encontrado!");
		}
	}
	
	static void lucroBrinquedo(LojaBrinquedo t) {
		int code;
		
		System.out.println("Digite o Código do Produto: ");
		code = sc.nextInt();
		sc.nextLine();
		
		if (t.lucroObtido(code) == 0.00) {
			System.out.println("Código Inválido.");
		} else {
			System.out.println("Lucro do Produto " + code + ": R$" + t.lucroObtido(code));
		}
	}
	
	static void abaixoEstoque(LojaBrinquedo t) {
		if (t.estoqueAbaixo().length == 0) {
			System.out.println("Nenhum Produto em falta.");
		} else {
			int codeList[] = new int[t.estoqueAbaixo().length];
			codeList = t.estoqueAbaixo();
			
			System.out.println("Produtos Abaixo do Estoque: ");
			for (int i=0; i < t.estoqueAbaixo().length; i++) {
				System.out.println((i+1) + ". " + codeList[i]);
			}
		}	
	}

}
