package exercicio01;

public class Filme {
	
	private int code;
	private String tituloFilme;
	private char genero;
	
	//Construtores
	public Filme(int code, String tituloFilme, char genero) {
		this.code = code;
		this.tituloFilme = tituloFilme;
		this.genero = genero;
	}
	
	public Filme() {
		this.code = 0;
		this.tituloFilme = "";
		this.genero = ' ';
	}

	//getters & setters
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTituloFilme() {
		return tituloFilme;
	}

	public void setTituloFilme(String tituloFilme) {
		this.tituloFilme = tituloFilme;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	//mostrar na tela
	@Override
	public String toString() {
		return "Código: " + code + "\n"
				+ "Titulo do Filme: " + tituloFilme + "\n"
				+ "Gênero: " + genero;
	}
	
}