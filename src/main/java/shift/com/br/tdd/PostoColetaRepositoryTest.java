package shift.com.br.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import shift.com.br.domain.Bairro;
import shift.com.br.domain.PostoColeta;
import shift.com.br.repository.BairroRepository;
import shift.com.br.repository.PostoColetaRepository;

/**
 * Classe TDD Posto de Coleta
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostoColetaRepositoryTest {
	
	@Autowired
	private PostoColetaRepository postoColetaRepository;
	
	@Autowired
	private BairroRepository bairroRepository;
	
	/**
	 * Consulta genérica Postos de Coleta
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void consultaGenerica(){
		List<PostoColeta> consulta = postoColetaRepository.findAll();
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Consulta por nome de posto de coleta
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void consultaPostoColetaPorNome(){
		List<Object> consulta = postoColetaRepository.consultaPostosColetaPorNome("%po%");
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Persistir Posto de Coleta
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void persistirPostoColeta(){
		Bairro bairro = bairroRepository.findOne(2);
		PostoColeta postoColeta = postoColetaRepository.save(
									new PostoColeta("Posto Coleta Teste",bairro));
		assertNotNull(postoColeta);
	}

}
