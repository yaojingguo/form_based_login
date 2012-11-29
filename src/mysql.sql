create database weblogin;
use weblogin;


create table users (
   login varchar (15) not null,
   pass varchar (15) not null,
   primary key (login)
);


create table groups (
   login varchar (15) not null,
   team varchar (15) not null,
   primary key (login, team)
);

insert into users values('green', 'testpwd');
insert into groups values('green', 'testgroup');