package shift.com.br.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
 * Classe PostoColetaDTO - Mapeamento da classe de consulta de postos de coleta
 * @author Thiago Hernandes de Souza
 * @since 25-03-2018
 * */

@JsonInclude(Include.ALWAYS)
public class PostoColetaDTO {

	private Integer codigoPostoColeta;
	private String nomePostoColeta;
	private String localidadePostoColeta;
	
	public PostoColetaDTO() {
		
	}
	
	public PostoColetaDTO(Integer codigoPostoColeta, String nomePostoColeta, String localidadePostoColeta) {
		this.codigoPostoColeta = codigoPostoColeta;
		this.nomePostoColeta = nomePostoColeta;
		this.localidadePostoColeta = localidadePostoColeta;		
	}

	public Integer getCodigoPostoColeta() {
		return codigoPostoColeta;
	}

	public void setCodigoPostoColeta(Integer codigoPostoColeta) {
		this.codigoPostoColeta = codigoPostoColeta;
	}

	public String getNomePostoColeta() {
		return nomePostoColeta;
	}

	public void setNomePostoColeta(String nomePostoColeta) {
		this.nomePostoColeta = nomePostoColeta;
	}

	public String getLocalidadePostoColeta() {
		return localidadePostoColeta;
	}

	public void setLocalidadePostoColeta(String localidadePostoColeta) {
		this.localidadePostoColeta = localidadePostoColeta;
	}
	
	
}
