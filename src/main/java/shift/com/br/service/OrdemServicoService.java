package shift.com.br.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shift.com.br.domain.OrdemServico;
import shift.com.br.dto.OrdemServicoDTO;
import shift.com.br.repository.OrdemServicoRepository;
import shift.com.br.util.UtilShift;

/** 
 * Service  JPA - OrdemServico
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@Service
@Transactional
public class OrdemServicoService {
	
	@Autowired
	OrdemServicoRepository ordemServicoRepository;

	/** 
	 * Salvar/persistir/service OrdemServico
	 * @author Thiago Hernandes de Souza
	 * @param dados ordem de serviço
	 * @return OrdemServico
	 * @since 25-03-2018
	 * */
	public OrdemServico salvar(OrdemServico ordemServico) {
		return ordemServicoRepository.save(ordemServico);
	}
	
	/** 
	 * Get/service OrdemServico
	 * @author Thiago Hernandes de Souza
	 * @param id da ordem de serviço
	 * @since 25-03-2018
	 * */
	public OrdemServico getOrdemServico(Integer id) {
		return ordemServicoRepository.findOne(id);
	}
	
	/** 
	 * Excluir/service OrdemServico
	 * @author Thiago Hernandes de Souza
	 * @param id da ordem de serviço
	 * @since 25-03-2018
	 * */
	public void excluir(Integer id) {
		ordemServicoRepository.delete(id);
	}
	
	/** 
	 * Consulta/Service genérica de Ordens de Serviço
	 * @author Thiago Hernandes de Souza
	 * @param data inicial
	 * @param data final
	 * @param nome do paciente
	 * @param nome do convênio
	 * @param nome do posto de coleta
	 * @param nome do médico
	 * @param nome da especialidade
	 * @param limite de registros na página
	 * @param offset de registros
	 * @return lista com as ordens de serviço
	 * @since 24-03-2018
	 * */
	public List<OrdemServicoDTO> consultaOrdensServico(int pageLimit, int pageNumber) throws NumberFormatException, ParseException{
		
		List<Object> listaOrdensServico = ordemServicoRepository.consultaOrdensServico(pageLimit,pageNumber);
		List<OrdemServicoDTO> retornoConsulta = new ArrayList<>();
		
		listaOrdensServico.forEach(item->{
			 Object[] row = (Object[]) item;
			 OrdemServicoDTO ordemServicoDTO;
			try {
				ordemServicoDTO = new OrdemServicoDTO(Integer.valueOf(row[0].toString()),
						 											   new UtilShift().stringObjToTimestamp(row[1].toString()),
						 											   Integer.parseInt(row[2].toString()),
						 											   Integer.parseInt(row[3].toString()),
						 											   Integer.parseInt(row[4].toString()),
						 											   Integer.parseInt(row[5].toString()),
						 											   row[6].toString(),row[7].toString(),row[8].toString(),
						 											   row[9].toString(),row[10].toString(),row[11].toString(),
						 											   row[12].toString());
				retornoConsulta.add(ordemServicoDTO);
			} catch (NumberFormatException e) {
				System.err.println("Problemas na formatação de dados");
				e.printStackTrace();
			} catch (ParseException e) {
				System.err.println("Problemas ao realizar o parse de dados");
				e.printStackTrace();
			}
			 
		});
		return retornoConsulta;
	}

}
