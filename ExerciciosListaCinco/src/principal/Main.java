package principal;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		char op;
		//instancia o vetor
		AlunosVet turma = new AlunosVet(30);
		
		do {
			System.out.println("1. Cadastrar um aluno no arquivo\n"
						+ "2. Mostrar todos os dados dos alunos\n"
						+ "3. Mostrar dados de um aluno somente\n"
						+ "4. Excluir um aluno do arquivo\n"
						+ "5. Finalizar operações");
			op = sc.next().charAt(0);
			switch (op) {
			 case '1':
				 cadastrarAlunos(turma);
				 break;
			 case '2':
				 System.out.println(turma.toString());
				 break;
			 case '3':
				 pesquisarAluno(turma);
				 break;
			 case '4':
				 excluirAluno(turma);
				 break;
			 case '5':
				 System.out.println("Fim do Programa");
				 break;
			 default:
				 System.out.println("Opção Invalida. Tente Novamente!");
			}
		} while (op != '5');

	}
	
	static void cadastrarAlunos(AlunosVet t) {
		Aluno aluno = new Aluno();
		
		int mat, numFalta;
		String nome;
		double nota1, nota2;
		
		System.out.println("Digite a matricula do Aluno: ");
		mat = sc.nextInt();
		System.out.println("Digite o nome do Aluno: ");
		nome = sc.next();
		System.out.println("Digite o numero de faltas do aluno: ");
		numFalta = sc.nextInt();
		System.out.println("Digite a nota 1 do aluno: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2 do aluno: ");
		nota2 = sc.nextDouble();
		
		aluno = new Aluno(mat, nome, numFalta, nota1, nota2);
		if (t.inserirDados(aluno)) {
			System.out.println("Operação Realizada com sucesso.");
		} else {
			System.out.println("Operação não realizada. Arquivo Cheio.");
		}
		
	}
	
	static void pesquisarAluno(AlunosVet t) {
		int mat, posicao;
		
		System.out.println("Digite a matricula do Aluno: ");
		mat = sc.nextInt();
		posicao = t.pesquisarMatricula(mat);
		
		if (posicao == t.getQuantVetor()) {
			System.out.println("O Aluno não foi encontrado.");
		} else {
			System.out.println(t.getVetor(posicao));
		}
	}
	
	static void excluirAluno(AlunosVet t) {
		int mat;
		
		System.out.println("Digite a matricula do Aluno: ");
		mat = sc.nextInt();
		
		if (t.removerDados(mat)) {
			System.out.println("Operação realizada com sucesso.");
		} else {
			System.out.println("Operação NÃO realizada. Aluno não encontrado.");
		}
	}

}
