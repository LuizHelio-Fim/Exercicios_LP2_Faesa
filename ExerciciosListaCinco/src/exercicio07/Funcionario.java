package exercicio07;

public class Funcionario {
	
	private String nome;
	private int horasTrab;
	private char categoria;
	
	public Funcionario(String nome, int horasTrab, char categoria) {
		this.nome = nome;
		this.horasTrab = horasTrab;
		this.categoria = categoria;
	}
	
	public Funcionario() {
		this.nome = "";
		this.horasTrab = 0;
		this.categoria =' ';
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrab() {
		return horasTrab;
	}

	public void setHorasTrab(int horasTrab) {
		this.horasTrab = horasTrab;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n"
				+ "Horas Trabalhadas: " + horasTrab + "\n"
				+ "Categoria: " + categoria + "\n";
	}
	
	
	
}
