package shift.com.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.domain.Convenio;
import shift.com.br.repository.ConvenioRepository;

/** 
 * Service  JPA - Convênio
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Service
@Transactional
public class ConvenioService {
	
	@Autowired
	ConvenioRepository convenioRepository;

	/** 
	 * Consulta de todos os convênios
	 * @author Thiago Hernandes de Souza
	 * @return lista de convênios
	 * @since 25-03-2018
	 * */
	public List<Convenio> todos() {
		return convenioRepository.findAll();
	}
	

}
