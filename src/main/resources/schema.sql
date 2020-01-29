-- SCHEMA: siga

	-- DROP SCHEMA siga ;

CREATE SCHEMA siga
	AUTHORIZATION siga_user;

ALTER DEFAULT PRIVILEGES IN SCHEMA siga
GRANT ALL ON TABLES TO siga_user;

CREATE TABLE IF NOT EXISTS classificacao_tipo (
	classificacao_cod varchar(100) NOT NULL,
	classificacao_desc varchar(255) NOT NULL,
	CONSTRAINT class_cod PRIMARY KEY(classificacao_cod)
);
COMMENT ON TABLE classificacao_tipo IS 'tabela com código e descrição de cada aparelhamento';

CREATE TABLE IF NOT EXISTS descricao_tipo (
	descricao_cod varchar(100) NOT NULL,
	descricao_desc varchar(255) NOT NULL,
	CONSTRAINT desc_cod PRIMARY KEY(descricao_cod)
); 
COMMENT ON TABLE descricao_tipo IS 'tabela com o código e descrição de cada tipo de projeto';

CREATE TABLE IF NOT EXISTS situacao_tipo (
	situacao_cod varchar(100) NOT NULL,
	situacao_desc varchar(255) NOT NULL,
	CONSTRAINT situ_cod PRIMARY KEY(situacao_cod)
);
COMMENT ON TABLE situacao_tipo IS 'tabela com a lista de possíveis situações que um projeto pode apresentar';

CREATE TABLE IF NOT EXISTS motivo_tipo (
	motivo_cod varchar(100) NOT NULL,
	motivo_desc varchar(255) NOT NULL,
	CONSTRAINT moti_cod PRIMARY KEY(motivo_cod)
);
COMMENT ON TABLE motivo_tipo IS 'tabela com a lista de possíveis motivos para um projeto';

CREATE TABLE IF NOT EXISTS aparelho_tipo (
	aparelho_cod varchar(100) NOT NULL,
	aparelho_desc varchar(255) NOT NULL,
	CONSTRAINT apa_cod PRIMARY KEY (aparelho_cod)
);
COMMENT ON TABLE aparelho_tipo IS 'tabela com codigos e descrição de cada aparelho(sinalizações horizontais e verticais)';

CREATE TABLE IF NOT EXISTS intervencao_tipo (
	intervencao_cod varchar(100) NOT NULL,
	intervenca_desc varchar(255) NOT NULL,
	CONSTRAINT int_code PRIMARY KEY(intervencao_cod)
);
COMMENT ON TABLE intervencao_tipo IS 'tabela com código e descrição de cada tipo de intervenção.';

CREATE TABLE IF NOT EXISTS projetos_tipo (
	tipo_cod varchar(100) NOT NULL,
	tipo_desc varchar(255) NOT NULL,
	CONSTRAINT tip_code PRIMARY KEY(tipo_cod)
);
COMMENT ON TABLE projetos_tipo IS 'tabela com código e descrição de cada tipo de projeto';

CREATE TABLE IF NOT EXISTS equipe_tipo(
	equipe_cod varchar(100) NOT NULL,
	equipe_desc varchar(255) NOT NULL,
	CONSTRAINT equi_code PRIMARY KEY(equipe_cod)
);
COMMENT ON TABLE equipe_tipo IS 'tabela com código e descrição de cada tipo de contratada';

CREATE TABLE IF NOT EXISTS bairros (
	bairro_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
	bairro varchar(255),
	CONSTRAINT bair_id PRIMARY KEY (bairro_id)
);
COMMENT ON TABLE bairros IS 'tabela com a lista de bairros';

CREATE TABLE IF NOT EXISTS longradouros (
	longradouro_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
	longradouro varchar(255),
	tipo varchar(100) NULL,
	titulo varchar(100) NULL,
	jurisdicao varchar(100) NULL,
	CONSTRAINT longr_id PRIMARY KEY(longradouro_id)
);
COMMENT ON TABLE longradouros IS 'tabela com a lista de longradouros';

CREATE TABLE IF NOT EXISTS setores (
	setor_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
	CONSTRAINT seto_id PRIMARY KEY (setor_id),
	setor_cod varchar(20) NOT NULL,
	setor_desc varchar(255) NOT NULL,
	CONSTRAINT seto_cod UNIQUE (setor_cod)
);
COMMENT ON TABLE setores IS 'relação dos setores cadastrados.';

CREATE TABLE IF NOT EXISTS autorizacoes (
	autoriza_cod varchar(100) NOT NULL,
	autoriza_desc varchar(255) NOT NULL,
	CONSTRAINT autori_cod PRIMARY KEY (autoriza_cod)
);
COMMENT ON TABLE autorizacoes IS 'relação das autorizações que podem ser atribuídos para um usuário';

CREATE TABLE IF NOT EXISTS projetos (
	projeto_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
	numero integer NOT NULL UNIQUE,
	prancha varchar(100) NOT NULL,
	revisao varchar(100) NOT NULL, 
	contrato varchar(50) NOT NULL,
	data_cria_proj date NOT NULL DEFAULT current_date,
	observacao varchar(1000) NULL,
	proj_obra varchar(255) NULL,
	prioridade varchar(255) NOT NULL,
	data_prevista date NULL,
	data_equipe date NULL,
	data_inicial date NULL,
	is_recape boolean NULL,
	ci_recape varchar(255) NULL,
	local_recape varchar(255) NULL,
	is_execu_rec boolean NULL,
	data_exe_rec date NULL,

	CONSTRAINT proj_id PRIMARY KEY (projeto_id)
);
COMMENT ON TABLE projetos IS 'tabela com informações sobre os projetos';

