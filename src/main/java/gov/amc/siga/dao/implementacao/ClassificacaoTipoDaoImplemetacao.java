package gov.amc.siga.dao.implementacao;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import gov.amc.siga.dao.interfaces.ClassificacaoTipoDao;
import gov.amc.siga.dao.mapper.ClassificacaoTipoMapper;
import gov.amc.siga.model.ClassificacaoTipo;

@Repository
public class ClassificacaoTipoDaoImplemetacao implements ClassificacaoTipoDao, Serializable {

	private static final long serialVersionUID = 1L;
	private DataSource dataSource;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	}

	@Override
	public void salvarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		final String query = "INSERT INTO siga.classificacao_tipo (classificacao_cod, classificacao_desc) VALUES( ?, ?)";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase(), classificacaoTipo.getClassificacaoDescricao().toUpperCase() };
		int out = template.update(query, args);
		if(out!=0) {
			System.out.println("Tipo de classificação salva!");
		}else {
			System.out.println("Falha ao salvar o tipo de classificação");
		}
	}
	
	@Override
	public void atualizarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deletarClassificacaoTipo(ClassificacaoTipo classificacaoTipo) {
		final String query = "DELETE FROM siga.classificacao_tipo WHERE classificacao_cod= ?";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		Object[] args = new Object[] { classificacaoTipo.getClassificacaoCodigo().toUpperCase() };
		int out = template.update(query, args);
		if(out!=0) {
			System.out.println("Tipo de classificação deletada!");
		}else {
			System.out.println("Falha ao deletar o tipo de classificação");
		}
	}

	@Override
	public List<ClassificacaoTipo> listarTodasClassificacaoTipo() {
		final String query = "SELECT classificacao_cod, classificacao_desc FROM siga.classificacao_tipo";
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template.query(query, new ClassificacaoTipoMapper());
	}

}
