package exercicio06;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Banco vetor = new Banco(15);
		char op;
		
		do {
			System.out.println("MENU:\n"
					+ "1. Cadastrar Conta\n"
					+ "2. Visualizar Contas de um determinado Cliente\n"
					+ "3. Excluir Conta com Menor Saldo\n"
					+ "4. Sair");
			op = sc.next().charAt(0);
			
			switch (op) {
				case '1':
					cadastrarConta(vetor);
					break;
				case '2':
					visualizarConta(vetor);
					break;
				case '3':
					excluirConta(vetor);
					break;
				case '4':
					System.out.println("Fim do Programa!");
					break;
				default:
					System.out.println("ERRO: Opção Invalida, Digite Novamente!");
			}
			
		} while  (op != '4');

	}
	
	static void cadastrarConta(Banco t) {
		int numConta;
		String nomeCliente;
		double saldo;
		
		System.out.println("Digite o Numero da Conta: ");
		numConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o Nome do Cliente: ");
		nomeCliente = sc.nextLine().toUpperCase();
		System.out.println("Digite o Saldo da Conta: ");
		saldo = sc.nextDouble();
		
		ContaBancaria cliente = new ContaBancaria(numConta, nomeCliente, saldo);
		
		if (t.cadastrarContas(cliente)) {
			System.out.println("Cliente Cadastrado com Sucesso!");
		} else {
			System.out.println("Numero de Conta já existente ou lista Cheia.");
		}
		
	}
	
	static void visualizarConta(Banco t) {
		String nomeCliente;
		sc.nextLine();
		System.out.println("Digite o Nome do Cliente: ");
		nomeCliente = sc.nextLine().toUpperCase();
		
		if (t.visualizarContas(nomeCliente).length() == 0) {
			System.out.println(nomeCliente + " Não é um Cliente!");
		} else {
			System.out.println(t.visualizarContas(nomeCliente));
		}
		
		
	}
	
	static void excluirConta(Banco t) {
		if (t.deletarConta()) {
			System.out.println("Conta Deletada com Sucesso!");
		} else {
			System.out.println("Sem contas para deletar!");
		}
	}

}
