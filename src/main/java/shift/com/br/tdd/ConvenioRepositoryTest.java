package shift.com.br.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import shift.com.br.domain.Convenio;
import shift.com.br.repository.ConvenioRepository;

/**
 * Classe TDD Convênio
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConvenioRepositoryTest {

	@Autowired
	private ConvenioRepository convenioRepository;
	
	/**
	 * Consulta genérica Convênios
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void consultaGenerica(){
		List<Convenio> consulta = convenioRepository.findAll();
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Persistir Convenio
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void persistirConvenio(){
		Convenio convenio = convenioRepository.save(new Convenio("Teste"));
		assertNotNull(convenio);
	}
	
}
