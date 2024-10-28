package exercicio03;

public class AlunosVet {
	
	private Alunos[] vetor;
	private int quantAlunos;
	
	//construtor
	public AlunosVet(int tamanho) {
		this.vetor = new Alunos[tamanho];
		this.quantAlunos = 0;
	}

	//getters & setters
	public Alunos getVetor(int indice) {
		return vetor[indice];
	}

	public void setVetor(Alunos novo, int indice) {
		this.vetor[indice] = novo;
	}

	public int getQuantAlunos() {
		return quantAlunos;
	}

	public void setQuantAlunos(int quantAlunos) {
		this.quantAlunos = quantAlunos;
	}
	
	//mostrar tudo na tela 
	public String toString() {
		String resposta = "";
		
		for (int i= 0; i <this.quantAlunos; i++) {
			resposta += (i+1) + ". " + this.vetor[i].toString() + "\n";
		}
		return resposta;
	}
	
	//adicionar Alunos
	public boolean adicionarDados(Alunos novo) {
		if (this.vetor.length == this.quantAlunos) {
			return false;
		} else {
			this.vetor[this.quantAlunos] = novo;
			this.quantAlunos++;
			return true;
		}
	}
	
	//remover Alunos
	public boolean removerDados(String novo) {
		if (this.quantAlunos == 0) {
			return false;
		} else {
			int i = 0;
			
			while (i < this.quantAlunos && !this.vetor[i].getNome().equals(novo)) {
				i++;
			}
			
			if (i == this.quantAlunos) {
				return false;
			} else {
				this.vetor[i] = this.vetor[this.quantAlunos - 1];
				this.quantAlunos--;
				return true;
			}
		}
	}
	
	//pesquisar alunos de recuperação
	public String[] pesquisarNomes() {
		if (this.quantAlunos == 0 || this.vetor == null || this.vetor.length == 0) {
			return new String[0];
		}
		
		int cont = 0;
		
		while (cont < this.quantAlunos && this.vetor[cont].getNota1() < 6.0 && this.vetor[cont].getNota2() < 6.0) {
			cont++;
		}
		
		String[] abaixoMedia = new String[cont];
		
		cont = 0;
		for (int i=0; i < this.quantAlunos; i++) {
			if (this.vetor[i].getNota1() < 6.0 && this.vetor[i].getNota2() < 6.0) {
				abaixoMedia[cont] = this.vetor[i].getNome();
				cont++;
			}
		}
		return abaixoMedia;
	}
	
	//calcular a média aritmética de cada aluno
	public double[] media() {
		double [] vetMedia = new double[this.quantAlunos];
		
		for (int i=0; i < this.quantAlunos; i++) {
			vetMedia[i] = (this.vetor[i].getNota1() + this.vetor[i].getNota2())/2;
		}
		return vetMedia;
	}
}
