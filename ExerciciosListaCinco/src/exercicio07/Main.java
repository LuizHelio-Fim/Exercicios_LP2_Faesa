package exercicio07;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		FuncionarioVet vetor = new FuncionarioVet(18);
		
		int op;
		
		do {
			System.out.println("MENU\n"
							+ "1. Cadastrar Funcionário\n"
							+ "2. Alterar Horas Trabalhadas\n"
							+ "3. Mostrar Funcionários\n"
							+ "0. Sair");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					cadastrarFuncionario(vetor);
					break;
				case 2:
					alterarHoras(vetor);
					break;
				case 3:
					mostrarFuncionarios(vetor);
					break;
				case 0:
					System.out.println("Fim do Programa.");
					break;
				default:
					System.out.println("ERRO: Valor Digitado Inválido.");
			}
		} while (op != 0);

	}
	
	static void cadastrarFuncionario(FuncionarioVet t) {
		Funcionario novo = new Funcionario();
		
		String nome;
		int horasTrab;
		char categoria;
		
		sc.nextLine();
		System.out.println("Digite o Nome do Funcionário: ");
		nome = sc.nextLine().toUpperCase();
		System.out.println("Digite a Quantidade de Horas trabalhadas: ");
		horasTrab = sc.nextInt();
		System.out.println("Digite a Categoria do Funcionário (O - operário, G - gerente): ");
		categoria = sc.next().charAt(0);
		
		novo = new Funcionario(nome, horasTrab, categoria);
		
		if (t.cadastroFuncionario(novo)) {
			System.out.println("Funcionário Cadastrado com Sucesso!");
		} else {
			System.out.println("Funcionário Não Cadastrado. Lista Cheia!");
		}
	}
	
	static void alterarHoras(FuncionarioVet t) {
		String nome;
		int horas;
		
		sc.nextLine();
		System.out.println("Digite o Nome do Funcionário: ");
		nome = sc.nextLine().toUpperCase();
		System.out.println("Digite a Nova Quantidade de Horas: ");
		horas = sc.nextInt();
		
		if (t.alterarHoras(nome, horas)) {
			System.out.println("Horas alterado com Sucesso!");
		} else {
			System.out.println("Funcionário Não Encontrado!");
		}
	}
	
	static void mostrarFuncionarios(FuncionarioVet t) {
	    double[] vetor = t.salarioBruto(); 
	    
	    for (int i = 0; i < t.getQntFunc(); i++) {
	        Funcionario funcionario = t.getEmpresa(i);
	        System.out.println(funcionario.toString() + " R$" + vetor[i] + "\n");
	    }
	}


}
