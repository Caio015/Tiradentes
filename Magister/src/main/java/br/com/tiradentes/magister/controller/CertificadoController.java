package br.com.tiradentes.magister.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import br.com.tiradentes.magister.dto.CertificadoAdicionadoDto;
import br.com.tiradentes.magister.dto.CertificadoDto;
import br.com.tiradentes.magister.model.Certificado;
import br.com.tiradentes.magister.repository.CertificadoRepository;

@RestController
@RequestMapping("/certificados")
public class CertificadoController {
	
	@Autowired
	private CertificadoRepository certificadoRepository; 
	
	@GetMapping
	public ResponseEntity<List<CertificadoDto>> getAll(){
		
		List<Certificado> certificados = certificadoRepository.findAll(); 
		return ResponseEntity.ok().body(CertificadoDto.converter(certificados)); 
		
	}
	
	@PostMapping
	public ResponseEntity<CertificadoDto> cadastrarCertificado(@RequestBody CertificadoAdicionadoDto certificadoAdicionado,
			UriComponentsBuilder uriBuilder) {
		
		Certificado certificado = certificadoAdicionado.converter();
		certificadoRepository.save(certificado);
		
		URI uri = uriBuilder.path("certificados/{id}").buildAndExpand(certificado.getId()).toUri();
		
		return ResponseEntity.created(uri).body(new CertificadoDto(certificado));
	}
	
	@GetMapping("/{nome}")
	public ResponseEntity<CertificadoDto> procurarPorNome(@PathVariable String nome) {
		
		Certificado certificadoPorNome = certificadoRepository.findByNome(nome);
		
		return ResponseEntity.ok().body(new CertificadoDto(certificadoPorNome));
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> remover(@PathVariable Long id) {
		
		certificadoRepository.deleteById(id);
		
		return ResponseEntity.ok().build();
	}

}
