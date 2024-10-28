package principal;

public class AlunosVet {

	private Aluno [] vetor;
	private int quantVetor;

	//constructor
	public AlunosVet(int tamanho) {
		this.vetor = new Aluno [tamanho];
		this.quantVetor = 0;
	}

	//getters e setters
	public Aluno getVetor(int indice) { //retornar somente UM aluno
		return this.vetor[indice];
	}

	public void setVetor(int indice, Aluno novo) { //altera somente UM aluno
		this.vetor[indice] = novo;
	}

	public int getQuantVetor() {
		return quantVetor;
	}

	public void setQuantVetor(int quantVetor) {
		this.quantVetor = quantVetor;
	}

	//inserir um aluno no objeto vetor
	public boolean inserirDados(Aluno novo) {
		if (this.quantVetor == this.vetor.length) {
			return false;
			
		} else {
			this.vetor[this.quantVetor] = novo;
			this.quantVetor++;
			return true;
		}
	}
	
	//Pesquisar a posição de um aluno no vetor
	public int pesquisarMatricula(int matricula) {
		for (int i=0; i < this.quantVetor; i++) {
			if (this.vetor[i].getMatricula() == matricula) {
				return i;
			}
		}
		return this.quantVetor;
	}
	
	//remover um aluno do objeto vetor
	public boolean removerDados(int matricula) {
		if (this.quantVetor ==0) {
			return false;
		} else {
			int i = 0;
			while (i < this.quantVetor && this.vetor[i].getMatricula() != matricula) {
				i++;
			}
			if (i == this.quantVetor) {
				return false;
			} else {
				this.vetor[i] = this.vetor[this.quantVetor-1];
				this.quantVetor--;
				return true;
			}
		}
	}
	
	//mostrar todos os dados do objeto vetor
	public String toString() {
		String resposta = "";
		
		for (int i=0; i<this.quantVetor; i++) {
			resposta += (i+1) + "." + this.vetor[i].toString();
		}
		return resposta;
	}
}
