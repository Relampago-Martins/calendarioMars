package entidades;

public class Pessoa {
	String nome;
	Data dataNascimento;
	Endereco endereco;
	int cpf, idade=-1;
	
	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Pessoa(String nome, Data dataNascimento, int cpf) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	
	public int getIdade() {
	
		if (this.idade >= 0) {
			return this.idade;
		}else if (this.dataNascimento != null){
			Data dataHoje = new Data();
			return dataHoje.getDiferencaEmAnos(this.dataNascimento);
		}
		
		return -1;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setDataNascimento(Data dataNascimento) {
		
	}
}
