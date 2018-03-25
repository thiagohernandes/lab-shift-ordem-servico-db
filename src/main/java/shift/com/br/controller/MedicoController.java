package shift.com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shift.com.br.domain.Medico;
import shift.com.br.service.MedicoService;

/** 
 * REST Controller Médicos
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {
	
	@Autowired
	MedicoService medicoService;
	
	/** 
	 * Consulta/controller genérica de médicos
	 * @author Thiago Hernandes de Souza
	 * @return lista com os médicos
	 * @since 25-03-2018
	 * */
	@GetMapping(value="/consulta")
	public List<Medico> todos(){
		return medicoService.todos();
	}
	
}
