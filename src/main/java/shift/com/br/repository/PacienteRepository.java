package shift.com.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import shift.com.br.domain.Paciente;

/** 
 * Repository JPA - Paciente
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
	
	/** 
	 * Consulta paciente por nome
	 * @author Thiago Hernandes de Souza
	 * @param nome
	 * @return lista com pacientes
	 * @since 25-03-2018
	 * */
	@Query(value=   " select 	pa.id as codigoPaciente, "+
					"		pa.nome as nomePaciente, "+
					"		pa.sexo as sexoPaciente, "+
					"		pa.data_nascimento as dataNascimento, "+
					"		CONCAT(pa.endereco,', ',ci.nome,' - ',ci.uf) as enderecoPaciente "+
					" from tbl_paciente pa "+
					" inner join tbl_bairro ba on ba.id = pa.id_bairro "+
					" inner join tbl_cidade ci on ci.id = ba.id_cidade "+
					" where pa.nome like :pNome"+
					" order by pa.nome, ci.nome ", nativeQuery=true)
	public List<Object> consultaPacientesPorNome(@Param("pNome") String pNome);

}
