--drop table productos;

create table productos(
id_producto number(3,0)  GENERATED ALWAYS AS IDENTITY  primary key,
nombre varchar2(30),
fecha_registro date
)

insert into productos(nombre,fecha_registro) values('monitor',sysdate);
insert into productos(nombre,fecha_registro) values('mouse',sysdate);
insert into productos(nombre,fecha_registro) values('teclado',sysdate);

commit;