INSERT INTO CLASSIFICACAO_TIPO (CLASSIFICACAO_COD, CLASSIFICACAO_DESC) VALUES 
('TÍPICO','PROJETO DE SINALIZAÇÃO COMUM'),
('FISCALIZAÇÃO ELETRÔNICA','CONTEMPLA SINALIZAÇÃO DE FISCALIZAÇÃO ELETRÔNICA'),
('CORREDOR', 'SÃO PROJETOS ONDE SÃO SINALIZADOS GRANDES CORREDORES'),
('ÁREA', 'PROJETO QUE ABRANGE UMA ÁREA(BAIRRO)'),
('OBRA', 'PROJETO COM SINALIZAÇÃO PRÉ OU PÓS OBRA'),
('PROJETO ESCOLA', 'PROJETO DE SINALIZAÇÃO DE ESCOLA'),
('CICLOFAIXA', 'PROJETO QUE CONTEMPLA CICLOFAIXA'),
('LOMBADA CONCRETO', 'LOMBADA FÍSICA CONSTRUÍDA EM CONCRETO'),
('LOMBADA TACHÃO', 'LOMBADA FÍSICA UTILIZANDO TACHÕES COMO REDUTORES DE VELOCIDADE'),
('LOMBADA ECOLÓGICA', 'LOMBADA FÍSICA UTILIZANDO MATERIAL MODULAR COMO REDUTORES DE VELOCIDADE'),
('TRAVESSIA ELEVADA', 'FAIXA DE PEDESTRE ELEVADA CONSTRUÍDA AO MESMO NÍVEL DO PASSEIO'),
('VIDEOMONITORAMENTO', 'PROJETO COM SINALIZAÇÃO DE VÍDEO-MONITORAMENTO INDICANDO FISCALIZAÇÃO POR C MERAS'),
('EQUINA SEGURA', 'PROJETO COM SINALIZAÇÃO COM TRATAMENTO DIFERENCIADO EM ALGUNS CRUZAMENTOS'),
('ZONA AZUL', 'PROJETO COM SINALIZAÇÃO DE ZONA AZUL'),
('FAIXA EXCLUSIVA', 'PROJETO DE CORREDOR COM SINALIZAÇÃO DE FAIXA EXCLUSIVA DE ÔNIBUS'),
('SEMÁFORO VEICULAR', 'PROJETO COM IMPLANTAÇÃO DE SEMÁFORO VEICULAR'),
('SEMÁFORO PEDESTRES', 'PROJETO COM IMPLANTAÇÃO DE SEMÁFORO PARA PEDESTRES'),
('DEMARCAÇÃO GARAGEM', 'DEMARCAÇÃO DE ENTRADA E SAÍDA DE VEÍCULOS')
ON CONFLICT (CLASSIFICACAO_COD) DO NOTHING;

INSERT INTO DESCRICAO_TIPO (DESCRICAO_COD, DESCRICAO_DESC) VALUES
('HORIZONTAL E VERTICAL', 'HORIZONTAL E VERTICAL'),
('VERTICAL', 'VERTICAL'),
('HORIZONTAL', 'HORIZONTAL'),
('RENOVAÇÃO HORIZONTAL', 'RENOVAÇÃO HORIZONTAL'),
('MANUTENÇÃO VERTICAL', 'REPOSIÇÃO, REFIXAÇÃO, SUBSTITUIÇÃO  DE PLACA'),
('PLACA INFORMATIVA', 'PLACA INFORMATIVA MUDANÇA DE SENTIDO, PROIBIÇÃO DE CONVERSÃO, ETC'),
('DISPOSITIVOS AUXILIARES', 'TACHÃO, GELITO, GELO, BALIZADORES')
ON CONFLICT (DESCRICAO_COD) DO NOTHING;

INSERT INTO SITUACAO_TIPO (SITUACAO_COD, SITUACAO_DESC) VALUES
('GCE', 'PROJETO COM A GCE'),
('EQUIPE AMC', 'PROJETO COM A EQUIPE DA AMC'),
('CONTRATADA', 'PROJETO COM A CONTRATADA'),
('ANDAMENTO', 'PROJETO EM ANDAMENTO'),
('VISTORIA CONTRATADA', 'PROJETO PARA VISTORIA CONTRATADA'),
('VISTORIA AMC', 'PROJETO PARA VISTORIA AMC'),
('PENDÊNCIA', 'PROJETO COM PENDÊNCIA'),
('SUSPENSO', 'PROJETO SUSPENSO AGUARDANDO DEFINIÇÃO, AUTORIZAÇÃO OU OBRA FÍSICA'),
('CONCLUÍDO', 'PROJETO CONCLUÍDO'),
('CANCELADO', 'PROJETO CANCELADO')
ON CONFLICT (SITUACAO_COD) DO NOTHING;

