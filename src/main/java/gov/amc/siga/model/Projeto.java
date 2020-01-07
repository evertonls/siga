package gov.amc.siga.model;

import java.io.Serializable;
import java.text.Collator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Projeto implements Comparable<Projeto>, Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private long id;
	private String numero;
	private String prancha;
	private String revisao;
	private String contrato;
	private Date dataCricao;
	private String observacao;
	private String obra;
	private Date dataPrevista;
	private Date dataContratada;
	private Date dataInicial;
	private boolean recape;
	private String localRecape;
	private boolean execucaoRecape;
	private Date dataExecucaorecape;
	private List<Projeto> projetos;

	/*
	 * Falta referenciar outras listas de objetos
	 */

	public Projeto() {

	}

	public Projeto(long id, String numero, String prancha, String revisao, String contrato, Date dataCricao,
			String observacao, String obra, Date dataPrevista, Date dataContratada, Date dataInicial, boolean recape,
			String localRecape, boolean execucaoRecape, Date dataExecucaorecape) {
		super();
		this.id = id;
		this.numero = numero;
		this.prancha = prancha;
		this.revisao = revisao;
		this.contrato = contrato;
		this.dataCricao = dataCricao;
		this.observacao = observacao;
		this.obra = obra;
		this.dataPrevista = dataPrevista;
		this.dataContratada = dataContratada;
		this.dataInicial = dataInicial;
		this.recape = recape;
		this.localRecape = localRecape;
		this.execucaoRecape = execucaoRecape;
		this.dataExecucaorecape = dataExecucaorecape;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPrancha() {
		return prancha;
	}

	public void setPrancha(String prancha) {
		this.prancha = prancha;
	}

	public String getRevisao() {
		return revisao;
	}

	public void setRevisao(String revisao) {
		this.revisao = revisao;
	}

	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public Date getDataCricao() {
		return dataCricao;
	}

	public void setDataCricao(Date dataCricao) {
		this.dataCricao = dataCricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getObra() {
		return obra;
	}

	public void setObra(String obra) {
		this.obra = obra;
	}

	public Date getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public Date getDataContratada() {
		return dataContratada;
	}

	public void setDataContratada(Date dataContratada) {
		this.dataContratada = dataContratada;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public boolean isRecape() {
		return recape;
	}

	public void setRecape(boolean recape) {
		this.recape = recape;
	}

	public String getLocalRecape() {
		return localRecape;
	}

	public void setLocalRecape(String localRecape) {
		this.localRecape = localRecape;
	}

	public boolean isExecucaoRecape() {
		return execucaoRecape;
	}

	public void setExecucaoRecape(boolean execucaoRecape) {
		this.execucaoRecape = execucaoRecape;
	}

	public Date getDataExecucaorecape() {
		return dataExecucaorecape;
	}

	public void setDataExecucaorecape(Date dataExecucaorecape) {
		this.dataExecucaorecape = dataExecucaorecape;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this)
			return true;

		if (!(obj instanceof Projeto))
			return false;

		Projeto projeto = (Projeto) obj;

		return projeto.numero.equals(numero);
	}
	
	public int hasCode() {
		return Objects.hash(numero);
	}
	
	@Override
	public int compareTo(Projeto o) {
		Collator brCollator = Collator.getInstance(new Locale("pt", "BR"));
		brCollator.setStrength(Collator.PRIMARY);
		return brCollator.compare(numero, o.getNumero());
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

}

