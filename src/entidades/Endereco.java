package entidades;

public class Endereco {

	String rua, cidade, estado, complemento;
	int numero, CEP;
	
	public Endereco(String estado, String cidade, String rua, int numero) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
	}
	
	public Endereco(String rua, int CEP, int numero) {
		super();
		this.CEP = CEP;
		this.rua = rua;
		this.numero = numero;
	}

	public String getRua() {
		return this.rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return this.cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getComplemento() {
		return this.complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getCEP() {
		return this.CEP;
	}
	public void setCEP(int CEP) {
		this.CEP = CEP;
	}
	
}