INSERT INTO MOTIVO_TIPO (MOTIVO_COD, MOTIVO_DESC) VALUES
('SUPERINTENDÊNCIA', 'SOLICITAÇÃO DA SUPERINTENDÊNCIA'),
('ADJUNTO SUPERINTENDÊNCIA', 'SOLICITAÇÃO SUPERINTENDENTE ADJUNTO'),
('NUTRAN', 'SOLICITAÇÃO DO NUTRAN'),
('GEENG', 'SOLICITAÇÃO DA GERÊNCIA DE ENGENHARIA'),
('GERÊNCIA/COORDENAÇÃO', 'SOLICITAÇÃO DAS DEMAIS GERÊNCIAS/COORDENAÇÕES'),
('SIAT/ACIDENTES', 'SOLICITAÇÃO SIAT/OCORRÊNCIA DE ACIDENTES'),
('CTAFOR', 'SOLICITAÇÃO CTAFOR'),
('GEOFI', 'SOLICITAÇÃO GEOFI'),
('IMPRENSA', 'SOLICITAÇÃO IMPRENSA'),
('RECAPE', 'SOLICITAÇÃO RECAPE'),
('SECRETARIA DE CONSERVAÇÃO', 'SOLICITAÇÃO DA SECRETARIA DE CONSERVAÇÃO'),
('PAITT', 'SOLICITAÇÃO PAITT'),
('SEINF', 'SOLICITAÇÃO SEINF'),
('VEREADOR', 'SOLICITAÇÃO DE VEREADOR'),
('DEPUTADO', 'SOLICITAÇÃO DE DEPUTADO'),
('PREFEITO', 'SOLICITAÇÃO DO PREFEITO/GABINETE'),
('SECRETARIAS/REGIONAIS', 'SOLICITAÇÃO DAS SECRETARIAS E REGIONAIS'),
('MINISTÉRIO PÚBLICO', 'SOLICITAÇÃO DO MINISTÉRIO PÚBLICO'),
('DETRAN', 'SOLICITAÇÃO DETRAN'),
('OUTROS', 'OUTROS SOLICITANTES')
ON CONFLICT (MOTIVO_COD) DO NOTHING;

INSERT INTO APARELHO_TIPO (APARELHO_COD, APARELHO_DESC) VALUES
('SH-MEC', 'SINALIZAÇÃO HORIZONTAL MECÂNICA'),
('SH-MAN', 'SINALIZAÇÃO HORIZONTAL MANUAL'),
('SV', 'SINALIZAÇÃO VERTICAL'),
('PLACA', 'PLACA'),
('COL-SIM', 'COLUNA SIMPLES'),
('COL-CIL', 'COLUNA CILÍNDRICA DE BRAÇO PROJETADO'),
('COL-CON', 'COLUNA CÔNICA DE BRAÇO PROJETADO'),
('BP-POSTE', 'BRAÇO PROJETADO PARA POSTE'),
('TCH-BI', 'TACHÕES BIDIRECIONAIS'),
('TCH-MONO', 'TACHÕES MONODIRECIONAIS'),
('BALIZADORES', 'BALIZADORES')
ON CONFLICT (APARELHO_COD) DO NOTHING;

