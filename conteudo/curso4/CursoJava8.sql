select * from cliente;
insert into cliente values(123456,'Maria', 'maria@gmail.com');
update cliente set nome="Maria José Francisca" where cpf='123456';
delete from cliente where cpf=123456;


select * from curso;
insert into curso values(2,'Oracle 12C',3000,'/oracle');
update curso set valor=2000 where cdcurso=2;
delete from curso where cdcurso=2;