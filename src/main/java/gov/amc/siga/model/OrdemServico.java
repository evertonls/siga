package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class OrdemServico implements Serializable {

	private static final long serialVersionUID = 1L;

	private long ordemServicoId;
	private int numero;
	private String medicao;
	private long projetoId;
	private String observacaoVistoria;
	private String observacao;

	public OrdemServico() {
	}

	public OrdemServico(long ordemServicoId, int numero, String medicao, long projetoId, String observacaoVistoria,
			String observacao) {
		this.ordemServicoId = ordemServicoId;
		this.numero = numero;
		this.medicao = medicao;
		this.projetoId = projetoId;
		this.observacaoVistoria = observacaoVistoria;
		this.observacao = observacao;
	}

	public long getOrdemServicoId() {
		return ordemServicoId;
	}

	public void setOrdemServicoId(long ordemServicoId) {
		this.ordemServicoId = ordemServicoId;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMedicao() {
		return medicao;
	}

	public void setMedicao(String medicao) {
		this.medicao = medicao;
	}

	public long getProjetoId() {
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

}
