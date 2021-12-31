package registroapp.util;

//import java.time.LocalDateTime;

import registroapp.model.Registro;

public class RegistroPrint {
	
	public void imprimir(Registro registro) {
		StringBuilder ficha =  new StringBuilder();
		ficha.append("============================== Ficha Profissional ==============================\n");
		ficha.append("\nProfissão: " + registro.getProfissao());
		ficha.append("\nNome: " + registro.getNome());
		ficha.append("\nSalário Requerido: Mínimo R$ " + registro.getSalarioMinimo() 
		+ " - " + "Máximo R$ " + registro.getSalarioMaximo());
		ficha.append("\nData de Nascimento: " + Formater.data(registro.getDataNascimento()) + " CPF: "
		+ Formater.cpf(registro.getCpf()) + " RG: " + Formater.rg(registro.getRg()));		
		ficha.append("\nGênero: " + registro.getGenero());
		ficha.append("\nEndereço: " + registro.getEndereco()+ " Nº: " + registro.getNumeroResidencia()
		+ " Bairro: " + registro.getBairro());
		ficha.append(" Município: " + registro.getMunicipio() + " UF: " + registro.getUf());
		ficha.append("\nCep: "+ registro.getCep() + " Naturalidade: " + registro.getNaturalidade() 
		+ " País: "+ registro.getPais());
		ficha.append("\nTelefone: " + registro.getTelefone() + " Celular: " + registro.getCelular());
		ficha.append("\nEmail: " + registro.getEmail());
		
		ficha.append("\n----------------------------------------------------------------------------------\n");
		
		ficha.append("Grau de Instrução: \n");
		
		ficha.append("Analfabeto			Ensino Fundamental		Superior\n");
		ficha.append("Lê e Escreve			Ensino Médio Incompleto		Mestrado\n");
        ficha.append("Fundamental Incompleto		Ensino Médio Completo		Doutorado\n");
		
        System.out.println(ficha);
	}

}

