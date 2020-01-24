
INSERT INTO SIGA.APARELHO_TIPO (APARELHO_COD, APARELHO_DESC) VALUES ('TESTE', 'TESTE');
SELECT APARELHO_COD, APARELHO_DESC FROM SIGA.APARELHO_TIPO;
DELETE FROM SIGA.APARELHO_TIPO WHERE APARELHO_COD = 'TESTE';
UPDATE SIGA.APARELHO_TIPO SET APARELHO_DESC = 'TESTE2' WHERE APARELHO_COD ='TESTE';
SELECT APARELHO_COD, APARELHO_DESC FROM SIGA.APARELHO_TIPO WHERE APARELHO_COD = 'TCH-BI';

SELECT * FROM SIGA.APARELHO_TIPO WHERE aparelho_cod = "";

SELECT aparelho_cod, aparelho_desc FROM siga.aparelho_tipo WHERE aparelho_cod = 'BALIZADORES';

UPDATE siga.aparelho_tipo SET aparelho_desc = 'teste' WHERE aparelho_cod = 'TESTANDO';

INSERT INTO projetos
(numero, prancha, revisao, contrato, data_cria_proj, observacao, proj_obra, prioridade, data_prevista, data_equipe, data_inicial, is_recape, ci_recape, local_recape, is_execu_rec, data_exe_rec)
VALUES(0603083, '01/01', 'R00', '000/00', CURRENT_DATE, 'Restrição de estacionamento entre R. Beteu e R. Américo Vespúrcio e R5a no canteiro central', 'Pos-Obra', 'Alta', '2020-01-25', '2020-01-30', '2020-01-30', false, 'CI RECAPE', 'MESMO LOCAL', false, '2020-01-30');



select count(*) from siga.aparelho_tipo