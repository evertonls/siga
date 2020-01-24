package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private long longradouroId;
	private String regional;
	private String divisao;
	private long bairroId;
	private long projetoId;

	public Endereco() {
	}

	public Endereco(long longradouroId, String regional, String divisao, long bairroId, long projetoId) {
		this.longradouroId = longradouroId;
		this.regional = regional;
		this.divisao = divisao;
		this.bairroId = bairroId;
		this.projetoId = projetoId;
	}

	public long getLongradouroId() {
		return longradouroId;
	}

	public void setLongradouroId(long longradouroId) {
		this.longradouroId = longradouroId;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	public long getBairroId() {
		return bairroId;
	}

	public void setBairroId(long bairroId) {
		this.bairroId = bairroId;
	}

	public long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

}
