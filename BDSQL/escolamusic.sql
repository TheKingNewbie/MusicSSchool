create database escolamusica;
use escolamusica;

-- --------------------------
select * from tbAlunos;
select * from tbProfessor;
drop table tbprofessor;
drop table tbAlunos;
drop table tbcursos;
show databases;
show tables;
drop database escolamusica;
update tbAlunos set mesPagamento = "Junho" where cod_aluno = 1;
-- --------------------------



create table tbAlunos(
cod_Aluno bigint auto_increment,
nomeAluno varchar (50),
cpf varchar (30),
dataNascimento varchar (20),
endereco varchar (50),
email varchar(50),
cep varchar (30),
telefone varchar (30),
dataCadastro varchar (50),
instrumentos varchar (50),
horario varchar (20),
diasSemanais varchar (30),
ativo varchar (10) default '0',
dataPagamento varchar(30),
cod_Professor bigint,
primary key (cod_Aluno),
constraint tbAlunos_tbProfessor foreign key (cod_Professor) references tbProfessor (cod_Professor));
-----------------------------------------------------------------------------------------------------------------------------
insert into tbAlunos(cod_Aluno, nomeAluno,endereco,email,telefone,datacadastro,instrumentos,horario,diassemanais,ativo,datapagamento)
values (03,'Diogo Heitor Paulo Martins', 'Rua Professora Nair Lemos','Diegomarcelogabrielpires_@valltech.com.br','(93)3513-3940','08/08/2018','Baixo','Das 11h às 12h','Segunda, Sexta',0,'28/08/2018');
-----------------------------------------------------------------------------------------------------------------------------
create table tbProfessor(
cod_Professor bigint auto_increment,
nomeProfessor varchar (50),
cpf varchar (40),
dataNascimento varchar (30),
endereco varchar (50),
bairro varchar (50),
telefone bigint,
email varchar(50),
instrumento varchar (40),
primary key (cod_Professor));


create table tblogin(
idlogin bigint auto_increment,
usuario varchar (30),
senha varchar (20),
primary key (idlogin));

-- ---------------------------------------------------------------------------------------------------
select * from tblogin;
drop table tblogin;
insert into tblogin
values (1, "admin", "admin"), (2, "admin", "1820");
-- ---------------------------------------------------------------------------------------------------
create table tbMusicaCasamento(
idmusica bigint auto_increment,
nomeMusica varchar (100),
estilo varchar (30),
cantor varchar (30),
hiperlink varchar (100),
genero varchar (30),
primary key (idmusica));
-- ---------------------------------------------------------------------------------------------------
select * from tbMusicaCasamento WHERE nomeMusica like '%';
SELECT nomeAluno, endereco, dataNascimento, telefone, instrumentos,horario, diasSemanais FROM tbAlunos WHERE nomeAluno LIKE '%';
-- ---------------------------------------------------------------------------------------------------
create table tborcamento(
idorc bigint auto_increment,
valortotal varchar (10),
tipoFesta varchar (50),
obs varchar (200),
inst1 varchar (30),
inst2 varchar (30),
inst3 varchar (30),
inst4 varchar (30),
inst5 varchar (30),
inst6 varchar (30),
inst7 varchar (30),
inst8 varchar (30),
inst9 varchar (30),
inst10 varchar (30),
qtd1 int,
qtd2 int,
qtd3 int,
qtd4 int,
qtd5 int,
qtd6 int,
qtd7 int,
qtd8 int,
qtd9 int,
qtd10 int,
obs1 varchar (50),
obs2 varchar (50),
obs3 varchar (50),
obs4 varchar (50),
obs5 varchar (50),
obs6 varchar (50),
obs7 varchar (50),
obs8 varchar (50),
obs9 varchar (50),
obs10 varchar (50),
primary key (idorc));
-- ---------------------------------------------------------------------------------------------------
select * from tborcamento;
drop table tborcamento;
insert into tborcamento
values (1, 1800,3,"casamento","abcdef","Violão","Violão","Violão","Violão","Violão","Violão","Violão","Violão","Violão",
"Violão",1,2,3,4,5,6,7,8,9,10,"1","2","3","4","5","6","7","8","9","10");

-- ----------------------------------------------------------------------------------------------------
select * from tbInstrumentos;
create table tbInstrumentos(
idInstrumento bigint auto_increment,
nomeInstrumento varchar (40),
primary key (idInstrumento));
-- -----------------------------------------------------------------------------------------------------