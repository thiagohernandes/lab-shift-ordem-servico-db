package shift.com.br.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import shift.com.br.domain.Especialidade;
import shift.com.br.domain.Medico;
import shift.com.br.repository.EspecialidadeRepository;
import shift.com.br.repository.MedicoRepository;

/**
 * Classe TDD Médicos
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedicoRepositoryTest {

	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;
	
	/**
	 * Consulta genérica Médicos
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void consultaGenerica(){
		List<Medico> consulta = medicoRepository.findAll();
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Consulta médicos e respectivas especialidades
	 * @author Thiago Hernandes de Souza
	 * @since 29-03-2018
	 * */
	@Test
	public void consultaMedicosEspecialidades(){
		List<Object> consulta = medicoRepository.consultaMedicosEspecialidades();
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Persistir Médico
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void persistirMedico(){
		Especialidade especialidade = especialidadeRepository.findOne(1);
		Medico medico = medicoRepository.save(new Medico("Fulano Teste",especialidade));
		assertNotNull(medico);
	}
	
}
