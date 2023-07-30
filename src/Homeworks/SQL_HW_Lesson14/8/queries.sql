CREATE DATABASE personnel_department_system;

USE personnel_department_system;

CREATE TABLE Departments (
    department_id INT PRIMARY KEY AUTO_INCREMENT,
    department_name VARCHAR(100) NOT NULL
);

CREATE TABLE Positions (
    position_id INT PRIMARY KEY AUTO_INCREMENT,
    position_title VARCHAR(100) NOT NULL
);

CREATE TABLE Employees (
    employee_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    birth_date DATE NOT NULL,
    department_id INT,
    position_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments (department_id),
    FOREIGN KEY (position_id) REFERENCES Positions (position_id)
);

CREATE TABLE Salary (
    salary_id INT PRIMARY KEY AUTO_INCREMENT,
    employee_id INT NOT NULL,
    salary_amount DECIMAL(10, 2) NOT NULL,
    salary_date DATE NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES Employees (employee_id)
);

INSERT INTO Departments (department_name)
VALUES ('Відділ продажу'),
       ('Відділ маркетингу'),
       ('Відділ розробки'),
       ('Відділ якості');

INSERT INTO Positions (position_title)
VALUES ('Менеджер'),
       ('Інженер'),
       ('Маркетолог'),
       ('Тестувальник');

INSERT INTO Employees (first_name, last_name, birth_date, department_id, position_id)
VALUES ('Іван', 'Петров', '1990-05-15', 1, 1),
       ('Олена', 'Сидорова', '1985-12-10', 1, 2),
       ('Павло', 'Іванов', '1995-08-20', 2, 3),
       ('Анна', 'Козлова', '1992-04-25', 3, 2),
       ('Дмитро', 'Євгін', '1988-11-30', 4, 4);

INSERT INTO Salary (employee_id, salary_amount, salary_date)
VALUES (1, 50000.00, '2023-07-01'),
       (2, 60000.00, '2023-07-01'),
       (3, 70000.00, '2023-07-01'),
       (4, 55000.00, '2023-07-01'),
       (5, 45000.00, '2023-07-01');
