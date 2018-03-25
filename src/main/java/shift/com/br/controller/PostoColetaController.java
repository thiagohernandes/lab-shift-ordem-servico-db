package shift.com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shift.com.br.dto.PostoColetaDTO;
import shift.com.br.service.PostoColetaService;

/** 
 * REST Controller Postos de Coleta
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RestController
@RequestMapping("/api/postos-coleta")
public class PostoColetaController {
	
	@Autowired
	PostoColetaService postoColetaService;
	
	/** 
	 * Consulta/controller postos de coleta por nome
	 * @author Thiago Hernandes de Souza
	 * @return lista com os pacientes
	 * @since 25-03-2018
	 * */
	@GetMapping(value="/consulta/{pNome}")
	public List<PostoColetaDTO> consultaPostosColetaPorNome(@PathVariable("pNome") String pNome){
		return postoColetaService.consultaPostoColetaPorNome("%"+pNome+"%");
	}
	
}
