package shift.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import shift.com.br.domain.PostoColeta;

/** 
 * Repository JPA - Posto de Coleta
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@Repository
public interface PostoColetaRepository extends JpaRepository<PostoColeta, Integer> {

}
