package br.com.tiradentes.magister.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.tiradentes.magister.model.Certificado;
import br.com.tiradentes.magister.model.Status;

public class CertificadoDto {
	
	private Long id;
	private String nome;
	private Integer horas; 
	private String atividade;
	private Status status; 
	
	public CertificadoDto(Certificado certificado) {
	
		this.id = certificado.getId();
		this.nome = certificado.getNome();
		this.horas = certificado.getHoras();
		this.atividade = certificado.getAtividade();
		this.status = certificado.getStatus();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public Integer getHoras() {
		return horas;
	}
	public String getAtividade() {
		return atividade;
	}
	
	public Status getStatus() {
		return status;
	}

	public static List<CertificadoDto> converter(List<Certificado> certificados) {
		
		return certificados.stream().map(CertificadoDto :: new).collect(Collectors.toList());
	} 
	
	
	
	


}
