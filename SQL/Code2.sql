Create table StudentBio(
    id integer Primary Key,
    name varchar(255),
    city varchar(255)
);

Insert into StudentBio(id, name, city)
values (1, 'Jit', 'Kolkata');
values (2, 'Rick', 'Chennai');
values (3, 'Prat', 'Pune');
values (4, 'Ravi', 'Kolkata');
values (5, 'Shree', 'Chennai');
values (6, 'Keshaw', 'Pune');
values (7, 'Adit', 'Bangalore');

SELECT * FROM `studentbio` WHERE city = 'Kolkata' or city = 'Pune';
SELECT * FROM `studentbio` WHERE city = 'Kolkata' and city = 'Pune';
SELECT * FROM `studentbio` WHERE not city = 'Kolkata';
SELECT * FROM `studentbio` order by city;

Update studentBio set city = 'Kolkata' where id = 2; 

select * from studentbio where id in (23,2);
select * from studentbio limit 4;
select count(roll) from studentbio;

select * from studentbio where city like '%e';
select * from studentbio where city like '_h%';
select * from studentbio where name like '[a-k]%';

select name from studentBio where id in (3,6);
select name from studentBio where id not in (3,6);

