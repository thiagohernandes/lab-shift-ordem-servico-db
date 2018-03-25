package shift.com.br.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
 * Classe PacienteDTO - Mapeamento da classe de consulta de pacientes
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@JsonInclude(Include.ALWAYS)
public class PacienteDTO {
	
	private Integer codigoPaciente;
	private String nomePaciente;
	private String sexoPaciente;
	private Date dataNascimento;
	private String enderecoPaciente;
	
	public PacienteDTO() {
		
	}
	
	public PacienteDTO(Integer codigoPaciente,String nomePaciente, String sexoPaciente, 
					   Date dataNascimento, String enderecoPaciente) {
		this.codigoPaciente = codigoPaciente;
		this.nomePaciente = nomePaciente;
		this.sexoPaciente = sexoPaciente;
		this.dataNascimento = dataNascimento;
		this.enderecoPaciente = enderecoPaciente;		
	}

	public Integer getCodigoPaciente() {
		return codigoPaciente;
	}

	public void setCodigoPaciente(Integer codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}

	public String getSexoPaciente() {
		return sexoPaciente;
	}

	public void setSexoPaciente(String sexoPaciente) {
		this.sexoPaciente = sexoPaciente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEnderecoPaciente() {
		return enderecoPaciente;
	}

	public void setEnderecoPaciente(String enderecoPaciente) {
		this.enderecoPaciente = enderecoPaciente;
	}
	
}
