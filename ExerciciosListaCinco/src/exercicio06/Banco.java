package exercicio06;

public class Banco {

	private ContaBancaria vetor[];
	private int qntContas;
	
	public Banco(int tamanho) {
		this.vetor = new ContaBancaria[tamanho];
		this.qntContas = 0;
	}

	public ContaBancaria getVetor(int index) {
		return vetor[index];
	}

	public void setVetor(int index, ContaBancaria novo) {
		this.vetor[index] = novo;
	}

	public int getQntContas() {
		return qntContas;
	}

	public void setQntContas(int qntContas) {
		this.qntContas = qntContas;
	}
	
	public boolean cadastrarContas (ContaBancaria novo) {
		if (this.vetor.length == this.qntContas) {
			return false;
		} else {
			boolean teste = false;
			for (int i=0; i < this.qntContas; i++) {
				if (this.vetor[i].getNumConta() == novo.getNumConta()) {
					teste = true;
					break;
				}
			}
			if (!teste) {
				this.vetor[this.qntContas] = novo;
				this.qntContas++;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public String visualizarContas (String nome){
		int cont = 0;
		
		for (int i = 0; i < this.qntContas; i++) {
		    if (this.vetor[i].getNomeCliente().equalsIgnoreCase(nome)) {
		        cont++;
		    }
		}

		int[] vetorIndex = new int[cont];
		cont = 0;
		
		for (int i=0; i < this.qntContas; i++) {
			if (this.vetor[i].getNomeCliente().equalsIgnoreCase(nome)) {
				vetorIndex[cont] = i;
				cont++;
			}
		}
		
		if (cont == 0) {
			return "";
		}
		
		String resposta = "Conta(s) do Cliente: " + nome + "\n";
		
		for (int i=0; i < vetorIndex.length; i++) {
			resposta += "Numero da Conta: " + this.vetor[vetorIndex[i]].getNumConta() + "\n"
						+ "Saldo da Conta: " + this.vetor[vetorIndex[i]].getSaldo() + "\n";
		}
		return resposta;
		
	}
	
	public boolean deletarConta() {
		if (this.qntContas == 0) {
			return false;
		} else {
			ContaBancaria temp;
			for (int i=0; i <this.qntContas - 1; i++) {
				for(int j=0; j <this.qntContas - i -1;j++) {
					if (this.vetor[j].getSaldo() > this.vetor[j+1].getSaldo()) {
						temp = this.vetor[j];
						this.vetor[j] = this.vetor[j+1];
						this.vetor[j+1] = temp;
					}
				}
			}
			
			this.vetor[0] = this.vetor[this.qntContas - 1];
			this.qntContas--;
			return true;
		}
	}
	
}
