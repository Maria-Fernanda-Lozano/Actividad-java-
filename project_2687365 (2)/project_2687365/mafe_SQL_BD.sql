use mafe;
select *from users_tbl;

create table users_tbl(
user_id int(11) auto_increment primary key,
user_firstname varchar(50) not null,
user_lastname varchar(50) not null,
user_email varchar (60) not null,
user_password varbinary (255) not null
);
insert into users_tbl
values ('', 'Laura', 'vega', 'Lalavega0789@gmail.com', 'Lala123');

select *from users_tbl;

insert into users_tbl
values ('', 'Maria', 'Lozano', 'mafe415@gmail.com', '1768M09');

drop table users_tbl;
