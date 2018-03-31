package shift.com.br.tdd;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import shift.com.br.domain.OrdemServico;
import shift.com.br.repository.ConvenioRepository;
import shift.com.br.repository.MedicoRepository;
import shift.com.br.repository.OrdemServicoRepository;
import shift.com.br.repository.PacienteRepository;
import shift.com.br.repository.PostoColetaRepository;
import shift.com.br.util.UtilShift;

/**
 * Classe TDD Ordem de Serviço
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrdemServicoRepositoryTest {
	
	@Autowired
	private PostoColetaRepository postoColetaRepository;
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Autowired
	private ConvenioRepository convenioRepository;
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	/**
	 * Consulta genérica de Ordens de Serviço
	 * @author Thiago Hernandes de Souza
	 * @throws ParseException 
	 * @since 25-03-2018
	 * */
	@Test
	public void consultaGenerica() throws ParseException{
		OrdemServico ordemServico = ordemServicoRepository.save(new OrdemServico(new UtilShift().timeStampToString("2018-01-01 00:00:00"),
													 pacienteRepository.findOne(1),convenioRepository.findOne(1),
													 postoColetaRepository.findOne(1),medicoRepository.findOne(1)));
		
		List<Object> consulta = ordemServicoRepository.consultaOrdensServico("2018-01-01", "2018-01-01", 
																			 ordemServico.getPaciente().getNome(),
																			 ordemServico.getConvenio().getNome(), 
																			 ordemServico.getPostoColeta().getNome(),
																			 ordemServico.getMedico().getNome(), 
																			 medicoRepository.findOne(1).getEspecialidade().getNome(),
																			 10, 0);
		assertNotNull(consulta);
		assertTrue(!consulta.isEmpty());
	}
	
	/**
	 * Persistir Ordem de Serviço
	 * @author Thiago Hernandes de Souza
	 * @throws ParseException 
	 * @since 25-03-2018
	 * */
	@Test
	public void persistirOrdemServico() throws ParseException{
		OrdemServico ordemServico = ordemServicoRepository.save(new OrdemServico(new UtilShift().timeStampToString("2017-01-01 00:00:00"),
													 pacienteRepository.findOne(1),convenioRepository.findOne(1),
													 postoColetaRepository.findOne(1),medicoRepository.findOne(1)));
		
		assertNotNull(ordemServico);
	}

}
