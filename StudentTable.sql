CREATE DATABASE company_db;
USE company_db;

CREATE TABLE employees(
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(100),
  position VARCHAR(100),
  salary INT,
  hire_date DATE
);

INSERT INTO employees (name, position, salary, hire_date)
VALUES ('Alice Johnson', 'Software Engineer', 75000.00, '2025-01-01');

INSERT INTO employees (name, position, salary, hire_date)
VALUES 
    ('Bob Smith', 'Data Analyst', 65000.00, '2025-01-02'),
    ('Carol Davis', 'HR Manager', 85000.00, '2024-12-15'),
    ('Eve Clark', 'Product Manager', 90000.00, '2024-11-20');
    
INSERT INTO employees (name, position, salary)
VALUES ('Emma Brown', 'Marketing Specialist', 60000.00);
    
    SELECT * FROM employees;
    SELECT name, position FROM employees;
    SELECT * FROM employees WHERE position = "Software Engineer";
    UPDATE employees SET name = "Gurusharan Ulagadde" WHERE id = 1;
    SELECT * FROM employees WHERE position = "Software Engineer" AND salary > 70000;
    SELECT * FROM employees WHERE position = "Data Analyst" OR position = "HR Manager";

	SELECT * FROM employees ORDER BY salary ASC;
	SELECT * FROM employees ORDER BY name ASC;
	SELECT * FROM employees ORDER BY position DESC;

    SELECT * FROM employees LIMIT 3;
    SELECT * FROM employees ORDER BY name ASC LIMIT 3;
	SELECT * FROM employees ORDER BY salary DESC LIMIT 3;
    SELECT * FROM employees LIMIT 3 OFFSET 1;
 
	SELECT COUNT(*) AS total_employees FROM employees;
	SELECT AVG(salary) AS avg_salary FROM employees;
	SELECT MAX(salary) AS highest_salary FROM employees;
	SELECT MIN(salary) AS minimum_salary FROM employees;
	SELECT SUM(salary) AS total_salary FROM employees;
    SELECT position, COUNT(*) AS total FROM employees GROUP BY position;
    
 
 SELECT * FROM employees WHERE salary BETWEEN 60000 AND 70000;
 
 SELECT * FROM employees WHERE salary > (SELECT AVG(salary) FROM employees);
 
 SELECT * FROM employees WHERE name LIKE "G%";
 
 SELECT * FROM employees WHERE hire_date IS NULL;
 
 SELECT * FROM employees WHERE position = "Software Engineer" AND salary > 70000 ORDER BY hire_date ASC LIMIT 3;
    
    SELECT * FROM employees WHERE name LIKE "G%";
    SELECT * FROM employees WHERE name LIKE "%n";    
    SELECT * FROM employees WHERE name LIKE "%ar%";
    
    SELECT position, COUNT(*) AS total_employees FROM employees GROUP BY position;
    SELECT position, SUM(salary) AS total_salary FROM employees GROUP BY position;
    SELECT position, AVG(salary) AS average_salary FROM employees GROUP BY position;
    
    SELECT YEAR(hire_date) AS hire_year, COUNT(*) AS total_employees FROM employees GROUP BY YEAR(hire_date);
    
    
    
    
    
    
    
    
    
    
    
    
    
    