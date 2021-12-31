package registroapp.util;

//import java.time.LocalDateTime;

import registroapp.model.Registro;

public class RegistroPrint {
	
	public void imprimir(Registro registro) {
		StringBuilder ficha =  new StringBuilder();
		ficha.append("============================== Ficha Profissional ==============================\n");
		ficha.append("\nProfiss�o: " + registro.getProfissao());
		ficha.append("\nNome: " + registro.getNome());
		ficha.append("\nSal�rio Requerido: M�nimo R$ " + registro.getSalarioMinimo() 
		+ " - " + "M�ximo R$ " + registro.getSalarioMaximo());
		ficha.append("\nData de Nascimento: " + Formater.data(registro.getDataNascimento()) + " CPF: "
		+ Formater.cpf(registro.getCpf()) + " RG: " + Formater.rg(registro.getRg()));		
		ficha.append("\nG�nero: " + registro.getGenero());
		ficha.append("\nEndere�o: " + registro.getEndereco()+ " N�: " + registro.getNumeroResidencia()
		+ " Bairro: " + registro.getBairro());
		ficha.append(" Munic�pio: " + registro.getMunicipio() + " UF: " + registro.getUf());
		ficha.append("\nCep: "+ registro.getCep() + " Naturalidade: " + registro.getNaturalidade() 
		+ " Pa�s: "+ registro.getPais());
		ficha.append("\nTelefone: " + registro.getTelefone() + " Celular: " + registro.getCelular());
		ficha.append("\nEmail: " + registro.getEmail());
		
		ficha.append("\n----------------------------------------------------------------------------------\n");
		
		ficha.append("Grau de Instru��o: \n");
		
		ficha.append("Analfabeto			Ensino Fundamental		Superior\n");
		ficha.append("L� e Escreve			Ensino M�dio Incompleto		Mestrado\n");
        ficha.append("Fundamental Incompleto		Ensino M�dio Completo		Doutorado\n");
		
        System.out.println(ficha);
	}

}

