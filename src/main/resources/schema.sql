CREATE TABLE IF NOT EXISTS CLASSIFICACAO_TIPO (
    CLASSIFICACAO_COD VARCHAR(100) NOT NULL,
    CLASSIFICACAO_DESC VARCHAR(255) NOT NULL,
CONSTRAINT CLASS_COD PRIMARY KEY (CLASSIFICACAO_COD) );
COMMENT ON TABLE CLASSIFICACAO_TIPO IS 'TABELA COM CÓDIGO E DESCRIÇÃO DE CADA APARELHAMENTO';

CREATE TABLE IF NOT EXISTS DESCRICAO_TIPO (
    DESCRICAO_COD VARCHAR(100) NOT NULL,
    DESCRICAO_DESC VARCHAR(255) NOT NULL,
CONSTRAINT DESC_COD PRIMARY KEY (DESCRICAO_COD) );
COMMENT ON TABLE DESCRICAO_TIPO IS 'TABELA COM O CÓDIGO E DESCRIÇÃO DE CADA TIPO DE PROJETO';

CREATE TABLE IF NOT EXISTS SITUACAO_TIPO (
	SITUACAO_COD VARCHAR(100) NOT NULL,
	SITUACAO_DESC VARCHAR(255) NOT NULL,
CONSTRAINT SITU_COD PRIMARY KEY (SITUACAO_COD) );
COMMENT ON TABLE SITUACAO_TIPO IS 'TABELA COM A LISTA DE POSSÍVEIS SITUAÇÕES QUE UM PROJETO PODE APRESENTAR';

CREATE TABLE IF NOT EXISTS MOTIVO_TIPO (
    MOTIVO_COD VARCHAR(100) NOT NULL,
    MOTIVO_DESC VARCHAR(255) NOT NULL,
CONSTRAINT MOTI_COD PRIMARY KEY (MOTIVO_COD) );
COMMENT ON TABLE MOTIVO_TIPO IS 'TABELA COM A LISTA DE POSSÍVEIS MOTIVOS PARA UM PROJETO';

CREATE TABLE IF NOT EXISTS APARELHO_TIPO (
    APARELHO_COD VARCHAR(100) NOT NULL,
    APARELHO_DESC VARCHAR(255) NOT NULL,
CONSTRAINT APA_COD PRIMARY KEY (APARELHO_COD) );
COMMENT ON TABLE APARELHO_TIPO IS 'TABELA COM CODIGOS E DESCRIÇÃO DE CADA APARELHO(SINALIZAÇÕES HORIZONTAIS E VERTICAIS)';

CREATE TABLE IF NOT EXISTS INTERVENCAO_TIPO (
    INTERVENCAO_COD VARCHAR(100) NOT NULL,
    INTERVENCA_DESC VARCHAR(255) NOT NULL,
CONSTRAINT INT_CODE PRIMARY KEY (INTERVENCAO_COD) );
COMMENT ON TABLE INTERVENCAO_TIPO IS 'TABELA COM CÓDIGO E DESCRIÇÃO DE CADA TIPO DE INTERVENÇÃO.';

CREATE TABLE IF NOT EXISTS PROJETO_TIPO (
    TIPO_COD VARCHAR(100) NOT NULL,
    TIPO_DESC VARCHAR(255) NOT NULL,
CONSTRAINT TIPO_CODE PRIMARY KEY (TIPO_COD) );
COMMENT ON TABLE PROJETO_TIPO IS 'TABELA COM CÓDIGO E DESCRIÇÃO DE CADA TIPO DE PROJETO';

CREATE TABLE IF NOT EXISTS EQUIPE_TIPO(
    EQUIPE_COD VARCHAR(100) NOT NULL,
    EQUIPE_DESC VARCHAR(255) NOT NULL,
CONSTRAINT EQUI_CODE PRIMARY KEY (EQUIPE_COD) );
COMMENT ON TABLE EQUIPE_TIPO IS 'TABELA COM CÓDIGO E DESCRIÇÃO DE CADA TIPO DE EQUIPE';

CREATE TABLE IF NOT EXISTS BAIRRO (
    BAIRRO_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    BAIRRO VARCHAR(255),
CONSTRAINT BAIR_ID PRIMARY KEY (BAIRRO_ID) );
COMMENT ON TABLE BAIRRO IS 'TABELA COM A LISTA DE BAIRROS';

