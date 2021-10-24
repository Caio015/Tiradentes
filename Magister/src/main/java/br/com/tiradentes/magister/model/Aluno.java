package br.com.tiradentes.magister.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {
	
	@Id @ GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long matricula; 
	private String nome;
	private String cpf;
	@OneToMany
	private List<Certificado> certificados = new ArrayList<Certificado>(); 
	private Double totalHoras;
	
	public Aluno() {
	}

	public Aluno(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public List<Certificado> getCertificados() {
		return certificados;
	}
	
	// Metodo para retornar total de horas extracurriculares;
	public Double getTotalHoras() {
		
		for (Certificado certificado : certificados) {
			
			totalHoras += certificado.getHoras();
		}
		
		return totalHoras;
	}


	
	
	
	

	
	
}
