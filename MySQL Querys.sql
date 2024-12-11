USE college;
show tables;
drop table student;

create table student(
rollno int primary key,
name varchar(50),
marks int not null,
grade varchar(1),
city varchar(50)
);

desc student;

insert into student value(1,"Gurusharan",80,"B","Dehli");
select * from student;
insert into student value
(2,"Bhumika",96,"A","Mumbai"),
(3,"Chetan",85,"B","Mumbai"),
(4,"Druv",96,"A","Pune"),
(5,"Emanuel",12,"F","Dehli"),
(6,"Farah",82,"B","Dehli"),
(7,"Ravi",78,"C","Bangalore"),
(8,"Ramesh",85,"B","Bangalore");

select name, city from student;
select rollno, name, marks from student;

-- where-- 
select * from student where marks > 80;
select * from student where marks < 80;
select * from student where city = "Bangalore";
select * from student where city = "Dehli";
select * from student where city = "Mumbai";
select * from student where city = "Pune";

-- AND
select * from student where city = "Dehli" AND marks > 80;
select * from student where city = "Bangalore" AND marks > 80;
select * from student where city = "Mumbai" AND marks < 90;
select * from student where marks >= 80 AND marks < 90;

-- OR
select * from student where city = "Dehli" OR marks < 80;

-- BETWEEN
select * from student where marks BETWEEN 80 AND 90;
select * from student where grade BETWEEN "A" AND "B";

-- IN
select * from student where city IN("Bangalore","Pune");
select * from student where city IN("Dehli", "Mumbai");

select * from student limit 3;

-- Sorting Querys
select * from student order by marks ASC;
select * from student order by grade asc;
select * from student order by grade desc;
select * from student order by name asc;
select * from student order by name desc;
select * from student order by city asc;
select * from student order by city desc;

-- Aggregate function perform a calculation return single value-- 
select count(name) from student;
select count(grade) from student;
select max(marks) from student;
select min(marks) from student;
select avg(marks) from student;

-- Group By
select city from student group by city;
select city, count(rollno) from student group by city;

select marks from student group by marks;

select city, count(rollno) from student group by city;
select city, count(marks) from student group by city having max(marks) > 80;

-- ALTER-- 
ALTER TABLE student ADD COLUMN age INT;
ALTER TABLE student DROP COLUMN age;
select * from student;

ALTER TABLE student ADD COLUMN age INT NOT NULL DEFAULT 19;

ALTER TABLE student MODIFY COLUMN age VARCHAR(2);

ALTER TABLE student CHANGE age std_age INT;
ALTER TABLE student DROP COLUMN std_age;

ALTER TABLE student RENAME TO std;
ALTER TABLE std RENAME TO student;

ALTER TABLE student CHANGE name full_name VARCHAR(50);

DELETE FROM student WHERE marks < 80;