CREATE TABLE IF NOT EXISTS LONGRADOURO (
    LONGRADOURO_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    LONGRADOURO VARCHAR(255),
    TIPO VARCHAR(100) NULL,
    TITULO VARCHAR(100) NULL,
    JURISDICAO VARCHAR(100) NULL,
CONSTRAINT LONGR_ID PRIMARY KEY(LONGRADOURO_ID) );
COMMENT ON TABLE LONGRADOURO IS 'TABELA COM A LISTA DE LONGRADOUROS';

CREATE TABLE IF NOT EXISTS SETOR (
    SETOR_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    SETOR_COD VARCHAR(20) NOT NULL,
    SETOR_DESC VARCHAR(255) NOT NULL,
    CONSTRAINT SETO_ID PRIMARY KEY (SETOR_ID),
CONSTRAINT SETO_COD UNIQUE (SETOR_COD) );
COMMENT ON TABLE SETOR IS 'RELAÇÃO DOS SETORES CADASTRADOS.';

CREATE TABLE IF NOT EXISTS AUTORIZACAO (
    AUTORIZA_COD VARCHAR(100) NOT NULL,
    AUTORIZA_DESC VARCHAR(255) NOT NULL,
CONSTRAINT AUTORI_COD PRIMARY KEY (AUTORIZA_COD) );
COMMENT ON TABLE AUTORIZACAO IS 'RELAÇÃO DAS AUTORIZAÇÕES QUE PODEM SER ATRIBUÍDOS PARA UM USUÁRIO';

CREATE TABLE IF NOT EXISTS USUARIO (
    USUARIO_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    USUARIO_NM VARCHAR(255) NOT NULL,
    CPF_NUM VARCHAR(11) NOT NULL,
    MAT_NUM VARCHAR(20) NULL,
    SETOR_ID BIGINT NOT NULL,
    EMAIL VARCHAR(255) NOT NULL,
    SENHA VARCHAR(255) NOT NULL,
    MAIL_WARN BOOLEAN DEFAULT FALSE,
    RECUPERA_COD VARCHAR(255) NULL,
    CONSTRAINT USUA_ID PRIMARY KEY (USUARIO_ID),
    CONSTRAINT USUA_SETO_ID FOREIGN KEY (SETOR_ID) REFERENCES SETOR(SETOR_ID),
    CONSTRAINT USUA_EMAIL UNIQUE (EMAIL),
    CONSTRAINT USUA_CPF UNIQUE (CPF_NUM) );
COMMENT ON TABLE USUARIO IS 'RELAÇÃO DOS USUARIOS';

CREATE TABLE IF NOT EXISTS PROJETO (
    PROJETO_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    NUMERO INTEGER NOT NULL UNIQUE,
    PRANCHA VARCHAR(100) NOT NULL,
    REVISAO VARCHAR(100) NOT NULL,
    CONTRATO VARCHAR(50) NOT NULL,
    DATA_CRIA_PROJ DATE NOT NULL,
    OBSERVACAO VARCHAR(1000) NULL,
    PROJ_OBRA VARCHAR(255) NULL,
    PRIORIDADE VARCHAR(255) NOT NULL,
    DATA_PREVISTA DATE NULL,
    DATA_EQUIPE DATE NULL,
    DATA_INICIAL DATE NULL,
    IS_RECAPE BOOLEAN NULL,
    CI_RECAPE VARCHAR(255) NULL,
    LOCAL_RECAPE VARCHAR(255) NULL,
    IS_EXECU_REC BOOLEAN NULL,
    DATA_EXE_REC DATE NULL,
    EQUIPE_COD VARCHAR(100) NOT NULL,
    USUARIO_ID BIGINT NOT NULL,
    
    CONSTRAINT USUA_ID FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO (USUARIO_ID),
    CONSTRAINT EQUIP_COD FOREIGN KEY (EQUIPE_COD) REFERENCES EQUIPE_TIPO (EQUIPE_COD),
    CONSTRAINT PROJ_ID PRIMARY KEY (PROJETO_ID) );
   
COMMENT ON TABLE PROJETO IS 'TABELA COM INFORMAÇÕES SOBRE OS PROJETOS';

