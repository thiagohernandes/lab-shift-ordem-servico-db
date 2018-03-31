package shift.com.br.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.dto.PacienteDTO;
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
	 * Consulta de todos os pacientes por nome
	 * @author Thiago Hernandes de Souza
	 * @param nome
	 * @return lista de pacientes
	 * @since 25-03-2018
	 * */
	public List<PacienteDTO> consultaPacientePorNome(String pNome) {
		List<Object> listaPacientes = pacienteRepository.consultaPacientesPorNome("%"+pNome+"%");
		List<PacienteDTO> retornoConsulta = new ArrayList<>();
		
		listaPacientes.forEach(item->{
			 Object[] row = (Object[]) item;
			 PacienteDTO pacienteDTO;
			try {
				pacienteDTO = new PacienteDTO(Integer.valueOf(row[0].toString()),
													  row[1].toString(),
													  row[2].toString(),
		 											  row[3].toString(),
		 											  row[4].toString());
				retornoConsulta.add(pacienteDTO);
			} catch (NumberFormatException e) {
				System.err.println("Problemas na formatação de dados");
				e.printStackTrace();
			}
			 
		});
		return retornoConsulta;
	}

}
