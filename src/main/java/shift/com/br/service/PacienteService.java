package shift.com.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.domain.Paciente;
import shift.com.br.repository.PacienteRepository;

/** 
 * Service  JPA - Paciente
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Service
@Transactional
public class PacienteService {
	
	@Autowired
	PacienteRepository pacienteRepository;

	/** 
	 * Consulta de todos os pacientes
	 * @author Thiago Hernandes de Souza
	 * @return lista de pacientes
	 * @since 25-03-2018
	 * */
	public List<Paciente> todos() {
		return pacienteRepository.findAll();
	}

}
