package shift.com.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.domain.PostoColeta;
import shift.com.br.repository.PostoColetaRepository;

/** 
 * Service  JPA - Posto de Coleta
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Service
@Transactional
public class PostoColetaService {
	
	@Autowired
	PostoColetaRepository postoColetaRepository;

	/** 
	 * Consulta de todos os postos de coleta
	 * @author Thiago Hernandes de Souza
	 * @return lista de postos de coleta
	 * @since 25-03-2018
	 * */
	public List<PostoColeta> todos() {
		return postoColetaRepository.findAll();
	}

}
