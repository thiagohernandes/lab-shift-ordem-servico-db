package shift.com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shift.com.br.domain.Convenio;
import shift.com.br.service.ConvenioService;

/** 
 * REST Controller Convênios
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RestController
@RequestMapping("/api/convenios")
public class ConvenioController {
	
	@Autowired
	ConvenioService convenioService;
	
	/** 
	 * Consulta/controller postos de coleta - genérica
	 * @author Thiago Hernandes de Souza
	 * @return lista com os convênios
	 * @since 25-03-2018
	 * */
	@GetMapping(value="/todos")
	public List<Convenio> todos(){
		return convenioService.consulta();
	}
	
}