CREATE TABLE IF NOT EXISTS ordemservico (
	ordem_servico_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
	numero integer NOT NULL UNIQUE,
	medicao varchar(255) NOT NULL,
	projeto_id bigint NOT NULL,
	obervacao_vistoria varchar(255),
	observavao varchar(255),
	CONSTRAINT ord_servid PRIMARY KEY (ordem_servico_id),
	CONSTRAINT ored_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE ordemservico IS 'tabela com as Ordens de servico dos projetos';

CREATE TABLE IF NOT EXISTS classificacoes (
	classificacao_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	CONSTRAINT classi_id FOREIGN KEY (classificacao_cod) REFERENCES classificacao_tipo (classificacao_cod),
	CONSTRAINT clas_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE classificacoes IS 'tabela de classificações de projetos';

CREATE TABLE IF NOT EXISTS descricoes (
	descricao_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	CONSTRAINT desc_id FOREIGN KEY (descricao_cod) REFERENCES descricao_tipo (descricao_cod),
	CONSTRAINT desc_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE descricoes IS 'tabela de descrições dos projetos';

CREATE TABLE IF NOT EXISTS situacoes (
	situacao_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	CONSTRAINT situ_id FOREIGN KEY (situacao_cod) REFERENCES situacao_tipo (situacao_cod),
	CONSTRAINT situ_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE situacoes IS 'tabela de situaçoes dos projetos';

CREATE TABLE IF NOT EXISTS motivos (
	motivo_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	CONSTRAINT moti_id FOREIGN KEY (motivo_cod) REFERENCES motivo_tipo (motivo_cod),
	CONSTRAINT mot_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE motivos IS 'tabela de motivos de cada projeto';

CREATE TABLE IF NOT EXISTS aparelhamentos (
	aparelho_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	quantidade numeric(4, 2) NOT NULL,
	CONSTRAINT apar_id FOREIGN KEY (aparelho_cod) REFERENCES aparelho_tipo (aparelho_cod),
	CONSTRAINT apar_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE aparelhamentos IS 'tabela de quantidades de cada aparelhamento por projeto';

CREATE TABLE IF NOT EXISTS intervencoes (
	intervencao_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	quantidade integer NOT NULL,
	CONSTRAINT inter_id FOREIGN KEY (intervencao_cod) REFERENCES intervencao_tipo (intervencao_cod),
	CONSTRAINT iner_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE intervencoes IS 'tabela de quantidades de intervenções por projeto';

CREATE TABLE IF NOT EXISTS tipificacoes (
	tipo_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	CONSTRAINT tipi_id FOREIGN KEY (tipo_cod) REFERENCES projetos_tipo(tipo_cod),
	CONSTRAINT tipi_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)	
);
COMMENT ON TABLE tipificacoes IS 'tabela de códigos referentes a cada tipo de projeto';

CREATE TABLE IF NOT EXISTS equipes (
	equipe_cod varchar(100) NOT NULL,
	projeto_id bigint NOT NULL,
	CONSTRAINT equi_id FOREIGN KEY (equipe_cod) REFERENCES equipe_tipo(equipe_cod),
	CONSTRAINT cont_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE equipes IS 'tabela com a empresa contratada de cada projeto.';

CREATE TABLE IF NOT EXISTS enderecos (
	longradouro_id bigint NOT NULL,
	longr_cruz bigint NULL,
	longr_trecho bigint NULL,
	regional varchar(255) NOT NULL, 
	divisao varchar(255) NOT NULL,
	bairro_id bigint NOT NULL,
	projeto_id bigint NOT NULL,

	CONSTRAINT long1_id FOREIGN KEY (longradouro_id) REFERENCES longradouros(longradouro_id),
	CONSTRAINT long2_id FOREIGN KEY (longr_cruz) REFERENCES longradouros(longradouro_id),
	CONSTRAINT long3_id FOREIGN KEY (longr_trecho) REFERENCES longradouros(longradouro_id),
	CONSTRAINT bair_id FOREIGN KEY (bairro_id) REFERENCES bairros(bairro_id),
	CONSTRAINT ende_proj_id FOREIGN KEY (projeto_id) REFERENCES projetos (projeto_id)
);
COMMENT ON TABLE enderecos IS 'tabela com enderecos de cada projeto.';

CREATE TABLE IF NOT EXISTS usuarios (
	usuario_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
	CONSTRAINT usua_id PRIMARY KEY (usuario_id),
	usuario_nm varchar(255) NOT NULL,
	cpf_num varchar(11) NOT NULL,
	mat_num varchar(20) NULL,
	setor_id bigint NOT NULL,
	email varchar(255) NOT NULL,
	senha varchar(255) NOT NULL,
	mail_warn boolean default false,
	recupera_cod varchar(255) NULL,
	CONSTRAINT usua_seto_id FOREIGN KEY (setor_id) REFERENCES setores(setor_id),
	CONSTRAINT usua_email UNIQUE (email),
	CONSTRAINT usua_cpf UNIQUE (cpf_num)
);
COMMENT ON TABLE usuarios IS 'relação dos usuarios';

CREATE TABLE IF NOT EXISTS permissoes (
	usuario_id bigint NOT NULL,
	autoriza_cod varchar(100) NOT NULL,
	CONSTRAINT permi_usua_id FOREIGN KEY (usuario_id) REFERENCES usuarios(usuario_id),
	CONSTRAINT permi_autori_code FOREIGN KEY (autoriza_cod) REFERENCES autorizacoes(autoriza_cod),
	CONSTRAINT permi_id_code UNIQUE(usuario_id, autoriza_cod)
);
COMMENT ON TABLE permissoes IS 'relação de permissões de cada usuario';