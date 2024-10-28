package exercicio02;

public class Funcionario {
	
	private int code;
	private String nomeVendedor;
	private char tipoMercadoria;
	
	//construtores
	public Funcionario(int code, String nomeVendedor, char tipoMercadoria) {
		this.code = code;
		this.nomeVendedor = nomeVendedor;
		this.tipoMercadoria = tipoMercadoria;
	}
	
	public Funcionario() {
		this.code = 0;
		this.nomeVendedor = "";
		this.tipoMercadoria = ' ';
	}

	//getters & setters
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public char getTipoMercadoria() {
		return tipoMercadoria;
	}

	public void setTipoMercadoria(char tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}

	//toString
	@Override
	public String toString() {
		return "\nCodigo do Funcionário: " + code + "\n"
				+ "Nome do Vendedor: " + nomeVendedor + "\n"
				+ "Mercadoria: " + tipoMercadoria;
	}
	
}
