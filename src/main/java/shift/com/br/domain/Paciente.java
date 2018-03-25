package shift.com.br.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/** 
 * Classe Paciente
 * @author Thiago Hernandes de Souza
 * @since 24-03-2018
 * */

@Entity
@Table(name="tbl_paciente")
@JsonInclude(Include.ALWAYS)
public class Paciente {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="nome")
	private String nome;
	@Column(name="endereco")
	private String endereco;
	@Column(name="sexo")
	private String sexo;
	@Column(name="data_nascimento")
	private Date data_nascimento;
	@OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_bairro")
	private Bairro bairro;
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, Bairro bairro, String endereco, 
					String sexo, Date data_nascimento) {
		this.nome = nome;
		this.bairro = bairro;
		this.endereco = endereco;
		this.sexo = sexo;
		this.data_nascimento = data_nascimento;
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
