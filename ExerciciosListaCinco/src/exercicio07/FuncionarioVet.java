package exercicio07;

public class FuncionarioVet {
	
	private Funcionario[] empresa;
	private int qntFunc;
	
	public FuncionarioVet(int tamanho) {
		this.empresa = new Funcionario[tamanho];
		this.qntFunc = 0;
	}

	public Funcionario getEmpresa(int indice) {
		return empresa[indice];
	}

	public void setEmpresa(Funcionario novo, int indice) {
		this.empresa[indice] = novo;
	}

	public int getQntFunc() {
		return qntFunc;
	}

	public void setQntFunc(int qntFunc) {
		this.qntFunc = qntFunc;
	}
	
	public String toString() {
		String resposta = "";
		
		for (int i=0; i < this.qntFunc; i++) {
			resposta += (i+1) + ". " + this.empresa[i].toString();
		}
		return resposta;
	}
	
	public boolean cadastroFuncionario(Funcionario novo) {
		if (this.empresa.length == this.qntFunc) {
			return false;
		} else {
			this.empresa[this.qntFunc] = novo;
			this.qntFunc++;
			return true;
		}
	}
	
	public boolean alterarHoras(String nome, int horas) {
		int i = 0;
		
		while (i < this.qntFunc && !this.empresa[i].getNome().equalsIgnoreCase(nome)) {
			i++;
		}
		
		if (this.empresa[i].getNome().equalsIgnoreCase(nome)) {
			this.empresa[i].setHorasTrab(horas);
			return true;
		} else {
			return false;
		}
	}
	
	public double[] salarioBruto() {
		double salarioBruto[] = new double[this.qntFunc];
		
		for(int i=0; i < this.qntFunc; i++) {
			if (this.empresa[i].getCategoria() == 'G' || this.empresa[i].getCategoria() == 'g' ) {
				salarioBruto[i] = (112.0 + (112.0*(15.0/100.0))) * this.empresa[i].getHorasTrab();
			} else {
				salarioBruto[i] = (112.0 + (112.0*(10.0/100.0))) * this.empresa[i].getHorasTrab();
			}
		}
		return salarioBruto;
	}
	
}
