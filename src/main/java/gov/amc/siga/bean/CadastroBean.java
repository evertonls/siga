package gov.amc.siga.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import gov.amc.siga.dao.interfaces.AparelhoTipoDao;
import gov.amc.siga.dao.interfaces.BairroDao;
import gov.amc.siga.dao.interfaces.ClassificacaoTipoDao;
import gov.amc.siga.dao.interfaces.DescricaoTipoDao;
import gov.amc.siga.dao.interfaces.EnderecoDao;
import gov.amc.siga.dao.interfaces.EquipeTipoDao;
import gov.amc.siga.dao.interfaces.IntervencaoTipoDao;
import gov.amc.siga.dao.interfaces.LongradouroDao;
import gov.amc.siga.dao.interfaces.MotivoTipoDao;
import gov.amc.siga.dao.interfaces.OrdemServicoDao;
import gov.amc.siga.dao.interfaces.ProjetoTipoDao;
import gov.amc.siga.dao.interfaces.SituacaoTipoDao;
import gov.amc.siga.model.AparelhoTipo;
import gov.amc.siga.model.Bairro;
import gov.amc.siga.model.ClassificacaoTipo;
import gov.amc.siga.model.DescricaoTipo;
import gov.amc.siga.model.Endereco;
import gov.amc.siga.model.EquipeTipo;
import gov.amc.siga.model.IntervencaoTipo;
import gov.amc.siga.model.Longradouro;
import gov.amc.siga.model.MotivoTipo;
import gov.amc.siga.model.OrdemServico;
import gov.amc.siga.model.Projeto;
import gov.amc.siga.model.ProjetoTipo;
import gov.amc.siga.model.SituacaoTipo;

