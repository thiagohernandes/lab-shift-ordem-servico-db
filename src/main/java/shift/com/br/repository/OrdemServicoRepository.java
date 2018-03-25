package shift.com.br.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import shift.com.br.domain.OrdemServico;

/** 
 * Repository JPA - OrdemServico
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Integer> {

	/** 
	 * Consulta genérica de Ordens de Serviço
	 * @author Thiago Hernandes de Souza
	 * @param data inicial
	 * @param data final
	 * @param nome do paciente
	 * @param nome do convênio
	 * @param nome do posto de coleta
	 * @param nome do médico
	 * @param nome da especialidade
	 * @param limite de registros na página
	 * @param offset de registros
	 * @return lista com as ordens de serviço
	 * @since 24-03-2018
	 * */
	@Query(value=   " select 	os.id as numeroOrdemServico,  " + 
			"		os.`data` as dataCadastroOS,  " + 
			"		os.id_convenio as idConvenio,  " + 
			"		os.id_medico as idMedico,  " + 
			"		os.id_paciente as idPaciente,  " + 
			"		os.id_posto_coleta as idPostoColeta,  " + 
			"		pa.nome as nomePaciente,  " + 
			"		co.nome as nomeConvenio,  " + 
			"		pc.nome as nomePostoColeta,  " + 
			"		me.nome as nomeMedico,  " + 
			"		es.nome as nomeEspecialidade,  " + 
			"		concat(cip.nome,' - ',cip.uf) as cidadePaciente,  " + 
			"		concat(cic.nome,' - ',cic.uf) as cidadeColeta  " + 
			"		  " + 
			"from tbl_ordem_servico os   " + 
			"inner join tbl_paciente pa on pa.id = os.id_paciente  " + 
			"inner join tbl_convenio co on co.id = os.id_convenio  " + 
			"inner join tbl_posto_coleta pc on pc.id = os.id_posto_coleta  " + 
			"inner join tbl_medico me on me.id = os.id_medico  " + 
			"inner join tbl_especialidade es on es.id = me.id_especialidade   " + 
			"inner join tbl_bairro bap on bap.id = pa.id_bairro " + 
			"inner join tbl_cidade cip on cip.id = bap.id_cidade " + 
			"inner join tbl_bairro bac on bac.id = pc.id_bairro " + 
			"inner join tbl_cidade cic on cic.id = bac.id_cidade " + 
			"where " + 
			"	1 = 1 " + 
		/*	"	and os.`data` between :dataInicial and :dataFinal " + 
			"	and pa.nome like :nomePaciente " + 
			"	and co.nome like :nomeConvenio " + 
			"	and pc.nome like :nomePostoColeta " + 
			"	and me.nome like :nomeMedico " + 
			"	and es.nome like :nomeEspecialidade " + */
			" order by " + 
			"	os.`data` desc, " + 
			"	pa.nome asc  " +
			" limit :pageLimit offset :pageNumber", nativeQuery=true)
	public List<Object> consultaOrdensServico(@Param("pageLimit") int pageLimit, 
										      @Param("pageNumber") int pageNumber);
	
	/*@Param("dataInicial") Timestamp dataInicial,
    @Param("dataFinal") Timestamp dataFinal,
    @Param("nomePaciente") String nomePaciente,
    @Param("nomeConvenio") String nomeConvenio,
    @Param("nomePostoColeta") String nomePostoColeta,
    @Param("nomeMedico") String nomeMedico,
    @Param("nomeEspecialidade") String nomeEspecialidade,*/
}
