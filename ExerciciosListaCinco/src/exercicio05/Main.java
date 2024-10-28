package exercicio05;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		EmprestimosVet emprestimos = new EmprestimosVet(1500);
		int op;
		
		do {
			System.out.println("MENU\n"
							+ "1. Cadastrar Empréstimos\n"
							+ "2. Calcular Valor de Juros por cliente\n"
							+ "3. Alterar Juros do Maior Cliente\n"
							+ "0. Sair");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					cadastrarEmprestimo(emprestimos);
					break;
				case 2:
					calcularJuros(emprestimos);
					break;
				case 3:
					alterarJuros(emprestimos);
					break;
				case 0:
					System.out.println("Fim do Programa.");
					break;
				default:
					System.out.println("ERRO: Valor Digitado Inválido.");
			}
			
		} while (op != 0);
		
	}
	
	static void cadastrarEmprestimo(EmprestimosVet t) {
		String nomeCliente;
		double valorEmprestimo;
		double jurosMensais;
		
		sc.nextLine();
		System.out.println("Digite o Nome do Cliente: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Digite o valor do Emprestimo: ");
		valorEmprestimo = sc.nextDouble();
		System.out.println("Digite a taxa de Juros mensal '%': ");
		jurosMensais = sc.nextDouble();
		
		Emprestimos emprestimo = new Emprestimos(nomeCliente, valorEmprestimo, jurosMensais);
		
		if (t.cadastrarEmprestimo(emprestimo)) {
			System.out.println("Emprestimo Cadastrado com sucesso!");
		} else {
			System.out.println("Emprestimo Não cadastrado: Lista cheia ou Cliente já cadastrado!");
		}
	}
	
	static void calcularJuros(EmprestimosVet t) {
		System.out.println(t.toString());
	}
	
	static void alterarJuros(EmprestimosVet t) {
		double novaTaxa;
		
		System.out.println("Digite a Nova taxa de Juros: ");
		novaTaxa = sc.nextDouble();

		if (t.alterarJuros(novaTaxa)) {
			System.out.println("Nova Taxa: " + novaTaxa);
		} else {
			System.out.println("Lista vazia!");
		}
	}

}
