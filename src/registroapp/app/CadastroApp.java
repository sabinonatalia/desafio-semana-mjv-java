package registroapp.app;

import java.util.List;

import registroapp.model.Registro;
import registroapp.util.LeitorRemessa;
import registroapp.util.RegistroPrint;

public class CadastroApp {

	public static void main(String[] args) {
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Registro> registros = leitor.converter("C:\\Users\\samsung\\Documents\\curso-java-mjv\\ficha.txt");
	
		/*for(Registro r: registros ) {
			System.out.println(r);
		}*/
	
		RegistroPrint printer = new RegistroPrint();
		for(Registro r: registros) {
			printer.imprimir(r);
		}
		
	}
}
