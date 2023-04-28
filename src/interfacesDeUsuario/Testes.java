package interfacesDeUsuario;
import entidades.Data;
import entidades.Endereco;
import entidades.Pessoa;

public class Testes {
	public static void main(String[] args) {
		
		Data dataAgora = new Data();
		
		System.out.println(dataAgora.getDataFormatada());
		dataAgora.passarDia();
		System.out.println(dataAgora.getDataFormatada());
//-------------------------------------------------
		Endereco enderecoTeste = new Endereco("Frei Capucho",95370000, 682);
		System.out.printf("A tal Rua %s\n", enderecoTeste.getRua());
//-------------------------------------------------		
		Pessoa pessoinha = new Pessoa("Bruno", new Data(03,04,2003), 03652154022);
		pessoinha.setEndereco(enderecoTeste);
		System.out.printf("A idade de %s eh %d\n", 
				pessoinha.getNome(), pessoinha.getIdade());
		
	}
}