CREATE TABLE IF NOT EXISTS ORDEMSERVICO (
    ORDEM_SERVICO_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    NUMERO_ORDEM_SERVICO INTEGER NOT NULL UNIQUE,
    MEDICAO VARCHAR(255) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    OBSERVACAO_VISTORIA VARCHAR(255),
    OBSERVACAO VARCHAR(255),
    CONSTRAINT ORD_SERVICO PRIMARY KEY (ORDEM_SERVICO_ID),
    CONSTRAINT ORD_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE ORDEMSERVICO IS 'TABELA COM AS ORDENS DE SERVICO DOS PROJETOS';

CREATE TABLE IF NOT EXISTS CLASSIFICACAO_PROJETO (
    CLASSIFICACAO_COD VARCHAR(100) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
CONSTRAINT CLASSI_ID FOREIGN KEY (CLASSIFICACAO_COD) REFERENCES CLASSIFICACAO_TIPO (CLASSIFICACAO_COD),
CONSTRAINT CLAS_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE CLASSIFICACAO_PROJETO IS 'TABELA DE CLASSIFICAÇÕES DE PROJETOS';

CREATE TABLE IF NOT EXISTS DESCRICAO_PROJETO (
    DESCRICAO_COD VARCHAR(100) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    CONSTRAINT DESC_ID FOREIGN KEY (DESCRICAO_COD) REFERENCES DESCRICAO_TIPO (DESCRICAO_COD),
    CONSTRAINT DESC_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE DESCRICAO_PROJETO IS 'TABELA DE DESCRIÇÕES DOS PROJETOS';

CREATE TABLE IF NOT EXISTS SITUACAO_PROJETO (
    SITUACAO_COD VARCHAR(100) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    CONSTRAINT SITU_ID FOREIGN KEY (SITUACAO_COD) REFERENCES SITUACAO_TIPO (SITUACAO_COD),
    CONSTRAINT SITU_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE SITUACAO_PROJETO IS 'TABELA DE SITUAÇOES DOS PROJETOS';

CREATE TABLE IF NOT EXISTS MOTIVO_PROJETO (
    MOTIVO_COD VARCHAR(100) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    CONSTRAINT MOTI_ID FOREIGN KEY (MOTIVO_COD) REFERENCES MOTIVO_TIPO (MOTIVO_COD),
    CONSTRAINT MOT_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE MOTIVO_PROJETO IS 'TABELA DE MOTIVOS DE CADA PROJETO';

CREATE TABLE IF NOT EXISTS APARELHO_PROJETO (
    APARELHO_COD VARCHAR(100) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    QUANTIDADE NUMERIC(4, 2) NOT NULL,
    CONSTRAINT APAR_ID FOREIGN KEY (APARELHO_COD) REFERENCES APARELHO_TIPO (APARELHO_COD),
    CONSTRAINT APAR_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE APARELHO_PROJETO IS 'TABELA DE QUANTIDADES DE CADA APARELHAMENTO POR PROJETO';

CREATE TABLE IF NOT EXISTS INTERVENCAO_PROJETO (
    INTERVENCAO_COD VARCHAR(100) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    QUANTIDADE INTEGER NOT NULL,
    CONSTRAINT INTER_ID FOREIGN KEY (INTERVENCAO_COD) REFERENCES INTERVENCAO_TIPO (INTERVENCAO_COD),
    CONSTRAINT INER_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE INTERVENCAO_PROJETO IS 'TABELA DE QUANTIDADES DE INTERVENÇÕES POR PROJETO';

CREATE TABLE IF NOT EXISTS TIPO_PROJETO (
    TIPO_COD VARCHAR(100) NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    CONSTRAINT TIPI_ID FOREIGN KEY (TIPO_COD) REFERENCES PROJETO_TIPO(TIPO_COD),
    CONSTRAINT TIPI_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE TIPO_PROJETO IS 'TABELA DE CÓDIGOS REFERENTES A CADA TIPO DE PROJETO';

CREATE TABLE IF NOT EXISTS ENDERECO (
    ENDERECO_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    LONGRADOURO_ID BIGINT NOT NULL,
    LONGR_CRUZ BIGINT NULL,
    LONGR_TRECHO BIGINT NULL,
    REGIONAL VARCHAR(255) NOT NULL,
    DIVISAO VARCHAR(255) NOT NULL,
    BAIRRO_ID BIGINT NOT NULL,
    PROJETO_ID BIGINT NOT NULL,
    CONSTRAINT ENDER_ID PRIMARY KEY (ENDERECO_ID),
    CONSTRAINT LONG1_ID FOREIGN KEY (LONGRADOURO_ID) REFERENCES LONGRADOURO(LONGRADOURO_ID),
    CONSTRAINT LONG2_ID FOREIGN KEY (LONGR_CRUZ) REFERENCES LONGRADOURO(LONGRADOURO_ID),
    CONSTRAINT LONG3_ID FOREIGN KEY (LONGR_TRECHO) REFERENCES LONGRADOURO(LONGRADOURO_ID),
    CONSTRAINT BAIR_ID FOREIGN KEY (BAIRRO_ID) REFERENCES BAIRRO(BAIRRO_ID),
    CONSTRAINT ENDE_PROJ_ID FOREIGN KEY (PROJETO_ID) REFERENCES PROJETO (PROJETO_ID) );
COMMENT ON TABLE ENDERECO IS 'TABELA COM ENDERECOS DE CADA PROJETO.';

CREATE TABLE IF NOT EXISTS PERMISSAO (
    PERMISSAO_ID BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    USUARIO_ID BIGINT NOT NULL,
    AUTORIZA_COD VARCHAR(100) NOT NULL,
    CONSTRAINT PERMI_ID PRIMARY KEY (PERMISSAO_ID),
    CONSTRAINT PERMI_USUA_ID FOREIGN KEY (USUARIO_ID) REFERENCES USUARIO(USUARIO_ID),
    CONSTRAINT PERMI_AUTORI_CODE FOREIGN KEY (AUTORIZA_COD) REFERENCES AUTORIZACAO(AUTORIZA_COD),
    CONSTRAINT PERMI_ID_CODE UNIQUE(USUARIO_ID, AUTORIZA_COD) );
COMMENT ON TABLE PERMISSAO IS 'RELAÇÃO DE PERMISSÕES DE CADA USUARIO';

CREATE OR REPLACE VIEW projetos AS
SELECT
	p.projeto_id, p.numero, p.prancha, p.revisao, p.contrato, p.data_cria_proj, p.observacao,
	p.proj_obra, p.prioridade, p.data_prevista, p.data_equipe, p.data_inicial, p.is_recape, p.ci_recape, 
	p.local_recape, p.is_execu_rec, p.data_exe_rec, p.equipe_cod, os.medicao, os.numero_ordem_servico, os.observacao_vistoria, os.observacao AS Obs_OS,
	cp.classificacao_cod, dp.descricao_cod, sp.situacao_cod, mp.motivo_cod, ap.aparelho_cod, ap.quantidade AS apar_qtd, ip.intervencao_cod, ip.quantidade AS inter_qtd,
	tp.tipo_cod, b.bairro, l.longradouro, l.jurisdicao, l.tipo, l.titulo, lc.longradouro AS cruzamento, lc.jurisdicao AS cruz_juris, lc.tipo AS cruz_tipo, lc.titulo AS cuz_titulo,
	lt.longradouro AS trecho, lt.jurisdicao AS trech_jursi, lt.tipo AS trech_tipo, lt.titulo AS trech_titulo, e.regional, e.divisao, u.usuario_nm
FROM projeto p
LEFT JOIN ordemservico os ON  os.projeto_id = p.projeto_id
LEFT JOIN classificacao_projeto cp ON cp.projeto_id = p.projeto_id
LEFT JOIN descricao_projeto dp ON dp.projeto_id = p.projeto_id
LEFT JOIN situacao_projeto sp ON sp.projeto_id = p.projeto_id
LEFT JOIN motivo_projeto mp ON mp.projeto_id = p.projeto_id
LEFT JOIN aparelho_projeto ap ON ap.projeto_id = p.projeto_id
LEFT JOIN intervencao_projeto ip ON ip.projeto_id = p.projeto_id
LEFT JOIN tipo_projeto tp ON tp.projeto_id = p.projeto_id
LEFT JOIN endereco e ON e.projeto_id = p.projeto_id
LEFT JOIN bairro b ON b.bairro_id = e.bairro_id
LEFT JOIN longradouro l ON l.longradouro_id = e.longradouro_id
LEFT JOIN longradouro lc ON lc.longradouro_id = e.longr_cruz
LEFT JOIN longradouro lt ON lt.longradouro_id = e.longr_trecho
LEFT JOIN usuario u ON u.usuario_id = p.usuario_id;
COMMENT ON VIEW siga.projetos IS 'view com todos os detalhes do projeto';




































