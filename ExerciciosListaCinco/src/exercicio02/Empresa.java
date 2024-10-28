package exercicio02;

public class Empresa {
	
	private Funcionario[] vetor;
	private int quantFunc;
	
	//construtor
	public Empresa(int tamanho) {
		this.vetor = new Funcionario[tamanho];
		this.quantFunc = 0;
	}
	
	//getters & setters
	public Funcionario getVetor(int indice) {
		return vetor[indice];
	}

	public void setVetor(int indice, Funcionario novo) {
		this.vetor[indice] = novo;
	}

	public int getQuantFunc() {
		return quantFunc;
	}

	public void setQuantFunc(int quantFunc) {
		this.quantFunc = quantFunc;
	}
	
	//mostrar todos os dados
	public String toString() {
		String resposta = "";
		
		for (int i=0; i < this.quantFunc; i++) {
			resposta += (i+1) + ". " + this.vetor[i].toString() + "\n";
		}
		return resposta;
	}
	
	public boolean adicionarVendedor(Funcionario novo) {
		if (this.vetor.length == this.quantFunc) {
			return false;
		} else {
			this.vetor[this.quantFunc] = novo;
			this.quantFunc++;
			return true;
		}
	}
	
	public boolean removerVendedor(String nome) {
		if (this.quantFunc == 0) {
			return false;
		} else {
			int i = 0;
			
			while (i < this.quantFunc && !this.vetor[i].getNomeVendedor().equals(nome)) {
				i++;
			}
			
			if (i == this.quantFunc) {
				return false;
			} else {
				this.vetor[i] = this.vetor[this.quantFunc-1];
				this.quantFunc--;
				return true;
			}
		}
	}
	
	public int pesquisarVendedores(char mercadoria) {
		int cont = 0;
		for (int i=0; i < this.quantFunc; i++) {
			if (this.vetor[i].getTipoMercadoria() == mercadoria) {
				cont++;
			}
		}
		return cont;
	}
	
}
