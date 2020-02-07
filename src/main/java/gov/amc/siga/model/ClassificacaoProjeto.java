package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class ClassificacaoProjeto implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long projetoId;
	private ClassificacaoTipo classificacaoTipo;

	public ClassificacaoProjeto() {
	}

	public ClassificacaoProjeto(Long projetoId, ClassificacaoTipo classificacaoTipo) {
		super();
		this.projetoId = projetoId;
		this.classificacaoTipo = classificacaoTipo;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public ClassificacaoTipo getClassificacaoTipo() {
		return classificacaoTipo;
	}

	public void setClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		this.classificacaoTipo = classificacaoTipo;
	}

}
