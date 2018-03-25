-- ***********************************************
-- ******Shift Scripts Inserid dados Tabelas******
-- ***********************************************

insert into tbl_especialidade(nome)
values('Neurologia');

insert into tbl_especialidade(nome)
values('Pediatria');

insert into tbl_especialidade(nome)
values('Cardiologia');

insert into tbl_especialidade(nome)
values('Gastroenterologia');

insert into tbl_especialidade(nome)
values('Hematologia');

insert into tbl_especialidade(nome)
values('Mastologia');

insert into tbl_medico(nome,id_especialidade)
values('Marcos Fernando da Silva',2);

insert into tbl_medico(nome,id_especialidade)
values('Fernanda Figueiredo',1);

insert into tbl_medico(nome,id_especialidade)
values('Paulo Ferreira',3);

insert into tbl_medico(nome,id_especialidade)
values('Alessandra Paiva',4);

insert into tbl_medico(nome,id_especialidade)
values('Carlos Wendel',2);

insert into tbl_cidade(nome,uf)
values('Santa Fé do Sul','SP');

insert into tbl_cidade(nome,uf)
values('Uberlândia','MG');

insert into tbl_cidade(nome,uf)
values('São José do Rio Preto','SP');

insert into tbl_cidade(nome,uf)
values('Paranaíba','MS');

insert into tbl_cidade(nome,uf)
values('Birigui','SP');

insert into tbl_bairro(descricao,id_cidade)
values('Centro',1);

insert into tbl_bairro(descricao,id_cidade)
values('Vila Izabel',2);

insert into tbl_bairro(descricao,id_cidade)
values('Jardim Europa',3);

insert into tbl_bairro(descricao,id_cidade)
values('Jardim dos Buritis',3);

insert into tbl_bairro(descricao,id_cidade)
values('Alagoas',4);

insert into tbl_bairro(descricao,id_cidade)
values('Queiróz Siqueira',4);

insert into tbl_bairro(descricao,id_cidade)
values('Alagoas',4);

insert into tbl_bairro(descricao,id_cidade)
values('Parque das Oliveiras',5);

insert into tbl_bairro(descricao,id_cidade)
values('Alphaville',5);

insert into tbl_paciente(nome,id_bairro)
values('Francisco Gabriel Pereira',3);

insert into tbl_paciente(nome,id_bairro)
values('Jurandir Santos',3);

insert into tbl_paciente(nome,id_bairro)
values('Helena da Silva',3);

insert into tbl_paciente(nome,id_bairro)
values('Paulo de Souza',3);

insert into tbl_paciente(nome,id_bairro)
values('Marcela Ezequiel Prado',3);

insert into tbl_paciente(nome,id_bairro)
values('Aline Severo',2);

insert into tbl_paciente(nome,id_bairro)
values('Tatiane Cintra',2);

insert into tbl_paciente(nome,id_bairro)
values('Lucas Eizenberg',4);

insert into tbl_paciente(nome,id_bairro)
values('Maria Antônia Pastequim',4);

insert into tbl_paciente(nome,id_bairro)
values('Eleandro Martins',4);

insert into tbl_paciente(nome,id_bairro)
values('Pietra Renzen',5);

insert into tbl_paciente(nome,id_bairro)
values('Davi Júlio Santos',5);

insert into tbl_setor(nome)
values('Hematologia');

insert into tbl_setor(nome)
values('Bioquímica');

insert into tbl_setor(nome)
values('Imunologia');

insert into tbl_setor(nome)
values('Endocrinologia');

insert into tbl_setor(nome)
values('Microbiologia');

insert into tbl_setor(nome)
values('Micologia');

insert into tbl_setor(nome)
values('Urinálise');

insert into tbl_setor(nome)
values('Parasitologia');

insert into tbl_convenio(nome)
values('UNIMED');

insert into tbl_convenio(nome)
values('Sulamérica');

insert into tbl_convenio(nome)
values('Bradesco');

insert into tbl_exame(nome,id_setor,material_biologico,prazo)
values('Hemograma',1,'Sangue',5);

insert into tbl_exame(nome,id_setor,material_biologico,prazo)
values('Calcemia',1,'Sangue',10);

insert into tbl_exame(nome,id_setor,material_biologico,prazo)
values('Glicose',2,'Sangue',3);

insert into tbl_exame_preco(id_exame,id_convenio,preco)
values(1,1,7.8);

insert into tbl_exame_preco(id_exame,id_convenio,preco)
values(1,2,8.10);

insert into tbl_exame_preco(id_exame,id_convenio,preco)
values(2,1,3.64);

insert into tbl_exame_preco(id_exame,id_convenio,preco)
values(2,2,4.1);

insert into tbl_exame_preco(id_exame,id_convenio,preco)
values(3,1,3);

insert into tbl_exame_preco(id_exame,id_convenio,preco)
values(3,3,3.5);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto A', 1);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto B', 2);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto C', 2);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto D', 3);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto E', 4);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto F', 4);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto G', 5);

insert into tbl_posto_coleta(nome,id_bairro)
values('Posto G', 5);