@Component
@Scope(value = "view")
public class CadastroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private AparelhoTipoDao aparelhoTipoDao;
	
	private BairroDao bairroDao;
	private ClassificacaoTipoDao classificacaoTipoDao;
	private DescricaoTipoDao descricaoTipoDao;
	private EnderecoDao enderecoDao;
	private EquipeTipoDao equipeTipoDao;
	private IntervencaoTipoDao intervencaoTipoDao;
	private LongradouroDao longradouroDao;
	private MotivoTipoDao motivoTipoDao;
	private OrdemServicoDao ordemServicoDao;
	private ProjetoTipoDao projetoTipoDao;
	private SituacaoTipoDao situacaoTipoDao;

	private Projeto projeto;

	private List<AparelhoTipo> listaAparelhos;
	private List<Bairro> listaBairros;
	private List<ClassificacaoTipo> listaClassificacoes;
	private List<DescricaoTipo> listaDescricoes;
	private List<Endereco> listaEnderecos;
	private List<EquipeTipo> listaEquipes;
	private List<IntervencaoTipo> listaIntevencoes;
	private List<Longradouro> listaLongradouros;
	private List<MotivoTipo> listaMotivos;
	private List<OrdemServico> listaOrdensServicos;
	private List<SituacaoTipo> listaSituacoes;
	private List<ProjetoTipo> listaTiposProjeto;

	@Autowired
	public CadastroBean(ClassificacaoTipoDao classificacaoTipoDao, EquipeTipoDao equipeTipoDao,
			DescricaoTipoDao descricaoTipoDao, MotivoTipoDao motivoTipoDao, SituacaoTipoDao situacaoTipoDao,
			BairroDao bairroDao, LongradouroDao longradouroDao) {
		super();
		this.equipeTipoDao = equipeTipoDao;
		this.classificacaoTipoDao = classificacaoTipoDao;
		this.descricaoTipoDao = descricaoTipoDao;
		this.motivoTipoDao = motivoTipoDao;
		this.situacaoTipoDao = situacaoTipoDao;
		this.bairroDao = bairroDao;
		this.longradouroDao = longradouroDao;
	}

	@PostConstruct
	private void loadObjects() {
		this.listaEquipes = new ArrayList<EquipeTipo>();
		this.listaEquipes = this.equipeTipoDao.listarTodasEquipesTipo();

		this.listaClassificacoes = new ArrayList<ClassificacaoTipo>();
		this.listaClassificacoes = this.classificacaoTipoDao.listarTodasClassificacaoTipo();

		this.listaDescricoes = new ArrayList<DescricaoTipo>();
		this.listaDescricoes = this.descricaoTipoDao.listarTodasDescricoesTipos();

		this.listaMotivos = new ArrayList<MotivoTipo>();
		this.listaMotivos = this.motivoTipoDao.listarTodosMotivosTipos();

		this.listaSituacoes = new ArrayList<SituacaoTipo>();
		this.listaSituacoes = this.situacaoTipoDao.listarTodasSituacoesTipos();

		this.listaBairros = new ArrayList<Bairro>();
		this.listaBairros = this.bairroDao.listarTodosBairros();
		
		this.listaLongradouros = new ArrayList<Longradouro>();
		this.listaLongradouros = this.longradouroDao.listarTodosLongradouros();
	}

	public AparelhoTipoDao getAparelhoTipoDao() {
		return aparelhoTipoDao;
	}

	public void setAparelhoTipoDao(AparelhoTipoDao aparelhoTipoDao) {
		this.aparelhoTipoDao = aparelhoTipoDao;
	}

	public BairroDao getBairroDao() {
		return bairroDao;
	}

	public void setBairroDao(BairroDao bairroDao) {
		this.bairroDao = bairroDao;
	}

	public ClassificacaoTipoDao getClassificacaoTipoDao() {
		return classificacaoTipoDao;
	}

	public void setClassificacaoTipoDao(ClassificacaoTipoDao classificacaoTipoDao) {
		this.classificacaoTipoDao = classificacaoTipoDao;
	}

	public DescricaoTipoDao getDescricaoTipoDao() {
		return descricaoTipoDao;
	}

	public void setDescricaoTipoDao(DescricaoTipoDao descricaoTipoDao) {
		this.descricaoTipoDao = descricaoTipoDao;
	}

	public EnderecoDao getEnderecoDao() {
		return enderecoDao;
	}

	public void setEnderecoDao(EnderecoDao enderecoDao) {
		this.enderecoDao = enderecoDao;
	}

	public EquipeTipoDao getEquipeTipoDao() {
		return equipeTipoDao;
	}

	public void setEquipeTipoDao(EquipeTipoDao equipeTipoDao) {
		this.equipeTipoDao = equipeTipoDao;
	}

	public IntervencaoTipoDao getIntervencaoTipoDao() {
		return intervencaoTipoDao;
	}

	public void setIntervencaoTipoDao(IntervencaoTipoDao intervencaoTipoDao) {
		this.intervencaoTipoDao = intervencaoTipoDao;
	}

	public LongradouroDao getLongradouroDao() {
		return longradouroDao;
	}

	public void setLongradouroDao(LongradouroDao longradouroDao) {
		this.longradouroDao = longradouroDao;
	}

	public MotivoTipoDao getMotivoTipoDao() {
		return motivoTipoDao;
	}

	public void setMotivoTipoDao(MotivoTipoDao motivoTipoDao) {
		this.motivoTipoDao = motivoTipoDao;
	}

	public OrdemServicoDao getOrdemServicoDao() {
		return ordemServicoDao;
	}

	public void setOrdemServicoDao(OrdemServicoDao ordemServicoDao) {
		this.ordemServicoDao = ordemServicoDao;
	}

	public ProjetoTipoDao getProjetoTipoDao() {
		return projetoTipoDao;
	}

	public void setProjetoTipoDao(ProjetoTipoDao projetoTipoDao) {
		this.projetoTipoDao = projetoTipoDao;
	}

	public SituacaoTipoDao getSituacaoTipoDao() {
		return situacaoTipoDao;
	}

	public void setSituacaoTipoDao(SituacaoTipoDao situacaoTipoDao) {
		this.situacaoTipoDao = situacaoTipoDao;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public List<AparelhoTipo> getListaAparelhos() {
		return listaAparelhos;
	}

	public void setListaAparelhos(List<AparelhoTipo> listaAparelhos) {
		this.listaAparelhos = listaAparelhos;
	}

	public List<Bairro> getListaBairros() {
		return listaBairros;
	}

	public void setListaBairros(List<Bairro> listaBairros) {
		this.listaBairros = listaBairros;
	}

	public List<ClassificacaoTipo> getListaClassificacoes() {
		return listaClassificacoes;
	}

	public void setListaClassificacoes(List<ClassificacaoTipo> listaClassificacoes) {
		this.listaClassificacoes = listaClassificacoes;
	}

	public List<DescricaoTipo> getListaDescricoes() {
		return listaDescricoes;
	}

	public void setListaDescricoes(List<DescricaoTipo> listaDescricoes) {
		this.listaDescricoes = listaDescricoes;
	}

	public List<Endereco> getListaEnderecos() {
		return listaEnderecos;
	}

	public void setListaEnderecos(List<Endereco> listaEnderecos) {
		this.listaEnderecos = listaEnderecos;
	}

	public List<EquipeTipo> getListaEquipes() {
		return listaEquipes;
	}

	public void setListaEquipes(List<EquipeTipo> listaEquipes) {
		this.listaEquipes = listaEquipes;
	}

	public List<IntervencaoTipo> getListaIntevencoes() {
		return listaIntevencoes;
	}

	public void setListaIntevencoes(List<IntervencaoTipo> listaIntevencoes) {
		this.listaIntevencoes = listaIntevencoes;
	}

	public List<Longradouro> getListaLongradouros() {
		return listaLongradouros;
	}

	public void setListaLongradouros(List<Longradouro> listaLongradouros) {
		this.listaLongradouros = listaLongradouros;
	}

	public List<MotivoTipo> getListaMotivos() {
		return listaMotivos;
	}

	public void setListaMotivos(List<MotivoTipo> listaMotivos) {
		this.listaMotivos = listaMotivos;
	}

	public List<OrdemServico> getListaOrdensServicos() {
		return listaOrdensServicos;
	}

	public void setListaOrdensServicos(List<OrdemServico> listaOrdensServicos) {
		this.listaOrdensServicos = listaOrdensServicos;
	}

	public List<SituacaoTipo> getListaSituacoes() {
		return listaSituacoes;
	}

	public void setListaSituacoes(List<SituacaoTipo> listaSituacoes) {
		this.listaSituacoes = listaSituacoes;
	}

	public List<ProjetoTipo> getListaTiposProjeto() {
		return listaTiposProjeto;
	}

	public void setListaTiposProjeto(List<ProjetoTipo> listaTiposProjeto) {
		this.listaTiposProjeto = listaTiposProjeto;
	}
}