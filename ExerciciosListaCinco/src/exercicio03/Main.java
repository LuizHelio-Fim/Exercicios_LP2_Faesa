package exercicio03;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		AlunosVet vetor = new AlunosVet(500);
		int op;
		
		do {
			System.out.print("MENU\n"
							+ "1. Cadastrar Aluno\n"
							+ "2. Remover Aluno\n"
							+ "3. Ver Todos os Alunos\n"
							+ "4. Consultar Alunos de Recuperação\n"
							+ "5. Média de Todos os alunos\n"
							+ "0. Sair\n> ");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					adicionarAluno(vetor);
					break;
				case 2:
					removerAluno(vetor);
					break;
				case 3:
					System.out.print(vetor.toString());
					break;
				case 4:
					pesquisarAlunos(vetor);
					break;
				case 5:
					calcularMedia(vetor);
					break;
				case 0:
					System.out.println("Fim do Programa.");
					break;
				default:
					System.out.println("ERRO: Opção Selecionada Inválida.");
			}
			
		} while (op != 0);
	}
	
	static void adicionarAluno(AlunosVet t) {
		Alunos aluno = new Alunos();
		
		int matricula;
		String nome;
		double nota1;
		double nota2;
		
		System.out.println("Digite a Matricula do Aluno: ");
		matricula = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o Nome do Aluno: ");
		nome = sc.nextLine();
		System.out.println("Digite a Nota 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a Nota 2: ");
		nota2 = sc.nextDouble();
		
		aluno = new Alunos(matricula, nome, nota1, nota2);
		if (t.adicionarDados(aluno)) {
			System.out.println("Aluno Cadastrado com Sucesso!");
		} else {
			System.out.println("Aluno Não Cadastrado, Colegio Cheio!");
		}
	}
	
	static void removerAluno(AlunosVet t) {
		String nomeAluno;
		
		sc.nextLine();
		System.out.println("Digite o Nome do Aluno: ");
		nomeAluno = sc.nextLine();
		
		if (t.removerDados(nomeAluno)) {
			System.out.println("Aluno Removido com Sucesso!");
		} else {
			System.out.println("Aluno Não Encontrado.");
		}
	}
	
	static void pesquisarAlunos(AlunosVet t) {
		if (t.pesquisarNomes().length == 0) {
			System.out.println("Nenhum Aluno de Recuperação.");
		} else {
			String[] recVet = new String[t.pesquisarNomes().length];
			recVet = t.pesquisarNomes();
			
			System.out.println("Alunos de Recuperação: ");
			for (int i=0; i < recVet.length; i++) {
				System.out.println((i+1) + ". " + recVet[i]);
			}
		}
	}
	
	static void calcularMedia(AlunosVet t) {
		double[] media = new double[t.media().length];
		media = t.media();
		
		for (int i=0; i < t.getQuantAlunos(); i++) {
			System.out.println((i+1) + ". Nome: " + t.getVetor(i).getNome() + "\n   Média: " + media[i] + "\n");
		}
	}

}
