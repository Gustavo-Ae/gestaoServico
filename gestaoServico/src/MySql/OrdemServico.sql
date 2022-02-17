
-- Cria o banco de dados: 

create database dbinfo;

-- ESCOLHE O BANCO DE DADOS : 
use dbinfo

-- CRIA UMA TABELA :
create table tbUsuario(
	idUser int primary key auto_increment, 
    usuario varchar(50) not null,
    fone varchar(15),
    login varchar(15) not null unique,
    senha varchar(15) not null unique
);

-- mostra a tabela : 
describe tbUsuario;

-- inseri dados na tabela (CRUD) - 4 operações básicas da manipulação dos dados:
-- Create --> insert
insert into tbUsuario(usuario, fone, login, senha) values ("Jose de Assis","999-999","joseassis","123456"); 

-- exibe os dados da tabela (cRud);
-- read --> select 
select * from tbUsuario;  -- Mostra os dados da tabela "tbUsuario" 

insert into tbUsuario(usuario, fone, login, senha) values ("Bill Gates","999-999","bill","12345"); 

-- modifica dados na tabela (crUd);
-- update --> update 
update tbUsuario set fone = "888-888" where iduser = 2;
-- apaga um registro na tabela (cruD);
-- delete --> delete;
delete from tbUsuario where idUser = 3;

-- Agora vamos criar o cadastro de clientes :
create table tbClientes( 
	idCliente int primary key auto_increment,  
	nomeCliente varchar(50) not null,      -- not null = quer dizer que o campo é obrigatório
	enderecoCliente varchar(100), 
	foneCliente varchar(50) not null,
	emailCliente varchar(50)
);


describe tbclientes;

insert into tbClientes(nomeCliente, enderecoCliente,foneCliente, emailCliente)
values ("Linus Torvalds", "Rua Tux, 2015","999-999","linusDoPneu@hotmail.com");

select * from tbClientes;

-- #4  - Relacionamento de Tabelas 

create table tb_OrdemServico(   -- O relacionamento entre tb_OrdemServico e tbClientes é 1 para muitos.
	codigo int primary key auto_increment,
    data_hora timestamp default current_timestamp, -- O Sistema deverá gerar automaticamente data e hora na emissão da OS.
    equipamento varchar(150) not null,
    defeito varchar(150) not null,
    servico varchar(150),
    tecnico varchar(30),
    valor decimal(10,2),
    idCliente int not null,
    foreign key(idCliente) references tbClientes(idCliente) -- Msmo tipo de dado da tabela ciente 
);

describe tb_OrdemServico

insert into tb_OrdemServico(equipamento,defeito,servico,tecnico,valor,idCliente) values("Notebook","Não Liga","Troca da Fonte","Zé",87.50,1);

-- O Código abaixo traz informações de duas tabelas 

select 
O.codigo,equipamento,defeito,servico,valor,  -- O é uma variável que representa a tabela de ordem serviço
C.nomeCliente,foneCliente -- C é uma variavel que representa a tabela de clientes 
from tb_OrdemServico as O 
inner join tbclientes as C  -- inner join vai juntar 2 tabelas 
on (O.idCliente = C.idCliente);    -- (chave estrangeira = chave primaria)

-- fazer uma pesquisa utilizando outro nome

select idCliente as id , nomeCliente as nome , enderecoCliente as endereco, foneCliente as fone , emailCliente as email from tbclientes;

CREATE USER 'dba'@'%' IDENTIFIED BY 'Infox123456';

-- A instrução abaixo seleciona e ordena por nome todos os clientes cadastrados 
select * from tbclientes order by nomeCliente;

-- O Bloco de instruções abaixo faz a seleção e união de dados de duas tabelas 
-- OSER é uma variável que contém os campos da tabela tb_ordemServico
-- CLI é outra variavel que contem os campos da tabela tb_clientes
select 
OSER.codigo,data_hora,tipo,situacao,equipamento,valor,
CLI.nomeCliente,foneCliente 
from tb_ordemservico as OSER 
inner join tbclientes as CLI
on(CLI.idCliente = OSER.idCliente);

use dbinfo

select max(codigo) as Código from tb_ordemservico;
