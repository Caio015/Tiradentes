package br.com.tiradentes.magister.dto;

import br.com.tiradentes.magister.model.Certificado;

public class CertificadoAdicionadoDto {
	
	private String nome;
	private Integer horas; 
	private String atividade;
	//Status viria Não Homologado por padrão!
	
	
	public CertificadoAdicionadoDto(String nome, Integer horas, String atividade) {
		this.nome = nome;
		this.horas = horas;
		this.atividade = atividade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getHoras() {
		return horas;
	}
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	public String getAtividade() {
		return atividade;
	}
	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}
	
	public Certificado converter() {
		
		return new Certificado(nome, atividade, horas);
	}
	
	

}
