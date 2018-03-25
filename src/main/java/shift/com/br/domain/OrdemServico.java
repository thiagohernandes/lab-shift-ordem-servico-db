package shift.com.br.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="tbl_ordem_servico")
@JsonInclude(Include.ALWAYS)
public class OrdemServico {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="data")
	private Timestamp data;
	@ManyToOne
	@JoinColumn(name="id_paciente", referencedColumnName="id")
	private Paciente paciente;
	@ManyToOne
	@JoinColumn(name="id_convenio", referencedColumnName="id")
	private Convenio convenio;
	@ManyToOne
	@JoinColumn(name="id_posto_coleta", referencedColumnName="id")
	private PostoColeta postoColeta;
	@ManyToOne
	@JoinColumn(name="id_medico", referencedColumnName="id")
	private Medico medico;
	
	public OrdemServico() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getData() {
		return data;
	}

	public void setData(Timestamp data) {
		this.data = data;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public PostoColeta getPostoColeta() {
		return postoColeta;
	}

	public void setPostoColeta(PostoColeta postoColeta) {
		this.postoColeta = postoColeta;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	

}
