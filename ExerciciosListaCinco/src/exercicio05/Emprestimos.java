package exercicio05;

public class Emprestimos {
	
	private String nomeCliente;
	private double valorEmprestimo;
	private double jurosMensais;
	
	public Emprestimos(String nomeCliente, double valorEmprestimo, double jurosMensais) {
		this.nomeCliente = nomeCliente;
		this.valorEmprestimo = valorEmprestimo;
		this.jurosMensais = jurosMensais;
	}
	
	public Emprestimos() {
		this.nomeCliente = "";
		this.valorEmprestimo = 0.00;
		this.jurosMensais = 0.0;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public double getJurosMensais() {
		return jurosMensais;
	}

	public void setJurosMensais(double novo) {
		this.jurosMensais = novo;
	}

	@Override
	public String toString() {
		return "Nome do Cliente: " + nomeCliente + "\n"
				+ "Valor do Emprestimo: " + valorEmprestimo + "\n"
				+ "Taxa de Juros: " + jurosMensais + "\n";
	}
	
}
