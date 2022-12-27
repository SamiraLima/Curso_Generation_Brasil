create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(50) not null,
valor decimal(8,2) not null,
categoria varchar(50) not null,
data_entrega date not null,
avaliacao int,
primary key (id)
);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("celular", 5000.0, "Eletrônica", "2022-10-20", 5);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("computador", 15000.0, "Eletrônica", "2022-09-20", 3);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("Sapato", 150.0, "calcados", "2022-12-10", 2);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("Salto", 100.0, "calcado", "2022-10-08", 1);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("Sombra", 120.0, "Maquiagem", "2022-11-24", 4);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("Base", 50.0, "Maquiagem", "2022-12-24", 5);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("Carne", 180.0, "Alimentos", "2022-12-10", 3);

insert into tb_produtos(nome, valor, categoria, data_entrega, avaliacao) 
value ("Leite", 10000.0, "Alimentos", "2022-10-29", 1);

select * from tb_produtos where valor > 500;

select * from tb_produtos where valor < 500;

alter table tb_produtos add descricao varchar(255);

update tb_produtos set valor = 100 where id = 1;