INSERT INTO INTERVENCAO_TIPO (INTERVENCAO_COD, INTERVENCA_DESC) VALUES
('CSHV', 'CRUZAMENTO SINALIZADO HORIZONTAL E VERTICAL'),
('CSH', 'CRUZAMENTO SINALIZADO HORIZONTAL'),
('CSV', 'CRUZAMENTO SINALIZADO VERTICAL'),
('CS-TCH', 'CRUZAMENTO SINALIZADO COM TACHÃO'),
('CS-ES', 'CRUZAMENTO SINALIZADO - ESQUINA SEGURA'),
('CS-ES2.0', 'CRUZAMENTO SINALIZADO - ESQUINA SEGURA 2.0'),
('PE', 'PROJETO ESCOLA'),
('TP', 'TRAVESSIA DE PEDESTRES'),
('FPX', 'FAIXA DE PEDESTRES EM X'),
('US', 'UNIDADE DE SAÚDE'),
('ISV', 'IMPLANTAÇÃO DE SEMÁFORO VEICULAR'),
('ISP', 'IMPLANTAÇÃO DE SEMÁFORO PARA PEDESTRES'),
('PC', 'PROJETO CORREDOR'),
('PA', 'PROJETO ÁREA'),
('FE', 'FISCALIZAÇÃO ELETRÔNICA'),
('VR', 'VIA RECAPEADA'),
('MS', 'MUDANÇA DE SENTIDO'),
('MP', 'MUDANÇA DE PREFERENCIAL'),
('TCH', 'TACHÕES'),
('TE', 'TRAVESSIA ELEVADA'),
('LC', 'LOMBADA FÍSICA DE CONCRETO'),
('LTCH', 'LOMBADA FÍSICA DE TACHÃO'),
('LE', 'LOMBADA FÍSICA ECOLÓGICA'),
('AEMN', 'ÁREA DE ESPERA DE MOTOS NOVA'),
('AEMR', 'ÁREA DE ESPERA DE MOTOS RENOVADA'),
('AEMA', 'ÁREA DE ESPERA DE MOTOS APAGADA'),
('DG', 'DEMARCAÇÃO DE GARAGEM'),
('VZAN', 'VAGA DE ZONA AZUL NOVA'),
('VZAR', 'VAGA DE ZONA AZUL RENOVADA'),
('VZAAP', 'VAGA DE ZONA AZUL APAGADA'),
('VIN-ZA', 'VAGA DE IDOSO NOVA - ZONA AZUL'),
('VIR-ZA', 'VAGA DE IDOSO RENOVADA - ZONA AZUL'),
('VIAP-ZA', 'VAGA DE IDOSO APAGADA - ZONA AZUL'),
('VDN-AZ', 'VAGA DE DEFICIENTE NOVA - ZONA AZUL'),
('VDR-ZA', 'VAGA DE DEFICIENTE RENOVADA - ZONA AZUL'),
('VDAP-ZA', 'VAGA DE DEFICIENTE APAGADA - ZONA AZUL'),
('VCDN-ZA', 'VAGA DE CARGA E DESCARGA NOVA - ZONA AZUL'),
('VCDR-ZA', 'VAGA DE CARGA E DESCARGA RENOVADA - ZONA AZUL'),
('VCDAP-ZA', 'VAGA DE CARGA E DESCARGA APAGADA - ZONA AZUL'),
('VDN', 'VAGA DE DEFICIENTE NOVA'),
('VDR', 'VAGA DE DEFICIENTE RENOVADA'),
('VDAP', 'VAGA DE DEFICIENTE APAGADA'),
('VIN', 'VAGA DE IDOSO NOVA'),
('VIR', 'VAGA DE IDOSO RENOVADA'),
('VIAP', 'VAGA DE IDOSO APAGADA'),
('VCDN', 'VAGA DE CARGA E DESCARGA NOVA'),
('VCDR', 'VAGA DE CARGA E DESCARGA RENOVADA'),
('VCDAP', 'VAGA DE CARGA E DESCARGA APAGADA'),
('VEDN', 'VAGA DE EMBARQUE E DESEMBARQUE NOVA'),
('VEDR', 'VAGA DE EMBARQUE E DESEMBARQUE RENOVADA'),
('VEDA', 'VAGA DE EMBARQUE E DESEMBARQUE APAGADA'),
('VTN', 'VAGA DE TÁXI NOVA'),
('VTR', 'VAGA DE TÁXI RENOVADA'),
('VTAP', 'VAGA DE TÁXI APAGADA'),
('VMTN', 'VAGA DE MOTO TÁXI NOVA'),
('VMTR', 'VAGA DE MOTO TAXI RENOVADA'),
('VMTAP', 'VAGA DE MOTOTAXI APAGADA'),
('VMN', 'VAGA DE MOTO NOVA'),
('VMR', 'VAGA DE MOTO RENOVADA'),
('VMAP', 'VAGA DE MOTO APAGADA'),
('VAN', 'VAGA DE AMBUL NCIA NOVA'),
('VAR', 'VAGA DE AMBUL NCIA RENOVADA'),
('VAAP', 'VAGA DE AMBUL NCIA APAGADA'),
('VON', 'VAGA DE ÔNIBUS NOVA'),
('VOR', 'VAGA DE ÔNIBUS RENOVADA'),
('VOAP', 'VAGA DE ÔNIBUS APAGADA'),
('VVON', 'VAGA DE VEÍCULO OFICIAL NOVA'),
('VVOR', 'VAGA DE VEÍCULO OFICIAL RENOVADA'),
('VVOAP', 'VAGA DE VEÍCULO OFICIAL APAGADA'),
('VVAPN', 'VAGA DE VEÍCULO AUTOMOTOR PARTICULAR NOVA'),
('VVAPR', 'VAGA DE VEÍCULO AUTOMOTOR PARTICULAR RENOVADA'),
('VVAPAP', 'VAGA DE VEÍCULO AUTOMOTOR PARTICULAR APAGADA'),
('VTEN', 'VAGA DE TRANSPORTE ESCOLAR NOVA'),
('VTER', 'VAGA DE TRANSPORTE ESCOLAR RENOVADA'),
('VTEAP', 'VAGA DE TRANSPORTE ESCOLAR APAGADA'),
('VVVN', 'VAGA DE VEÍCULO DE VALORES NOVA'),
('VVVR', 'VAGA DE VEÍCULO DE VALORES RENOVADA'),
('VVVAP', 'VAGA DE VEÍCULO DE VALORES APAGADA'),
('OVN', 'OUTRAS VAGAS NOVAS'),
('OVR', 'OUTRAS VAGAS RENOVADAS'),
('OVAP', 'OUTRAS VAGAS APAGADAS'),
('YB', 'YELLOW BOX')
ON CONFLICT (INTERVENCAO_COD) DO NOTHING;

