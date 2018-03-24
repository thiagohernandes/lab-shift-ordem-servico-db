-- **********************************
-- ******Shift Scripts Tabelas******
-- **********************************
CREATE TABLE `tbl_especialidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `tbl_medico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `id_especialidade` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `medico_especialidade_fk` 
  FOREIGN KEY (`id_especialidade`) 
  REFERENCES `tbl_especialidade` (`id`)
);

CREATE TABLE `tbl_cidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `uf` varchar(2) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `tbl_bairro` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(250) NOT NULL,
  `id_cidade` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `bairro_cidade_fk` 
  FOREIGN KEY (`id_cidade`) 
  REFERENCES `tbl_cidade` (`id`)
);

CREATE TABLE `tbl_paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `id_bairro` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `paciente_bairro_fk` 
  FOREIGN KEY (`id_bairro`) 
  REFERENCES `tbl_bairro` (`id`)
);

CREATE TABLE `tbl_setor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT null,
  PRIMARY KEY (`id`)
);

CREATE TABLE `tbl_convenio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT null,
  PRIMARY KEY (`id`)
);

CREATE TABLE `tbl_exame` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `id_setor` int(11) NOT NULL,
  `material_biologico` varchar(100) NOT NULL,
  `prazo` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `exame_setor_fk` 
  FOREIGN KEY (`id_setor`) 
  REFERENCES `tbl_setor` (`id`)
);

CREATE TABLE `tbl_exame_preco` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_exame` int(11) NOT NULL,
  `id_convenio` int(11) NOT NULL,
  `preco` numeric(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `exame_preco_exame_fk` 
  FOREIGN KEY (`id_exame`) 
  REFERENCES `tbl_exame` (`id`),
  CONSTRAINT `exame_preco_convenio_fk` 
  FOREIGN KEY (`id_convenio`) 
  REFERENCES `tbl_convenio` (`id`)
);

CREATE TABLE `tbl_posto_coleta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(200) NOT NULL,
  `id_bairro` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `posto_coleta_bairro_fk` 
  FOREIGN KEY (`id_bairro`) 
  REFERENCES `tbl_bairro` (`id`)
);


CREATE TABLE `tbl_ordem_servico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `data` datetime NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `id_convenio` int(11) NOT NULL,
  `id_posto_coleta` int(11) NOT NULL,
  `id_medico` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `ordem_serv_paciente_fk` 
  FOREIGN KEY (`id_paciente`) 
  REFERENCES `tbl_paciente` (`id`),
  CONSTRAINT `ordem_serv_convenio_fk` 
  FOREIGN KEY (`id_convenio`) 
  REFERENCES `tbl_convenio` (`id`),
  CONSTRAINT `ordem_serv_posto_coleta_fk` 
  FOREIGN KEY (`id_posto_coleta`) 
  REFERENCES `tbl_posto_coleta` (`id`),
  CONSTRAINT `ordem_serv_medico_fk` 
  FOREIGN KEY (`id_medico`) 
  REFERENCES `tbl_medico` (`id`)
);

CREATE TABLE `tbl_ordem_servico_exame` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_ordem_servico` int(11) NOT NULL,
  `id_exame` int(11) NOT NULL,
  `entrega_resultado` timestamp NOT NULL,
  `preco` numeric(10,2) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `ordem_serv_ex_os_fk` 
  FOREIGN KEY (`id_ordem_servico`) 
  REFERENCES `tbl_ordem_servico` (`id`),
  CONSTRAINT `ordem_serv_ex_exame_fk` 
  FOREIGN KEY (`id_exame`) 
  REFERENCES `tbl_exame` (`id`)
);
