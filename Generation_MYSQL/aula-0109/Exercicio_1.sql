create database db_RH;

use db_RH;

create table info_funcionario(
id bigint auto_increment,
nome varchar(30) not null,
cargo varchar(70) not null,
idade int not null,
data_contratacao date not null,
salario decimal(5,2),
primary key (id)
);

insert into info_funcionario(nome, cargo, idade, data_contratacao, salario)
values("Samira", "Desenvolvedora mobile", 18, "2022-09-01", 2500.0);

insert into info_funcionario(nome, cargo, idade, data_contratacao, salario)
values("Sabrina", "Desenvolvedora mobile", 18, "2022-09-01", 1500.0);

insert into info_funcionario(nome, cargo, idade, data_contratacao, salario)
values("Emilly", "Desenvolvedora mobile", 18, "2022-09-01",2000.0);

insert into info_funcionario(nome, cargo, idade, data_contratacao, salario)
values("Elisabeth", "Desenvolvedora mobile", 18, "2022-09-01", 1000.0);

insert into info_funcionario(nome, cargo, idade, data_contratacao, salario)
values("Maria", "Desenvolvedora mobile", 18, "2022-09-01", 3000.0);

select * from info_funcionario where salario > 2000.0;

select * from info_funcionario where salario < 2000.0;

update info_funcionario set nome = "Elisabete" where id = 4;

