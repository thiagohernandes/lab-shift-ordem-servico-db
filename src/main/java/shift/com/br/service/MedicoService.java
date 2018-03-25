package shift.com.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.domain.Medico;
import shift.com.br.repository.MedicoRepository;

/** 
 * Service  JPA - Médico
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@Service
@Transactional
public class MedicoService {
	
	@Autowired
	MedicoRepository medicoRepository;

	/** 
	 * Consulta de todos os médicos
	 * @author Thiago Hernandes de Souza
	 * @return lista de médicos
	 * @since 25-03-2018
	 * */
	public List<Medico> todos() {
		return medicoRepository.findAll();
	}
}