INSERT INTO PROJETO_TIPO (TIPO_COD, TIPO_DESC) VALUES
('PONTUAL', 'PROJETO PONTUAL CONTRATADA'),
('MACRO', 'PROJETO MACRO CONTRATADA'),
('MANUTENÇÃO', 'PROJETO MANUTENÇÃO AMC')
ON CONFLICT (TIPO_COD) DO NOTHING;

INSERT INTO EQUIPE_TIPO(EQUIPE_COD, EQUIPE_DESC) VALUES
('MANUTENCAO', 'EQUIPE MANUTENÇÃO AMC'),
('TERCEIRIZADA', 'CONTRATADA 1'),
('TERCEIRIZADA', 'CONTRATADA 2')
ON CONFLICT (EQUIPE_COD) DO NOTHING;

INSERT INTO SETOR (SETOR_COD, SETOR_DESC) VALUES 
('GPE', 'GERÊNCIA DE PROJETOS ESPECIAIS'),
('GCO', 'GERÊNCIA DE CONTROLE DE OBRAS'),
('GPO1', 'GERÊNCIA DE PROJETOS OPERACIONAIS 1'),
('GPO2', 'GERÊNCIA DE PROJETOS OPERACIONAIS 2'),
('NUDAP', 'NÚCLEO DE DESENVOLVIMENTO DE APLICAÇÕES') ON
CONFLICT (SETOR_COD) DO NOTHING;

INSERT INTO AUTORIZACAO (AUTORIZA_COD, AUTORIZA_DESC) VALUES
('ROLE_ADMIN', 'ADMINISTRADOR DO SISTEMA'),
('ROLE_SUBADMIN', 'ACESSO A MAIORIA DAS FUNÇÕES ADMINISTRATIVAS'),
('ROLE_USUARIO', 'ACESSO BÁSICO')
ON CONFLICT (AUTORIZA_COD) DO NOTHING;

INSERT INTO USUARIO (USUARIO_NM, CPF_NUM, SETOR_ID, EMAIL, SENHA, MAIL_WARN) VALUES 
('ADMIN', '12345678910', ( SELECT SETOR_ID FROM SETOR WHERE SETOR_COD = 'NUDAP'), 'JOSE.LIMA@FORTALEZA.CE.GOV.BR', 
'$2y$10$xwLQcPepVnEUAl.63lTfxuexyd0pswcoxi9HuY2ao7WX.PiKQWHQ.', TRUE)
ON CONFLICT (CPF_NUM) DO NOTHING;

--COPY bairro(bairro_id, bairro) 
--FROM '/home/junior/workspace/CSVs/TBairro_201912061051 - TBairro_201912061051.csv' DELIMITER ',' CSV HEADER;

--COPY bairro(bairro_id, bairo)
--FROM '/home/desenvolvimento/Projeto-Siga/CSVs/TBairro_201912061051.csv' DELIMITER ',' CSV HEADER;

INSERT INTO PERMISSAO (USUARIO_ID, AUTORIZA_COD) VALUES
((SELECT USUARIO_ID FROM USUARIO WHERE USUARIO_NM = 'ADMIN') , 'ROLE_ADMIN')
ON CONFLICT (USUARIO_ID, AUTORIZA_COD) DO NOTHING;

   
   
   
   
   
   
   
   
   
   
   
   
   
   

