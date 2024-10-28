package principal;

public class Aluno {

	private int matricula;
	private String nomeAluno;
	private int numFalta;
	private double nota1;
	private double nota2;
	
	//Contrutores
	public Aluno(int matricula, String nomeAluno, int numFalta, double nota1, double nota2) {
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.numFalta = numFalta;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public Aluno() {
		this.matricula = 0;
		this.nomeAluno = "";
		this.numFalta = 0;
		this.nota1 = 0;
		this.nota2 = 0;
	}

	//getters = ler valor do atributo
	public int getMatricula() {
		return matricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}
	
	public int getNumFalta() {
		return numFalta;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	//setters = altera valor do atributo
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void setNumFalta(int numFalta) {
		this.numFalta = numFalta;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	//toString = mostra os conteúdos dos atributos
	@Override
	public String toString() {
		return "Matricula: " + this.matricula + "\n"
				+ "Nome: " + nomeAluno + "\n"
				+ "Numero de Faltas: " + numFalta + "\n"
				+ "Nota1: " + nota1 + "\n"
				+ "Nota2: " + nota2 + "\n";
	}
	
}
