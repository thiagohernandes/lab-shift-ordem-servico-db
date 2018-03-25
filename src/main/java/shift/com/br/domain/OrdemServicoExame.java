package shift.com.br.domain;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name="tbl_ordem_servico_exame")
@JsonInclude(Include.ALWAYS)
public class OrdemServicoExame {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@OneToOne(cascade = CascadeType.ALL)
	private OrdemServico ordemServico;
	@ManyToOne
	@JoinColumn(name="id_exame", referencedColumnName="id")
	private Exame exame;
	@Column(name="entrega_resultado")
	private Timestamp entregaResultado;
	@Column(name="preco")
	private float preco;
	
	public OrdemServicoExame() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public Timestamp getEntregaResultado() {
		return entregaResultado;
	}

	public void setEntregaResultado(Timestamp entregaResultado) {
		this.entregaResultado = entregaResultado;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	

}
