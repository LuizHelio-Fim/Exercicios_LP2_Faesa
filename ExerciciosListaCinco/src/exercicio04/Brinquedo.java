package exercicio04;

public class Brinquedo {
	
	private int code;
	private String desc;
	private double precoCompra;
	private double precoVenda;
	private int qntEstoque;
	private int estoqueMin;
	
	//Construtores
	public Brinquedo(int code, String desc, double precoCombra, double precoVenda, int qntEstoque, int estoqueMin) {
		this.code = code;
		this.desc = desc;
		this.precoCompra = precoCombra;
		this.precoVenda = precoVenda;
		this.qntEstoque = qntEstoque;
		this.estoqueMin = estoqueMin;
	}
	
	public Brinquedo() {
		this.code = 0;
		this.desc = "";
		this.precoCompra = 0.0;
		this.precoVenda = 0.0;
		this.qntEstoque = 0;
		this.estoqueMin = 0;
	}
	
	//getters & setters
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrecoCombra() {
		return precoCompra;
	}

	public void setPrecoCombra(double precoCombra) {
		this.precoCompra = precoCombra;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}

	public int getEstoqueMin() {
		return estoqueMin;
	}

	public void setEstoqueMin(int estoqueMin) {
		this.estoqueMin = estoqueMin;
	}

	@Override
	public String toString() {
		return "Código: " + code + "\n" + "Descrição: " + desc + "\n"
				+ "Preço de Compra: " + precoCompra + "\nPreço de Venda: " + precoVenda + "\n"
				+ "Em Estoque: " + qntEstoque + "\nValor Minimo em Estoque: " + estoqueMin + "\n";
	}
	
	
}
