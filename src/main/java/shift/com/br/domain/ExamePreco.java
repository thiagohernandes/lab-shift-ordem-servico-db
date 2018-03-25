package shift.com.br.domain;

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

/** 
 * Classe ExamePreco
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@Entity
@Table(name="tbl_exame_preco")
@JsonInclude(Include.ALWAYS)
public class ExamePreco {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@ManyToOne
	@JoinColumn(name="id_exame", referencedColumnName="id")
	private Exame exame;
	@ManyToOne
	@JoinColumn(name="id_convenio", referencedColumnName="id")
	private Convenio convenio;
	@Column(name="preco")
	private float preco;
	
	public ExamePreco() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public Convenio getConvenio() {
		return convenio;
	}

	public void setConvenio(Convenio convenio) {
		this.convenio = convenio;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
}
