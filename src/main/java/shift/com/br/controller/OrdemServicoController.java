package shift.com.br.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shift.com.br.dto.OrdemServicoDTO;
import shift.com.br.service.OrdemServicoService;

/** 
 * REST Controller OrdemServico
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@RestController
@RequestMapping("/api/ordem-servicos")
public class OrdemServicoController {
	
	@Autowired
	OrdemServicoService ordemServicoService;
	
	@GetMapping(value="/todas/{pageLimit}/{pageNumber}")
	public List<OrdemServicoDTO> todas(@PathVariable("pageLimit") int pageLimit, 
									   @PathVariable("pageNumber") int pageNumber) throws NumberFormatException,
																						  ParseException{
		return ordemServicoService.consultaOrdensServico(pageLimit,pageNumber);
	}

}
