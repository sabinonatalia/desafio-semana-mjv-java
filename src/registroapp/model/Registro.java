package registroapp.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Registro {
	
	private String profissao;
	private String nome;
	private String genero;
	private Double salarioMinimo;
	private Double salarioMaximo;
	private LocalDate dataNascimento;
	private String cpf;
	private String rg;
	private String endereco;
	private String numeroResidencia;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;
	private String naturalidade;
	private String pais;
	private String telefone;
	private String celular;
	private String email;

	List<Registro> registro = new ArrayList<Registro>();
		
	public List<Registro> getRegistro() {
		return registro;
	}

	public void setRegistro(List<Registro> registro) {
		this.registro = registro;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Double getSalarioMinimo() {
		return salarioMinimo;
	}

	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}

	public Double getSalarioMaximo() {
		return salarioMaximo;
	}

	public void setSalarioMaximo(Double salarioMaximo) {
		this.salarioMaximo = salarioMaximo;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumeroResidencia() {
		return numeroResidencia;
	}

	public void setNumeroResidencia(String numeroResidencia) {
		this.numeroResidencia = numeroResidencia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Registro [profissao=" + profissao + ", nome=" + nome + ", genero=" + genero + ", salarioMinimo="
				+ salarioMinimo + ", salarioMaximo=" + salarioMaximo + ", dataNascimento=" + dataNascimento + ", cpf="
				+ cpf + ", rg=" + rg + ", endereco=" + endereco + ", numeroResidencia=" + numeroResidencia + ", bairro="
				+ bairro + ", municipio=" + municipio + ", uf=" + uf + ", cep=" + cep + ", naturalidade=" + naturalidade
				+ ", pais=" + pais + ", telefone=" + telefone + ", celular=" + celular + ", email=" + email
				+ ", registro=" + registro + "]";
	}
	
	
}
