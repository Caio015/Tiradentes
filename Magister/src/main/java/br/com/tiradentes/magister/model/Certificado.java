package br.com.tiradentes.magister.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "certificado")
public class Certificado {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDateTime data = LocalDateTime.now(); //Instanciada na construcao do objeto
	private Integer horas; 
	private String atividade; 
	@Enumerated
	private Status status;
	
	public Certificado() {
	}
	
	public Certificado(String nome, String atividade , Integer horas) {
		this.nome = nome;
		this.atividade = atividade;
		this.horas = horas;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public LocalDateTime getData() {
		return data;
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
	
}
