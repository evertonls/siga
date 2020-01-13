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
	private List<Aparelho> aparelhos;
	private Endereco endereco;
	private Classificacao classificacao;
	private Contratada contratada;
	private Descricao descricao;
	private List<Intervencao> intervencao;
	private Motivo motivo;
	private Setor setor;
	private TipoProjeto tipoProjeto;
	private TipoSituacao tipoSituacao;
	private Usuario usuario;

	public Projeto() {

	}

	public Projeto(long id, String numero, String prancha, String revisao, String contrato, Date dataCricao,
			String observacao, String obra, Date dataPrevista, Date dataContratada, Date dataInicial, boolean recape,
			String localRecape, boolean execucaoRecape, Date dataExecucaorecape, List<Aparelho> aparelhos,
			Endereco endereco, Classificacao classificacao, Contratada contratada, Descricao descricao,
			List<Intervencao> intervencao, Motivo motivo, Setor setor, TipoProjeto tipoProjeto,
			TipoSituacao tipoSituacao, Usuario usuario) {
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
		this.aparelhos = aparelhos;
		this.endereco = endereco;
		this.classificacao = classificacao;
		this.contratada = contratada;
		this.descricao = descricao;
		this.intervencao = intervencao;
		this.motivo = motivo;
		this.setor = setor;
		this.tipoProjeto = tipoProjeto;
		this.tipoSituacao = tipoSituacao;
		this.usuario = usuario;
	}

	public long getId() {
		return id;
	}

	public String getNumero() {
		return numero;
	}

	public String getPrancha() {
		return prancha;
	}

	public String getRevisao() {
		return revisao;
	}

	public String getContrato() {
		return contrato;
	}

	public Date getDataCricao() {
		return dataCricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public String getObra() {
		return obra;
	}

	public Date getDataPrevista() {
		return dataPrevista;
	}

	public Date getDataContratada() {
		return dataContratada;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public boolean isRecape() {
		return recape;
	}

	public String getLocalRecape() {
		return localRecape;
	}

	public boolean isExecucaoRecape() {
		return execucaoRecape;
	}

	public Date getDataExecucaorecape() {
		return dataExecucaorecape;
	}

	public List<Aparelho> getAparelhos() {
		return aparelhos;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public Contratada getContratada() {
		return contratada;
	}

	public Descricao getDescricao() {
		return descricao;
	}

	public List<Intervencao> getIntervencao() {
		return intervencao;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public Setor getSetor() {
		return setor;
	}

	public TipoProjeto getTipoProjeto() {
		return tipoProjeto;
	}

	public TipoSituacao getTipoSituacao() {
		return tipoSituacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setPrancha(String prancha) {
		this.prancha = prancha;
	}

	public void setRevisao(String revisao) {
		this.revisao = revisao;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public void setDataCricao(Date dataCricao) {
		this.dataCricao = dataCricao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setObra(String obra) {
		this.obra = obra;
	}

	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public void setDataContratada(Date dataContratada) {
		this.dataContratada = dataContratada;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public void setRecape(boolean recape) {
		this.recape = recape;
	}

	public void setLocalRecape(String localRecape) {
		this.localRecape = localRecape;
	}

	public void setExecucaoRecape(boolean execucaoRecape) {
		this.execucaoRecape = execucaoRecape;
	}

	public void setDataExecucaorecape(Date dataExecucaorecape) {
		this.dataExecucaorecape = dataExecucaorecape;
	}

	public void setAparelhos(List<Aparelho> aparelhos) {
		this.aparelhos = aparelhos;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

	public void setContratada(Contratada contratada) {
		this.contratada = contratada;
	}

	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}

	public void setIntervencao(List<Intervencao> intervencao) {
		this.intervencao = intervencao;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public void setTipoProjeto(TipoProjeto tipoProjeto) {
		this.tipoProjeto = tipoProjeto;
	}

	public void setTipoSituacao(TipoSituacao tipoSituacao) {
		this.tipoSituacao = tipoSituacao;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

}
