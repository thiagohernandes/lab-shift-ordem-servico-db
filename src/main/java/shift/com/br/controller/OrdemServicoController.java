package shift.com.br.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import shift.com.br.domain.OrdemServico;
import shift.com.br.dto.OrdemServicoDTO;
import shift.com.br.service.OrdemServicoService;

/** 
 * REST Controller Ordem de Serviço
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@RestController
@RequestMapping("/api/ordens-servico")
public class OrdemServicoController {
	
	@Autowired
	OrdemServicoService ordemServicoService;
	
	/** 
	 * Salvar/persistir/controller OrdemServico
	 * @author Thiago Hernandes de Souza
	 * @param dados ordem de serviço
	 * @return OrdemServico
	 * @since 25-03-2018
	 * */
	@ResponseBody
	@PostMapping("/nova")
	public OrdemServico novo(@RequestBody OrdemServico ordemServico) {
		return ordemServicoService.salvar(ordemServico);
	}
	
	/** 
	 * Get/controller OrdemServico
	 * @author Thiago Hernandes de Souza
	 * @param id da ordem de serviço
	 * @since 25-03-2018
	 * */
	@GetMapping(value="/{id}")
	public OrdemServico getOrdemServico(@PathVariable("id") Integer id) {
		return ordemServicoService.getOrdemServico(id);
	}
	
	/** 
	 * Alterar/persistir/controller OrdemServico
	 * @author Thiago Hernandes de Souza
	 * @param id ordem de serviço
	 * @param dados ordem de serviço
	 * @return OrdemServico
	 * @since 25-03-2018
	 * */
	@ResponseBody
	@PutMapping(value="/alterar/{id}")
	public OrdemServico alterar(@PathVariable("id") Integer id, @RequestBody OrdemServico ordemServico ) {
		return ordemServicoService.salvar(ordemServico);
	}
	
	/** 
	 * Excluir/controller OrdemServico
	 * @author Thiago Hernandes de Souza
	 * @param id da ordem de serviço
	 * @since 25-03-2018
	 * */
	@DeleteMapping(value="/apagar/{id}")
	public void excluirFuncionario(@PathVariable("id") Integer id) {
		ordemServicoService.excluir(id);
	}
	
	/** 
	 * Consulta/controller genérica de Ordens de Serviço
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
	 * @throws java.text.ParseException 
	 * @since 24-03-2018
	 * */
	@GetMapping(value="/consulta/{pageLimit}/{pageNumber}")
	public List<OrdemServicoDTO> consultaGenerica(@RequestParam("dataInicial") String dataInicial,
												  @RequestParam("dataFinal") String dataFinal,
												  @RequestParam("nomePaciente") String nomePaciente,
												  @RequestParam("nomeConvenio") String nomeConvenio,
												  @RequestParam("nomePostoColeta") String nomePostoColeta,
												  @RequestParam("nomeMedico") String nomeMedico,
												  @RequestParam("nomeEspecialidade") String nomeEspecialidade,
												  @PathVariable("pageLimit") int pageLimit, 
									   			  @PathVariable("pageNumber") int pageNumber
									   			   ) throws NumberFormatException,ParseException, java.text.ParseException{

		return ordemServicoService.consultaOrdensServico(dataInicial,dataFinal,nomePaciente,nomeConvenio,nomePostoColeta,
				nomeMedico,nomeEspecialidade,pageLimit,pageNumber);
	}
	
}
