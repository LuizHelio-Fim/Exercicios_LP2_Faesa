package exercicio02;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Empresa empresa = new Empresa(50);
		int op;
		
		do {
			System.out.print("MENU\n"
							+ "1. Adicionar Vendedor\n"
							+ "2. Remover Vendedor\n"
							+ "3. Mostrar Todos os Vendedores\n"
							+ "4. Consultar o Total de Vendedores por Mercadoria\n"
							+ "0. Sair\n"
							+ "> ");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					adicionarVendedor(empresa);
					break;
				case 2:
					removerVendedor(empresa);
					break;
				case 3:
					System.out.println(empresa.toString());
					break;
				case 4:
					pesquisarVendedores(empresa);
					break;
				case 0:
					System.out.println("Fim do Programa!");
					break;
				default:
					System.out.println("Opção Digitada Inválida. Tente Novamente!");
			}
			
		} while (op != 0);

	}
	
	static void adicionarVendedor(Empresa t) {
		Funcionario vendedor = new Funcionario();
		
		int code;
		String nomeVendedor;
		char tipoMercadoria;
		
		System.out.println("Digite o Código do Vendedor: ");
		code = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o Nome do Vendedor: ");
		nomeVendedor = sc.nextLine();
		System.out.println("Digite o tipo de Mercadoria vendida(P - Perecível, N - Não Perecível): ");
		tipoMercadoria = sc.next().charAt(0);
		
		vendedor = new Funcionario(code, nomeVendedor, tipoMercadoria);
		if (t.adicionarVendedor(vendedor)) {
			System.out.println("Funcionário Cadastrado Com Sucesso.");
		} else {
			System.out.println("Funcionário não Cadastrado. Lista cheia!");
		}
	}
	
	static void removerVendedor(Empresa t) {
		String nomeVendedor;
		
		sc.nextLine();
		System.out.println("Digite o Nome do Vendedor: ");
		nomeVendedor = sc.nextLine();
		
		if (t.removerVendedor(nomeVendedor)) {
			System.out.println("Funcionário Removido Com Sucesso.");
		} else {
			System.out.println("Funcionário Não Encontrado");
		}
	}
	
	static void pesquisarVendedores(Empresa t) {
		char tipoMercadoria;
		int quant;
		
		System.out.println("Digite o tipo de Mercadoria vendida(P - Perecível, N - Não Perecível): ");
		tipoMercadoria = sc.next().charAt(0);
		quant = t.pesquisarVendedores(tipoMercadoria);
		
		if (quant == 0) {
			System.out.println("Não Existem Vendedores dessa mercadoria.");
		} else {
			System.out.println("Existem " + t.pesquisarVendedores(tipoMercadoria) + " vendedores.");			
		}
	}

}