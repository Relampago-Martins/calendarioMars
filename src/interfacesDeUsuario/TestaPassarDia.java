package interfacesDeUsuario;
import entidades.Data;

public class TestaPassarDia {
	public static void main(String[] args) {
		Data dataHoje = new Data();
		for (int indice=0; indice<100; indice++) {
			dataHoje.passarDia();
			System.out.printf("%s\n", dataHoje.getDataFormatada());
		}
	}
}
