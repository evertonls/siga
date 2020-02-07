package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class OrdemServico implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long projetoId;
	private Long ordemServicoId;
	private Integer numeroOrdemServico;
	private String medicao;
	private String observacaoVistoria;
	private String observacao;

	public OrdemServico() {
	}

	public OrdemServico(Long ordemServicoId, Integer numero, String medicao, Long projetoId, String observacaoVistoria,
			String observacao) {
		super();
		this.ordemServicoId = ordemServicoId;
		this.numeroOrdemServico = numero;
		this.medicao = medicao;
		this.projetoId = projetoId;
		this.observacaoVistoria = observacaoVistoria;
		this.observacao = observacao;
	}

	public Long getOrdemServicoId() {
		return ordemServicoId;
	}

	public void setOrdemServicoId(Long ordemServicoId) {
		this.ordemServicoId = ordemServicoId;
	}

	public Integer getnumeroOrdemServico() {
		return numeroOrdemServico;
	}

	public void setnumeroOrdemServico(Integer numero) {
		this.numeroOrdemServico = numero;
	}

	public String getMedicao() {
		return medicao;
	}

	public void setMedicao(String medicao) {
		this.medicao = medicao;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public String getObservacaoVistoria() {
		return observacaoVistoria;
	}

	public void setObservacaoVistoria(String observacaoVistoria) {
		this.observacaoVistoria = observacaoVistoria;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ordemServicoId);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if( !( obj instanceof OrdemServico))
			return false;
		
		OrdemServico os = (OrdemServico) obj;
		
		return Objects.equals(ordemServicoId, os.getOrdemServicoId());
	}

}
