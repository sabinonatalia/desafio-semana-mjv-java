package registroapp.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import registroapp.model.Registro;

public class LeitorRemessa {
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");

	private List<String> ler(String caminhoArquivo) {
		try {
			List<String> registro = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
			return registro;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Registro> converter(String caminhoArquivo) {

		List<String> conteudos = ler(caminhoArquivo);
		List<Registro> registro = new ArrayList<>();

		for (String linha : conteudos) {
			String[] campos = linha.split(";");
			Registro r = new Registro();
			r.setProfissao(campos[0]);
			r.setNome(campos[1]);
			r.setGenero(campos[2]);
			r.setSalarioMinimo(Double.valueOf(campos[3]));
			r.setSalarioMaximo(Double.valueOf(campos[4]));
			r.setCpf(campos[6]);
			r.setRg(campos[7]);
			r.setEndereco(campos[8]);
			r.setNumeroResidencia(campos[9]);
			r.setBairro(campos[10]);
			r.setMunicipio(campos [11]);
			r.setUf(campos[12]);
			r.setCep(campos[13]);
			r.setNaturalidade(campos[14]);
			r.setPais(campos[15]);
			r.setTelefone(campos[16]);
			r.setCelular(campos[17]);
			r.setEmail(campos[18]);
			String date = campos[5];
			LocalDate data = LocalDate.parse(date, formatter);
			r.setDataNascimento(data);

			registro.add(r);
		}

		return registro;
	}

}
