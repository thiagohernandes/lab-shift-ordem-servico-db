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
 * Classe Exames
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@Entity
@Table(name="tbl_exame")
@JsonInclude(Include.ALWAYS)
public class Exame {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="nome")
	private String nome;
	@ManyToOne
	@JoinColumn(name="id_setor", referencedColumnName="id")
	private Setor setor;
	@Column(name="material_biologico")
	private String materialBiologico;
	@Column(name="prazo")
	private int prazo;
	
	public Exame() {
		
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

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getMaterialBiologico() {
		return materialBiologico;
	}

	public void setMaterialBiologico(String materialBiologico) {
		this.materialBiologico = materialBiologico;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

}
