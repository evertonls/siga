package gov.amc.siga.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class OrdemServico implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long ordemServicoId;
	private Long numeroOrdemServico;
	private String medicao;
	private Long projetoId;
	private String observacaoVistoria;
	private String observacao;

	public OrdemServico() {
	}

	public OrdemServico(Long ordemServicoId, Long numeroOrdemServico, String medicao, Long projetoId,
			String observacaoVistoria, String observacao) {
		super();
		this.ordemServicoId = ordemServicoId;
		this.numeroOrdemServico = numeroOrdemServico;
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

	public Long getNumeroOrdemServico() {
		return numeroOrdemServico;
	}

	public void setNumeroOrdemServico(Long numeroOrdemServico) {
		this.numeroOrdemServico = numeroOrdemServico;
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
		if (this == obj)
			return true;
		if (!(obj instanceof OrdemServico))
			return false;

		OrdemServico os = (OrdemServico) obj;

		return Objects.equals(ordemServicoId, os.getOrdemServicoId());
	}

}
