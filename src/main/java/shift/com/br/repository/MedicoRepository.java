package shift.com.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import shift.com.br.domain.Medico;

/** 
 * Repository JPA - Médico
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {
	
	/** 
	 * Consulta genérica de médicos e respectivas especialidades
	 * @author Thiago Hernandes de Souza
	 * @return lista com os médicos e especialidades
	 * @since 29-03-2018
	 * */
	@Query(value=" select 	m.id as codigoMedico, " + 
			"	   m.nome as nomeMedico, " + 
			"	   e.nome as especialidadeMedico " + 
			"	   from tbl_medico m inner join tbl_especialidade e on e.id = m.id_especialidade " + 
			"	   order by e.nome,m.nome", nativeQuery=true)
	public List<Object> consultaMedicosEspecialidades();

}
