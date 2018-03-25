package shift.com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shift.com.br.dto.PacienteDTO;
import shift.com.br.service.PacienteService;

/** 
 * REST Controller Pacientes
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RestController
@RequestMapping("/api/pacientes")
public class PacienteController {
	
	@Autowired
	PacienteService pacienteService;
	
	/** 
	 * Consulta/controller genérica de pacientes
	 * @author Thiago Hernandes de Souza
	 * @return lista com os médicos
	 * @since 25-03-2018
	 * */
	@GetMapping(value="/consulta/{pNome}")
	public List<PacienteDTO> consultaPacientePorNome(@PathVariable("pNome") String pNome){
		return pacienteService.consultaPacientePorNome(pNome);
	}
	
}
