
CREATE DATABASE college;
USE college;

CREATE TABLE student(
id INT PRIMARY KEY,
name VARCHAR(50),
age INT NOT NULL
);

show tables;

SELECT * FROM student;

UPDATE student SET marks = 40, grade = "F" WHERE rollno = 4;

UPDATE student SET city = "Karnataka" WHERE rollno = 4;

UPDATE student SET name = "Raju Bhai", marks = 90, grade = "A" WHERE rollno = 7;

SELECT name FROM student;

DELETE FROM student WHERE rollno = 7;

DELETE FROM student WHERE rollno = 10;

CREATE TABLE products(
id INT PRIMARY KEY NOT NULL,
name VARCHAR(255) NOT NULL
);
INSERT INTO product (id, name) VALUES("Sagar");
SELECT * FROM product;
UPDATE product SET name = "Mango" WHERE id = 1;
DELETE FROM product  WHERE id = 1;





