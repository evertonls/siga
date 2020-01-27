package gov.amc.siga.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Aparelho implements Serializable{

	private static final long serialVersionUID = 1L;
	private long projetoId;
	private String aparelhamentoCodigo;
	private double quantidade;
	
	public Aparelho() {	}

	public Aparelho(long projetoId, String aparelhamentoCodigo, double quantidade) {
		this.projetoId = projetoId;
		this.aparelhamentoCodigo = aparelhamentoCodigo;
		this.quantidade = quantidade;
	}

    public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(long projetoId) {
		this.projetoId = projetoId;
	}

	public String getaAparelhamentoCodigo() {
		return aparelhamentoCodigo;
	}

	public void setAparelhamentoCodigo(String aparelhamentoCodigo) {
		this.aparelhamentoCodigo = aparelhamentoCodigo;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Codigo do aparelho: " + aparelhamentoCodigo + ", Quantidade: " + quantidade + ", Projeto: " + projetoId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aparelhamentoCodigo == null) ? 0 : aparelhamentoCodigo.hashCode());
		result = prime * result + (int) (projetoId ^ (projetoId >>> 32));
		long temp;
		temp = Double.doubleToLongBits(quantidade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aparelho other = (Aparelho) obj;
		if (aparelhamentoCodigo == null) {
			if (other.aparelhamentoCodigo != null)
				return false;
		} else if (!aparelhamentoCodigo.equals(other.aparelhamentoCodigo))
			return false;
		if (projetoId != other.projetoId)
			return false;
		if (Double.doubleToLongBits(quantidade) != Double.doubleToLongBits(other.quantidade))
			return false;
		return true;
	}
	
	
	 
}
