package exercicio06;

public class ContaBancaria {
	
	private int numConta;
	private String nomeCliente;
	private double saldo;
	
	public ContaBancaria(int numConta, String nomeCliente, double saldo) {
		this.numConta = numConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Numero da Conta: " + numConta + "\n"
				+ "Nome do Cliente: " + nomeCliente + "\n"
				+ "Saldo: R$" + saldo + "\n";
	}
	
}
