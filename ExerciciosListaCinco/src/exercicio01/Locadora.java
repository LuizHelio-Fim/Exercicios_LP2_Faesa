package exercicio01;

public class Locadora {
	
	private Filme[] vetorFilmes;
	private int quantFilmes;
	
	//Construtor
	public Locadora(int tamanho) {
		this.vetorFilmes = new Filme[tamanho];
		this.quantFilmes = 0;
	}
	
	//getters & setters
	public Filme getVetorFilmes(int indice) {
		return vetorFilmes[indice];
	}

	public void setVetorFilmes(int indice, Filme novo) {
		this.vetorFilmes[indice] = novo;
	}

	public int getQuantFilmes() {
		return quantFilmes;
	}

	public void setQuantFilmes(int novo) {
		this.quantFilmes = novo;
	}
	
	//mostrar todos os dados
	public String toString() {
		String resposta = "";
		
		for (int i=0; i < this.quantFilmes; i++) {
			resposta += (i+1) + ". " + this.vetorFilmes[i].toString() + "\n";
		}
		return resposta;
	}

	//inserir um filme no vetor
	public boolean inserirDados(Filme novo) {
		if (this.quantFilmes == this.vetorFilmes.length) {
			return false;
		} else {
			this.vetorFilmes[this.quantFilmes] = novo;
			this.quantFilmes++;
			return true;
		}
	}
	
	//pesquisar quantidade de filmes por genero
	public int pesquisarGenero(char genero) {
		int cont = 0;
		for (int i=0; i < this.quantFilmes; i++) {
			if(this.vetorFilmes[i].getGenero() == genero) {
				cont++;
			}
		}
		return cont;
	}
	
	//remover um filme da locadora
	public boolean removerDados(String titulo) {
		if (this.quantFilmes == 0) {
			return false;
		} else {
			int i = 0;
			while (i < this.quantFilmes && !this.vetorFilmes[i].getTituloFilme().trim().equals(titulo)) {
				i++;
			}
			
			if (i == this.quantFilmes) {
				return false;
			} else {
				this.vetorFilmes[i] = this.vetorFilmes[this.quantFilmes-1];
				this.quantFilmes--;
				return true;
			}
		}
	}
	
}
