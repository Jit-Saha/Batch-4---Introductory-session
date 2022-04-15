-- Joins 
Select * from student;
select * from studentBio;

select s.name, class, city from student as s , studentBio as sb where s.id = sb.id;