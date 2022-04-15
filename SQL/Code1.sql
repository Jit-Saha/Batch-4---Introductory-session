Create table Student(
    id integer,
    name varchar(255),
    class integer,
    roll integer
);

Insert into Student(id, name, class, roll)
values (1, 'Jit', 16, 22);
values (2, 'Rick', 16, 23);

Select * from Student;

Select * from Student where roll = 23;

