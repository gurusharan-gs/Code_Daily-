USE college;
show tables;

drop table student;



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




CREATE TABLE student (
    rollno INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    marks INT NOT NULL,
    grade VARCHAR(1),
    city VARCHAR(50)
);

ALTER TABLE student MODIFY rollno INT AUTO_INCREMENT;

SELECT grade, AVG(marks) AS average_marks
FROM student
GROUP BY grade;

select * from student;

select grade, avg(marks) as avg_marks from student group by grade;
select grade, count(grade) as std_grade from student group by grade;
select grade, count(*) as std_grade from student group by grade;

select city, max(marks) as hight_marks from student group by city;

select city, sum(marks) as sum_marks from student group by city;

select grade, city, sum(marks) as total_marks from student group by grade, city;

select city, count(*) from student group by city;

select  grade, min(marks) as min_marks from student group by grade;

select count(distinct city) as unique_city from student;


CREATE TABLE student (
    rollno INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    marks INT NOT NULL,
    grade VARCHAR(1),
    city VARCHAR(50)
);


INSERT INTO student (name, marks, grade, city) 
VALUES 
    ('Emma Watson', 78, 'B', 'Boston'),
    ('Michael Scott', 60, 'C', 'Scranton'),
    ('Dwight Schrute', 95, 'A', 'Scranton'),
    ('Pam Beesly', 88, 'A', 'Philadelphia'),
    ('Jim Halpert', 83, 'B', 'Philadelphia'),
    ('Angela Martin', 91, 'A', 'Scranton'),
    ('Kevin Malone', 55, 'D', 'Scranton'),
    ('Oscar Martinez', 86, 'A', 'Scranton'),
    ('Ryan Howard', 65, 'C', 'New York'),
    ('Kelly Kapoor', 72, 'B', 'New York');

SELECT * from student;
SELECT city, name, marks FROM student;

UPDATE student SET marks = 88 WHERE rollno = 1;
UPDATE student SET marks = 20 WHERE rollno = 16;
UPDATE student SET grade = "F" WHERE rollno = 16;

SELECT * FROM student WHERE city = "New York";
SELECT * FROM student WHERE grade = "A";
SELECT * FROM student WHERE marks > 80;
SELECT * FROM student WHERE marks < 80;
SELECT * FROM student WHERE marks > 70 AND marks < 90;

SELECT * FROM student WHERE marks < 80;
SELECT * FROM student ORDER BY marks ASC;
SELECT * FROM student ORDER BY marks DESC;

SELECT * FROM student ORDER BY name ASC;
SELECT * FROM student ORDER BY name DESC;

SELECT city, COUNT(*) as student_count FROM student GROUP BY city;
SELECT AVG(marks) as avg_marks FROM student;

select * from student where grade = "A";
select grade, count(*) as total_grade_A from student group by grade having grade = "A";

select * from student where city = "Scranton"; 
select * from student where marks > 80;

select * from student where grade = "A" AND city = "Philadelphia";
select * from student where name like "j%";

select * from student where marks between 60 AND 80;

select * from student where rollno between 1 AND 5;

select * from student where marks between 50 AND 70 AND city = "Scranton";

use college;
show tables;
select * from student;

select * from student where name like "a%";
select * from student where name like "r%";
select * from student where name like "%n";
select * from student where name like "%ma%";
select * from student where name like "_a%";
select * from student where not name like "m%";

select * from student order by marks;
select * from student order by marks desc;

select * from student order by grade;
select * from student order by grade desc;

select * from student order by city asc;
select * from student order by city desc;


select name, count(*) from student group by name;
select count(*) as total_count from student;
select count(city) as total_city from student;

select sum(marks) as total_sum from student;

select avg(marks) as total_avg from student;

select max(marks) as hight_marks from student;

select min(marks) as minimum_marks from student;

select name, sum(marks) from student group by name;

select marks  from student group by marks having marks > 80;

select grade, count(*) as student_count from student group by grade;

select city, avg(marks) as avg_marks from student group by city;

select grade, sum(marks) as total_marks from student group by grade order by grade;

select city, max(marks) as hight_marks from student group by city;

select city, min(marks) as minimum_marks from student group by city;
 
 select grade, sum(marks) as total_marks from student group by grade having total_marks > 80;
 
 
CREATE TABLE employee (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone_number VARCHAR(15),
    hire_date DATE NOT NULL,
    job_title VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2)
);

INSERT INTO employee (first_name, last_name, email, phone_number, hire_date, job_title, salary)
VALUES
('John', 'Doe', 'john.doe@example.com', '1234567890', '2023-01-15', 'Software Engineer', 75000.00),
('Jane', 'Smith', 'jane.smith@example.com', '9876543210', '2022-10-01', 'Product Manager', 95000.00),
('Mike', 'Brown', 'mike.brown@example.com', NULL, '2021-05-20', 'Data Analyst', 65000.00),
('Emily', 'Davis', 'emily.davis@example.com', '4561237890', '2020-03-10', 'HR Specialist', 60000.00);

select * from employee;

select * from employee where job_title = "Software Engineer";

select * from employee where salary > 70000;

select * from employee where hire_date > "2022-01-01";

UPDATE employee SET salary = 80000.00 WHERE employee_id = 4;

delete from employee where employee_id = 3;

INSERT INTO employee (first_name, last_name, email, phone_number, hire_date, job_title, salary)
VALUES
('Sophia', 'Taylor', 'sophia.taylor@example.com', '7890123456', '2019-07-01', 'UI/UX Designer', 72000.00),
('Liam', 'Wilson', 'liam.wilson@example.com', NULL, '2021-11-15', 'DevOps Engineer', 88000.00),
('Olivia', 'Martinez', 'olivia.martinez@example.com', '3216549870', '2018-12-20', 'Technical Lead', 105000.00),
('Ethan', 'Johnson', 'ethan.johnson@example.com', '9873216540', '2023-03-05', 'Backend Developer', 67000.00),
('Ava', 'Lopez', 'ava.lopez@example.com', '6547893210', '2020-08-10', 'Marketing Manager', 80000.00),
('Mason', 'Clark', 'mason.clark@example.com', '1237896540', '2022-06-25', 'Frontend Developer', 69000.00);

select * from employee;
update employee set salary = 100000 where employee_id = 8;

select count(*) as total_employees from employee;


