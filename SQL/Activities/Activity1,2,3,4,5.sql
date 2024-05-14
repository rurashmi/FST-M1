REM   Script: Activity 1,2,3,4,5
REM   SQL Session 1

create table salesman;

salesman_id int; 


salesman_name varchar2(20); 


salesman_city varchar2(20); 


commision int;


create table salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commision int, 
    );

create table salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commision int, 
);

create table salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commision int 
);

create table salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commision int 
);

describe salesman


describe salesman


inset into salesman(salesman_id, salesman_name, salesman_city, commission) 


    values(5001, James Hoog, New York, 15); 


    values(5002, Nail Knite, Paris, 13); 


	values(5005, Pit Alex, London, 11); 


	values(5006, McLyon, PAris, 14); 


	values(5007, Paul Adam, Rome, 13); 


	values(5003, Lauson Hen, San Jose, 12);


inset into salesman(salesman_id, salesman_name, salesman_city, commission) 


    values(5001, James Hoog, New York, 15); 


    values(5002, Nail Knite, Paris, 13); 


	values(5005, Pit Alex, London, 11); 


	values(5006, McLyon, PAris, 14); 


	values(5007, Paul Adam, Rome, 13); 


select 1 from DUEL;

insert all  
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5001, 'James Hoog', 'New York', 15);

   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5002, 'Nail Knite', 'Paris', 13); 


	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5005, 'Pit Alex', 'London', 11); 


	into salesman (salesman_id, salesman_name, salesman_city, commission values(5006, 'McLyon', 'Paris', 14); 


	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5007, 'Paul Adam', 'Rome', 13); 


select 1 from Dual;

insert all  
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5001, 'James Hoog', 'New York', 15) 
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5002, 'Nail Knite', 'Paris', 13) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5005, 'Pit Alex', 'London', 11) 
	into salesman (salesman_id, salesman_name, salesman_city, commission values(5006, 'McLyon', 'Paris', 14) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5007, 'Paul Adam', 'Rome', 13) 
select 1 from Dual;

insert all  
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5001, 'James Hoog', 'New York', 15) 
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5002, 'Nail Knite', 'Paris', 13) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5005, 'Pit Alex', 'London', 11) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values (5006, 'McLyon', 'Paris', 14) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5007, 'Paul Adam', 'Rome', 13) 
select 1 from Dual;

drop table salesman;

create table salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commission int 
);

describe salesman


insert all  
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5001, 'James Hoog', 'New York', 15) 
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5002, 'Nail Knite', 'Paris', 13) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5005, 'Pit Alex', 'London', 11) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values (5006, 'McLyon', 'Paris', 14) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5007, 'Paul Adam', 'Rome', 13) 
select 1 from Dual;

	values(5003, Lauson Hen, San Jose, 12); 


drop table salesman;

create table salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commission int 
);

describe salesman


insert all  
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5001, 'James Hoog', 'New York', 15) 
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5002, 'Nail Knite', 'Paris', 13) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5005, 'Pit Alex', 'London', 11) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values (5006, 'McLyon', 'Paris', 14) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5007, 'Paul Adam', 'Rome', 13) 
    into salesman (salesman_id, salesman_name, salesman_city, commission) values(5003, 'LAuson Hen', 'San Jose', 12) 
select 1 from Dual;

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city= 'Paris';

select salesman_id, commission from salesman where salesman_name = 'Paul Adam';

alter table salesman 
add (grade, int);

alter table salesman 
add (grade int);

update salesman set grade = 100;

drop table salesman;

create table salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commission int 
);

describe salesman


insert all  
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5001, 'James Hoog', 'New York', 15) 
   into salesman (salesman_id, salesman_name, salesman_city, commission) values(5002, 'Nail Knite', 'Paris', 13) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5005, 'Pit Alex', 'London', 11) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values (5006, 'McLyon', 'Paris', 14) 
	into salesman (salesman_id, salesman_name, salesman_city, commission) values(5007, 'Paul Adam', 'Rome', 13) 
    into salesman (salesman_id, salesman_name, salesman_city, commission) values(5003, 'LAuson Hen', 'San Jose', 12) 
select 1 from Dual;

select salesman_id, salesman_city from salesman;

select * from salesman where salesman_city= 'Paris';

select salesman_id, commission from salesman where salesman_name = 'Paul Adam';

alter table salesman 
add (grade int);

update salesman set grade = 100;

select * from salesman;

update salesman set grade = 200 where salesman_city = 'Rome';

update salesman set grade = 300 where salesman_name = 'James Hoog';

update salesman set salesman_name = 'Pierre' where salesman_name = 'McLyon';

select * from salesman;

