REM   Script: Activity 11
REM   Activity 11

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

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

describe salesman


describe salesman


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

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from order;

select distinct salesman_id from orders;

select order_no from orders order by order_date asc;

select order_no, order_date from orders order by order_date asc;

select order_no from orders order by purchase_amount desc;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;

select sum(purchase_amount) from orders;

select max(purchase_amount) from orders;

select min(purchase_amount) from orders;

select count(*) from orders;

select avg(purchase_amount) from orders;

select max(purchanse_amount), customer_id 
group by customer_id;

select max(purchanse_amount), customer_id from orders 
group by customer_id;

select max(purchase_amount), customer_id from orders 
group by customer_id;

select max(purchase_amount), salesman_id from orders where order_date like '2012/08/17';

select max(purchase_amount), salesman_id from orders where order_date like '%2012/08/17%';

select max(purchase_amount), salesman_id from orders where order_date like '%2012/08/17%' group by salesman_id;

select max(purchase_amount), salesman_id from orders where order_date like '2012/08/17' group by salesman_id;

select max(purchase_amount), salesman_id from orders where order_date = to_date ('2012/08/17', 'yyyy/dd/mm') group by salesman_id;

select max(purchase_amount), salesman_id from orders where order_date = to_date ('2012/08/17', 'yyyy/mm/dd') group by salesman_id;

select max(purchase_amount), customer_id, order_date from orders group by customer_id, order_date having max(purchase_amount) 
in (2030, 3450, 5760, 6000);

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

describe salesman


describe salesman


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

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

INSERT ALL 
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001) 
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001) 
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002) 
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002) 
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006) 
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003) 
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007) 
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005) 
SELECT 1 FROM DUAL;

select * from customers;

select * from salesman;

select customer_name, salesman_id from customers group by salesman_id;

select * from customers;

select customer_name, salesman_id from customers group by salesman_id;

select customer_name, salesman_id from customers group by salesman_id order by salesman_id;

select * from salesman;

select customer_name, salesman_name right join a.salesman_id on customers = b.salesman_id on salesman;

select a.customer_name, b.salesman_name from customers a inner join salesman b on a.salesman_id = b.salesman_id;

select * from salesman;

select a.customer_name, a.city, a.grade, b.salesman_id, b.salesman_name, b.city from customers a inner join salesman b on a.salesman_id = b.salesman_id where  
a.grade < 300 order by a.customer_id ASC;

select * from salesman;

select a.customer_name, a.city, a.grade, b.salesman_id, b.salesman_name, b.salesman_city from customers a inner join salesman b on a.salesman_id = b.salesman_id where  
a.grade < 300 order by a.customer_id ASC;

select * from salesman;

select a.customer_name, b.salesman_id, b.salesman_name, from customers a inner join salesman b on a.salesman_id = b.salesman_id where  
b.commission > 12 order by a.customer_id ASC;

select a.customer_name, b.salesman_id, b.salesman_name, b.commission from customers a inner join salesman b on a.salesman_id = b.salesman_id where  
b.commission > 12 order by a.customer_id ASC;

select a.customer_name, b.salesman_id, b.salesman_name, b.commission from customers a inner join salesman b on a.salesman_id = b.salesman_id where  
b.commission > 12;

select * from order;

select * from orders;

create table orders(  
    order_no int primary key, purchase_amount float, order_date date,  
    customer_id int, salesman_id int);

INSERT ALL  
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)   
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)  
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)  
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)  
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)  
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)  
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)  
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)  
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)  
SELECT 1 FROM DUAL;

select * from order;

select * from orders;

select a.order_no, a.purchase_amount, a.order_date, b.customer_name, c.salesman_name, c.commission from orders 
a inner join customers b on a.customer_id = b.customer_id 
a inner join salesman c on  a.salesman_id = c.salesman_id;

select a.order_no, a.purchase_amount, a.order_date, b.customer_name, c.salesman_name, c.commission from orders a 
inner join customers b on a.customer_id = b.customer_id 
inner join salesman c on  a.salesman_id = c.salesman_id;

select * from customers;

select salesman_id from customers where customer id = 3007;

select salesman_id from customers where customer_id = 3007;

select * from orders where salesman_id in (select salesman_id from customers where customer_id = 3007);

select * from salesman;

select salesman_id from salesman where salesman_city = 'New York';

select * from orders where salesman_id in (select salesman_id from salesman where salesman_city = 'New York');

select * from orders where salesman_id in (select distinct salesman_id from customers where customer_id = 3007);

select * from orders;

select * from salesman;

select * from customers;

select avg(grade) from customers where city = 'New York';

select grade count(*) from customers group by grade where grade > (select avg(grade) from customers where city = 'New York');

select grade, count(*) from customers group by grade where grade > (select avg(grade) from customers where city = 'New York');

select grade, count(*) from customers group by grade having grade > (select avg(grade) from customers where city = 'New York');

select * from salesman;

select * from orders where salesman_id in (select salesman_id from salesman where commission = (select max(commission) from salesman));

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

SELECT customer_id, customer_name FROM customers a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id) 
UNION 
SELECT salesman_id, salesman_name FROM salesman a 
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id) 
ORDER BY customer_name;

SELECT a.salesman_id, a.salesman_name, b.order_no, 'highest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date) 
UNION 
SELECT a.salesman_id, a.salesman_name, b.order_no, 'lowest on', b.order_date FROM salesman a, orders b 
WHERE a.salesman_id=b.salesman_id 
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);

