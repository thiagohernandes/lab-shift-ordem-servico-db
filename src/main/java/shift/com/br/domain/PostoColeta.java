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
 * Classe PostoColeta
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@Entity
@Table(name="tbl_posto_coleta")
@JsonInclude(Include.ALWAYS)
public class PostoColeta {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="nome")
	private String nome;
	@ManyToOne
	@JoinColumn(name="id_bairro", referencedColumnName="id")
	private Bairro bairro;
	
	public PostoColeta() {
		
	}
	
	public PostoColeta(String nome, Bairro bairro) {
		this.nome = nome;
		this.bairro = bairro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}


}
