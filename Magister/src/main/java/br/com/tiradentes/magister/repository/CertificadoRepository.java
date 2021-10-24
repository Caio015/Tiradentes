package br.com.tiradentes.magister.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.tiradentes.magister.model.Certificado;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificado, Long> {

	Certificado findByNome(String nome);
	
}
