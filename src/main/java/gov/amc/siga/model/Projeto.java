package gov.amc.siga.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import org.springframework.stereotype.Component;

@Component
public class Projeto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long projetoId;
	private Integer numeroProjeto;
	private String prancha;
	private String revisao;
	private String contrato;
	private LocalDate dataCriacaoProjeto;
	private String obsevacao;
	private String projetoObra;
	private String prioridade;
	private LocalDate dataPrevista;
	private LocalDate dataEquipe;
	private LocalDate dataInicial;
	private Boolean isRecape;
	private String ciRecape;
	private String localRecape;
	private Boolean isRecapeExecutado;
	private LocalDate dataExecucaoRecape;

	private AparelhoTipo aparelhoTipo;
	private ClassificacaoTipo classificacaoTipo;
	private DescricaoTipo descricaoTipo;
	private Endereco endereco;
	private EquipeTipo equipeTipo;
	private IntervencaoTipo intervencaoTipo;
	private MotivoTipo motivoTipo;
	private OrdemServico ordemServico;
	private Permissao permissao;
	private SituacaoTipo situacaoTipo;
	private Usuario usuario;

	public Projeto() {
	}

	public Projeto(Long projetoId, Integer numeroProjeto, String prancha, String revisao, String contrato,
			LocalDate dataCriacaoProjeto, String obsevacao, String projetoObra, String prioridade,
			LocalDate dataPrevista, LocalDate dataEquipe, LocalDate dataInicial, Boolean isRecape, String ciRecape,
			String localRecape, Boolean isRecapeExecutado, LocalDate dataExecucaoRecape) {
		super();
		this.projetoId = projetoId;
		this.numeroProjeto = numeroProjeto;
		this.prancha = prancha;
		this.revisao = revisao;
		this.contrato = contrato;
		this.dataCriacaoProjeto = dataCriacaoProjeto;
		this.obsevacao = obsevacao;
		this.projetoObra = projetoObra;
		this.prioridade = prioridade;
		this.dataPrevista = dataPrevista;
		this.dataEquipe = dataEquipe;
		this.dataInicial = dataInicial;
		this.isRecape = isRecape;
		this.ciRecape = ciRecape;
		this.localRecape = localRecape;
		this.isRecapeExecutado = isRecapeExecutado;
		this.dataExecucaoRecape = dataExecucaoRecape;

	}

	public Projeto(Long projetoId, Integer numeroProjeto, String prancha, String revisao, String contrato,
			LocalDate dataCriacaoProjeto, String obsevacao, String projetoObra, String prioridade,
			LocalDate dataPrevista, LocalDate dataEquipe, LocalDate dataInicial, Boolean isRecape, String ciRecape,
			String localRecape, Boolean isRecapeExecutado, LocalDate dataExecucaoRecape, AparelhoTipo aparelhoTipo,
			ClassificacaoTipo classificacaoTipo, DescricaoTipo descricaoTipo, Endereco endereco, EquipeTipo equipeTipo,
			IntervencaoTipo intervencaoTipo, MotivoTipo motivoTipo, OrdemServico ordemServico, Permissao permissao,
			SituacaoTipo situacaoTipo, Usuario usuario) {
		super();
		this.projetoId = projetoId;
		this.numeroProjeto = numeroProjeto;
		this.prancha = prancha;
		this.revisao = revisao;
		this.contrato = contrato;
		this.dataCriacaoProjeto = dataCriacaoProjeto;
		this.obsevacao = obsevacao;
		this.projetoObra = projetoObra;
		this.prioridade = prioridade;
		this.dataPrevista = dataPrevista;
		this.dataEquipe = dataEquipe;
		this.dataInicial = dataInicial;
		this.isRecape = isRecape;
		this.ciRecape = ciRecape;
		this.localRecape = localRecape;
		this.isRecapeExecutado = isRecapeExecutado;
		this.dataExecucaoRecape = dataExecucaoRecape;
		this.aparelhoTipo = aparelhoTipo;
		this.classificacaoTipo = classificacaoTipo;
		this.descricaoTipo = descricaoTipo;
		this.endereco = endereco;
		this.equipeTipo = equipeTipo;
		this.intervencaoTipo = intervencaoTipo;
		this.motivoTipo = motivoTipo;
		this.ordemServico = ordemServico;
		this.permissao = permissao;
		this.situacaoTipo = situacaoTipo;
		this.usuario = usuario;
	}

	public Long getProjetoId() {
		return projetoId;
	}

	public void setProjetoId(Long projetoId) {
		this.projetoId = projetoId;
	}

	public Integer getNumeroProjeto() {
		return numeroProjeto;
	}

	public void setNumeroProjeto(Integer numeroProjeto) {
		this.numeroProjeto = numeroProjeto;
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

	public LocalDate getDataCriacaoProjeto() {
		return dataCriacaoProjeto;
	}

	public void setDataCriacaoProjeto(LocalDate dataCriacaoProjeto) {
		this.dataCriacaoProjeto = dataCriacaoProjeto;
	}

	public String getObsevacao() {
		return obsevacao;
	}

	public void setObsevacao(String obsevacao) {
		this.obsevacao = obsevacao;
	}

	public String getProjetoObra() {
		return projetoObra;
	}

	public void setProjetoObra(String projetoObra) {
		this.projetoObra = projetoObra;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public LocalDate getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(LocalDate dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public LocalDate getDataEquipe() {
		return dataEquipe;
	}

	public void setDataEquipe(LocalDate dataEquipe) {
		this.dataEquipe = dataEquipe;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(LocalDate dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Boolean getIsRecape() {
		return isRecape;
	}

	public void setIsRecape(Boolean isRecape) {
		this.isRecape = isRecape;
	}

	public String getCiRecape() {
		return ciRecape;
	}

	public void setCiRecape(String ciRecape) {
		this.ciRecape = ciRecape;
	}

	public String getLocalRecape() {
		return localRecape;
	}

	public void setLocalRecape(String localRecape) {
		this.localRecape = localRecape;
	}

	public Boolean getIsRecapeExecutado() {
		return isRecapeExecutado;
	}

	public void setIsRecapeExecutado(Boolean isRecapeExecutado) {
		this.isRecapeExecutado = isRecapeExecutado;
	}

	public LocalDate getDataExecucaoRecape() {
		return dataExecucaoRecape;
	}

	public void setDataExecucaoRecape(LocalDate dataExecucaoRecape) {
		this.dataExecucaoRecape = dataExecucaoRecape;
	}

	public AparelhoTipo getAparelhoTipo() {
		return aparelhoTipo;
	}

	public void setAparelhoTipo(AparelhoTipo aparelhoTipo) {
		this.aparelhoTipo = aparelhoTipo;
	}

	public ClassificacaoTipo getClassificacaoTipo() {
		return classificacaoTipo;
	}

	public void setClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		this.classificacaoTipo = classificacaoTipo;
	}

	public DescricaoTipo getDescricaoTipo() {
		return descricaoTipo;
	}

	public void setDescricaoTipo(DescricaoTipo descricaoTipo) {
		this.descricaoTipo = descricaoTipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public EquipeTipo getEquipeTipo() {
		return equipeTipo;
	}

	public void setEquipeTipo(EquipeTipo equipeTipo) {
		this.equipeTipo = equipeTipo;
	}

	public IntervencaoTipo getIntervencaoTipo() {
		return intervencaoTipo;
	}

	public void setIntervencaoTipo(IntervencaoTipo intervencaoTipo) {
		this.intervencaoTipo = intervencaoTipo;
	}

	public MotivoTipo getMotivoTipo() {
		return motivoTipo;
	}

	public void setMotivoTipo(MotivoTipo motivoTipo) {
		this.motivoTipo = motivoTipo;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	public Permissao getPermissao() {
		return permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	public SituacaoTipo getSituacaoTipo() {
		return situacaoTipo;
	}

	public void setSituacaoTipo(SituacaoTipo situacaoTipo) {
		this.situacaoTipo = situacaoTipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(projetoId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Projeto))
			return false;

		Projeto p = (Projeto) obj;

		return Objects.equals(projetoId, p.getProjetoId());

	}

}
