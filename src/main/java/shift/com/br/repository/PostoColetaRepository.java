package shift.com.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import shift.com.br.domain.PostoColeta;

/** 
 * Repository JPA - Posto de Coleta
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Repository
public interface PostoColetaRepository extends JpaRepository<PostoColeta, Integer> {
	
	/** 
	 * Consulta posto de coleta por nome
	 * @author Thiago Hernandes de Souza
	 * @param nome
	 * @return lista com postos de coleta
	 * @since 25-03-2018
	 * */
	@Query(value=   " select  pc.id as codigoPostoColeta, " + 
					"		  pc.nome as nomePostoColeta, " + 
					"	 	  CONCAT(ci.nome,' - ',ci.uf) as localidadePostoColeta " + 
					" from tbl_posto_coleta pc " + 
					" inner join tbl_bairro ba on ba.id = pc.id_bairro " + 
					" inner join tbl_cidade ci on ci.id = ba.id_cidade " + 
					" where pc.nome like :pNome" +
					" order by pc.nome, ci.nome ", nativeQuery=true)
	public List<Object> consultaPostosColetaPorNome(@Param("pNome") String pNome);

}
