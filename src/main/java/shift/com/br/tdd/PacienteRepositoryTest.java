package shift.com.br.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import shift.com.br.domain.Bairro;
import shift.com.br.domain.Paciente;
import shift.com.br.repository.BairroRepository;
import shift.com.br.repository.PacienteRepository;

/**
 * Classe TDD Pacientes
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PacienteRepositoryTest {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private BairroRepository bairroRepository;
	
	/**
	 * Consulta genérica Pacientes
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void consultaGenerica(){
		List<Paciente> consulta = pacienteRepository.findAll();
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Consulta por nome de paciente
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void consultaPacientePorNome(){
		List<Object> consulta = pacienteRepository.consultaPacientesPorNome("%Ma%");
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Persistir Paciente
	 * @author Thiago Hernandes de Souza
	 * @since 25-03-2018
	 * */
	@Test
	public void persistirPaciente(){
		Bairro bairro = bairroRepository.findOne(1);
		Paciente paciente = pacienteRepository.save(
									new Paciente("Paciente Nome Teste",bairro,
											     "Endereço teste, 1231","M",new Date()));
		assertNotNull(paciente);
	}
	

}
