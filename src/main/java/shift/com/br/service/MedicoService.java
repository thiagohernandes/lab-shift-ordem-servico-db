package shift.com.br.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.domain.Medico;
import shift.com.br.dto.MedicoDTO;
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
	 * @since 29-03-2018
	 * */
	public List<Medico> todos() {
		return medicoRepository.findAll();
	}
	
	public List<MedicoDTO> consultaMedicosEspecialidades() throws NumberFormatException, ParseException{

			List<Object> listaMedicos = medicoRepository.consultaMedicosEspecialidades();
			List<MedicoDTO> retornoConsulta = new ArrayList<>();
			
			listaMedicos.forEach(item->{
			Object[] row = (Object[]) item;
			MedicoDTO medicoDTO;
			try {
				medicoDTO = new MedicoDTO(Integer.valueOf(row[0].toString()),row[1].toString(),row[2].toString());
				retornoConsulta.add(medicoDTO);
			} catch (NumberFormatException e) {
				System.err.println("Problemas na formatação de dados");
				e.printStackTrace();
			} 
			
			});
			return retornoConsulta;
	}
}
