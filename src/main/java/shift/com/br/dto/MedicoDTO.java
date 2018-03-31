package shift.com.br.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
 * Classe MédicoDTO - Mapeamento da classe de consulta de médicos e especialidades
 * @author Thiago Hernandes de Souza
 * @since 29-03-2018
 * */

@JsonInclude(Include.ALWAYS)
public class MedicoDTO {
	
	private Integer codigoMedico;
	private String nomeMedico;
	private String especialidadeMedico;
	
	public MedicoDTO() {
		
	}
	
	public MedicoDTO(Integer codigoMedico,String nomeMedico, String especialidadeMedico) {
		this.codigoMedico = codigoMedico;
		this.nomeMedico = nomeMedico;
		this.especialidadeMedico = especialidadeMedico;
	}

	public Integer getCodigoMedico() {
		return codigoMedico;
	}

	public void setCodigoMedico(Integer codigoMedico) {
		this.codigoMedico = codigoMedico;
	}

	public String getNomeMedico() {
		return nomeMedico;
	}

	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}

	public String getEspecialidadeMedico() {
		return especialidadeMedico;
	}

	public void setEspecialidadeMedico(String especialidadeMedico) {
		this.especialidadeMedico = especialidadeMedico;
	}

	
}
