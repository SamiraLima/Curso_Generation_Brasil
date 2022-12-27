create database db_generation_game_online;

use db_generation_game_online;

create table tb_classes(
id bigint auto_increment,
habilidades varchar(90) not null,
raça varchar(30) not null,
primary key(id)
);

create table tb_personagens(
id bigint auto_increment,
nome varchar(40) not null,
poder_ataque int not null,
poder_defesa int not null,
nivel int not null,
id_classes bigint,
primary key(id),
foreign key (id_classes) references tb_classes(id)
);

INSERT INTO tb_classes (habilidades, raça)
VALUES ("Atirar flechas", "Arqueiro");

INSERT INTO tb_classes (habilidades, raça)
VALUES ("Se transformar em lobo", "Lobisomem");

INSERT INTO tb_classes (habilidades, raça)
VALUES ("Curar", "Elfo");

INSERT INTO tb_classes (habilidades, raça)
VALUES ("Força", "Troll");

INSERT INTO tb_classes (habilidades, raça)
VALUES ("Lutar com espada", "Espadachim");


INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Maria", 1200, 500, 3, 1);

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Augusto", 4000, 900, 8, 2);

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Bete", 1000, 800, 6, 3);

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Gabriel", 3000, 1800, 12, 4);

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Sabrina", 5000, 1500, 25, 5);

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Samira", 1500, 2000, 10, 5);

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Gustavo", 50000, 10000, 40, 1);

INSERT INTO tb_personagens (nome, poder_ataque, poder_defesa, nivel, id_classes)
VALUES ("Carlos", 1200, 1900, 10, 3);

select * from tb_personagens where poder_ataque > 2000;

select * from tb_personagens where poder_ataque between 1000 and 2000;

select * from tb_personagens where nome like "%c%";

select nome, poder_ataque, poder_defesa, nivel, tb_classes.habilidades, tb_classes.raça
from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.id_classes;

select nome, poder_ataque, poder_defesa, nivel, tb_classes.habilidades, tb_classes.raça
from tb_personagens inner join tb_classes
on tb_classes.id = tb_personagens.id_classes
where tb_classes.id = 5
;






