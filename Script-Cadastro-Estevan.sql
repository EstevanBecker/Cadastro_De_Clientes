create table if not exists cliente (
id int generated always as identity primary key,
nome varchar(250) not null,
data_nascimento date not null,
rg varchar(13) not null, 
cpf varchar(11) not null,
idContato int,
numeroContato varchar(14),
possuiResponsavel boolean, -- Y -- N
idResponsavel int
);


alter table cliente 
add constraint idContato foreign key (idContato) references contato (id)

alter table cliente 
add constraint numeroContato foreign key (numeroContato) references contato(numero)

alter table cliente 
add constraint idResponsavel foreign key (idResponsavel) references responsavel (id);
add constraint numeroContato foreign key (numeroContato) references contato (numero);


create table if not exists contato (
id int generated always as identity primary key,
numero varchar(14) not null,
idCliente int references cliente (id)
);

alter table contato 
add constraint 

create table if not exists responsavel (
id int generated always as identity primary key, 
nome varchar(250) not null, 
cpf varchar(11) not null,
idCliente int references cliente(id)
);

create table if not exists endereco (
id int generated always as identity primary key, 
logradouro varchar(50) not null, 
numero int not null,
cep varchar(12) not null, 
cidade varchar(50) not null,
estado varchar(20) not null,
idCliente int references cliente (id)
)


   