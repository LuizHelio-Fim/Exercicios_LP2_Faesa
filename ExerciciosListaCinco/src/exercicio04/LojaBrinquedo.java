package exercicio04;

public class LojaBrinquedo {
	
	private Brinquedo[] brinquedos;
	private int quantBrinquedos;
	
	public LojaBrinquedo(int tamanho) {
		this.brinquedos = new Brinquedo[tamanho];
		this.quantBrinquedos = 0;
	}

	public Brinquedo getBrinquedos(int indice) {
		return brinquedos[indice];
	}

	public void setBrinquedos(int indice, Brinquedo novo) {
		this.brinquedos[indice] = novo;
	}

	public int getQuantBrinquedos() {
		return quantBrinquedos;
	}

	public void setQuantBrinquedos(int quantBrinquedos) {
		this.quantBrinquedos = quantBrinquedos;
	}

	public String toString() {
		String resposta = "";
		
		for (int i=0; i < this.quantBrinquedos; i++) {
			resposta += (i+1) + ". " + this.brinquedos[i].toString() + "\n";
		}
		return resposta;
	}
	
	//entrada de Dados
	public boolean entradaDados(Brinquedo novo) {
		if (this.brinquedos.length == this.quantBrinquedos) {
			return false;
		} else {
			this.brinquedos[this.quantBrinquedos] = novo;
			this.quantBrinquedos++;
			return true;
		}
	}
	
	//saida de Dados
	public boolean saidaDados(int novo) {
		if (this.quantBrinquedos == 0) {
			return false;
		} else {
			int i = 0;
			
			while (i < this.quantBrinquedos && this.brinquedos[i].getCode() != novo) {
				i++;
			}
			
			if (i == this.quantBrinquedos) {
				return false;
			} else {
				this.brinquedos[i] = this.brinquedos[this.quantBrinquedos - 1];
				this.quantBrinquedos--;
				return true;
			}
		}
	}
	
	public double lucroObtido(int code) {
		int i = 0;
		
		while (i < this.quantBrinquedos && this.brinquedos[i].getCode() != code) {
			i++;
		}
		
		if (i == this.quantBrinquedos) {
			return 0.00;
		} else {
			return (this.brinquedos[i].getPrecoVenda() - this.brinquedos[i].getPrecoCombra()) * this.brinquedos[i].getQntEstoque();
		}
	}
	
	public int[] estoqueAbaixo() {
		if (this.quantBrinquedos == 0 || this.brinquedos == null || this.brinquedos.length == 0) {
			return new int[0];
		}
		
		int cont = 0;
		
		while (cont < this.quantBrinquedos && this.brinquedos[cont].getQntEstoque() < this.brinquedos[cont].getEstoqueMin()) {
			cont++;
		}
		
		int[] produtos = new int[cont];
		
		cont = 0;
		for (int i=0; i < this.quantBrinquedos; i++) {
			if (this.brinquedos[cont].getQntEstoque() < this.brinquedos[cont].getEstoqueMin()) {
				produtos[cont] = this.brinquedos[i].getCode();
				cont++;
			}
		}
		return produtos;
	}
	
}
