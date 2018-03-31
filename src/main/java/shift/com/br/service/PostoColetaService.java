package shift.com.br.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.domain.PostoColeta;
import shift.com.br.dto.PostoColetaDTO;
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
	public List<PostoColeta> consultaPostoColeta() {
		return postoColetaRepository.findAll();
	}
	
	/** 
	 * Consulta de todos os postos de coleta por nome
	 * @author Thiago Hernandes de Souza
	 * @param nome do posto de coleta
	 * @return lista de postos de coleta
	 * @since 25-03-2018
	 * */
	public List<PostoColetaDTO> consultaPostoColetaPorNome(String pNome) {
		List<Object> listaPostosColeta = postoColetaRepository.consultaPostosColetaPorNome("%"+pNome+"%");
		List<PostoColetaDTO> retornoConsulta = new ArrayList<>();
		
		listaPostosColeta.forEach(item->{
			 Object[] row = (Object[]) item;
			 PostoColetaDTO postoColetaDTO;
			try {
				postoColetaDTO = new PostoColetaDTO(Integer.valueOf(row[0].toString()),
						 							row[1].toString(),
						 							row[2].toString());
				retornoConsulta.add(postoColetaDTO);
			} catch (NumberFormatException e) {
				System.err.println("Problemas na formatação de dados");
				e.printStackTrace();
			} 
			 
		});
		return retornoConsulta;
	}

}
