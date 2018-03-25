-- ****************************************
-- ******Shift Scripts Tabelas Update******
-- ****************************************
ALTER TABLE shift_db_ordem_servico.tbl_paciente 
ADD endereco varchar(250) NULL;

ALTER TABLE shift_db_ordem_servico.tbl_paciente 
ADD sexo varchar(1) NULL ;

ALTER TABLE shift_db_ordem_servico.tbl_paciente 
ADD data_nascimento date NULL;