package exercicio05;

public class EmprestimosVet {

	private Emprestimos[] vetor;
	private int qntEmprestimos;
	
	public EmprestimosVet(int tamanho) {
		this.vetor = new Emprestimos[tamanho];
		this.qntEmprestimos = 0;
	}

	public Emprestimos getVetor(int indice) {
		return vetor[indice];
	}

	public void setVetor(int indice, Emprestimos novo) {
		this.vetor[indice] = novo;
	}

	public int getQntEmprestimos() {
		return qntEmprestimos;
	}

	public void setQntEmprestimos(int qntEmprestimos) {
		this.qntEmprestimos = qntEmprestimos;
	}

	@Override
	public String toString() {
		String resposta = "";
		double[] juros = new double[this.qntEmprestimos];
		juros = this.calcularJuros();
		
		for (int i=0; i < this.qntEmprestimos; i++) {
			resposta += (i+1) + ". " + this.vetor[i].toString();
			resposta += "Juros Mensal: " + juros[i] + "\n";
		}
		return resposta;
	}
	
	public boolean cadastrarEmprestimo(Emprestimos novo) {
		boolean teste = false;
		
		if (this.vetor.length == this.qntEmprestimos) {
			return false;
		} else {
			for (int i=0; i < this.qntEmprestimos; i++) {
				teste = this.vetor[i].getNomeCliente().equalsIgnoreCase(novo.getNomeCliente());
				if (teste) {
					break;
				}
			}
			if (!teste) {
				this.vetor[this.qntEmprestimos] = novo;
				this.qntEmprestimos++;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public double[] calcularJuros() {
		double[] jurosVet = new double[this.qntEmprestimos];
		
		for (int i=0; i < this.qntEmprestimos; i++) {
			jurosVet[i] = (this.vetor[i].getValorEmprestimo() * (this.vetor[i].getJurosMensais()/100));
		}
		
		return jurosVet;
	}
	
	public boolean alterarJuros(double novo) {
		Emprestimos temp;
		for (int i=0; i < this.qntEmprestimos - 1; i++) {
			for (int j=0; j < this.qntEmprestimos - 1 - i; j++) {
				if (this.vetor[j].getValorEmprestimo() < this.vetor[j+1].getValorEmprestimo()) {
					temp = this.vetor[j];
					this.vetor[j] = this.vetor[j+1];
					this.vetor[j+1] = temp;
				}
			}
		}
		
		if (this.qntEmprestimos == 0) {
			return false;
		} else {
			this.vetor[0].setJurosMensais(novo);
			return true;
		}
	}
	
}
