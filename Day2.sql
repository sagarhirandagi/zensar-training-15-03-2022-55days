
select * from Empdata;
drop table Empdata;
show tables;


create table emp(
ename varchar(20),
salary int,
role varchar(20)
);

insert into emp values('Saagr',12345,'JSE');
insert into emp values('Anand',12345,'Developer');
insert into emp values('ABC',1000,'JSE');
insert into emp(ename,salary)
values('Tom',1000);

select * from emp where role='JSE';
select salary from emp where salary>1000;
select * from emp;
select * from emp order by salary DESC; 


select * from emp where role is not null;
update emp set salary=5000 where salary=1000;
use employeedb;
select * from emp where salary>5000 or salary<10000;
delete from emp where salary=5000;

select *, min(salary) from emp;
select max(salary) from emp;
select count(salary) from emp;
select avg(salary) from emp;
select sum(salary) from emp;


alter table emp drop column salary;
select * from emp;
alter table emp add column salary int;
alter table emp add column email varchar(50);
insert into emp values('XYZ','Tester',12345,'abc@gmail.com');
update emp set salary=23456 where role='JSE';
update emp set salary=20000 where ename='anand';
update emp set email='xyz@gmail.com' where email is null;
select * from emp where not salary=20000;
update emp set ename='Sagar' where ename='Saagr';
select * from emp where ename like 'a%' and salary>20000;
alter table emp add column eid int after ename;
update emp set eid=4 where role='tester';
alter table emp change eid empid int;
update emp set salary=salary+salary*0.05;
