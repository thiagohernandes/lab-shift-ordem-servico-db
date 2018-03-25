package shift.com.br.dto;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class OrdemServicoDTO {
	
	private Integer numeroOrdemServico;
	private Timestamp dataCadastroOS;
	private int idConvenio;
	private int idMedico;
	private int idPaciente;
	private int idPostoColeta;
	private String nomePaciente;
	private String nomeConvenio;
	private String nomePostoColeta;
	private String nomeMedico;
	private String nomeEspecialidade;
	private String cidadePaciente;
	private String cidadeColeta;
	
	public OrdemServicoDTO() {
		
	}
	
	public OrdemServicoDTO(Integer numeroOrdemServico, Timestamp dataCadastroOS, int idConvenio,
						   int idMedico, int idPaciente, int idPostoColeta, String nomePaciente,
						   String nomeConvenio, String nomePostoColeta, String nomeMedico, 
						   String nomeEspecialidade, String cidadePaciente, String cidadeColeta) {
		this.numeroOrdemServico = numeroOrdemServico;
		this.dataCadastroOS = dataCadastroOS;
		this.idConvenio = idConvenio;
		this.idMedico = idMedico;
		this.idPaciente = idPaciente;
		this.idPostoColeta = idPostoColeta;
		this.nomePaciente = nomePaciente;
		this.nomeConvenio = nomeConvenio;
		this.nomePostoColeta = nomePostoColeta;
		this.nomeMedico = nomeMedico;
		this.nomeEspecialidade = nomeEspecialidade;
		this.cidadePaciente = cidadePaciente;
		this.cidadeColeta = cidadeColeta;
	}

	public Integer getNumeroOrdemServico() {
		return numeroOrdemServico;
	}

	public void setNumeroOrdemServico(Integer numeroOrdemServico) {
		this.numeroOrdemServico = numeroOrdemServico;
	}

	public Timestamp getDataCadastroOS() {
		return dataCadastroOS;
	}

	public void setDataCadastroOS(Timestamp dataCadastroOS) {
		this.dataCadastroOS = dataCadastroOS;
	}

	public int getIdConvenio() {
		return idConvenio;
	}

	public void setIdConvenio(int idConvenio) {
		this.idConvenio = idConvenio;
	}

	public int getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public int getIdPostoColeta() {
		return idPostoColeta;
	}

	public void setIdPostoColeta(int idPostoColeta) {
		this.idPostoColeta = idPostoColeta;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getNomeConvenio() {
		return nomeConvenio;
	}

	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}

	public String getNomePostoColeta() {
		return nomePostoColeta;
	}

	public void setNomePostoColeta(String nomePostoColeta) {
		this.nomePostoColeta = nomePostoColeta;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}

	public String getCidadePaciente() {
		return cidadePaciente;
	}

	public void setCidadePaciente(String cidadePaciente) {
		this.cidadePaciente = cidadePaciente;
	}

	public String getCidadeColeta() {
		return cidadeColeta;
	}

	public void setCidadeColeta(String cidadeColeta) {
		this.cidadeColeta = cidadeColeta;
	}

}
