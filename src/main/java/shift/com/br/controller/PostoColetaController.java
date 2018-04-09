package shift.com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import shift.com.br.domain.PostoColeta;
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
	 * @return lista com os postos de coleta
	 * @since 25-03-2018
	 * */
	@GetMapping(value="/consulta")
	public List<PostoColetaDTO> consultaPostosColetaPorNome(){
		return postoColetaService.consultaPostoColetaPorNome("%");
	}
	
	/** 
	 * Consulta/controller postos de coleta
	 * @author Thiago Hernandes de Souza
	 * @return lista com os postos de coleta
	 * @since 29-03-2018
	 * */
	@GetMapping(value="/todos")
	public List<PostoColeta> consultaPostosColeta(){
		return postoColetaService.consultaPostoColeta();
	}
	
	
}
