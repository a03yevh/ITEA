USE MyJoinsDB;

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    PhoneNumber VARCHAR(15)
);

CREATE TABLE Positions (
    PositionID INT PRIMARY KEY,
    PositionName VARCHAR(50),
    Salary DECIMAL(10, 2)
);

CREATE TABLE EmployeeInfo (
    EmployeeID INT PRIMARY KEY,
    BirthDate DATE,
    MaritalStatus VARCHAR(20),
    Address VARCHAR(100),
    FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID)
);

ALTER TABLE Employees ADD PositionID INT;
ALTER TABLE Employees ADD CONSTRAINT FK_Employees_Positions FOREIGN KEY (PositionID) REFERENCES Positions(PositionID);

ALTER TABLE EmployeeInfo ADD CONSTRAINT FK_EmployeeInfo_Employees FOREIGN KEY (EmployeeID) REFERENCES Employees(EmployeeID);

INSERT INTO Positions (PositionID, PositionName, Salary)
VALUES
    (1, 'Головний директор', 100000.00),
    (2, 'Менеджер', 50000.00),
    (3, 'Робітник', 30000.00);

INSERT INTO Employees (EmployeeID, FirstName, LastName, PhoneNumber, PositionID)
VALUES
    (1, 'Іван', 'Петров', '+123456789', 1),
    (2, 'Анна', 'Іванова', '+987654321', 2),
    (3, 'Петро', 'Сидоров', '+555555555', 3),
    (4, 'Марія', 'Коваленко', '+444444444', 2),
    (5, 'Олексій', 'Савчук', '+666666666', 3),
    (6, 'Наталія', 'Козлова', '+777777777', 2),
    (7, 'Сергій', 'Білоус', '+888888888', 3),
    (8, 'Юлія', 'Захарчук', '+999999999', 2),
    (9, 'Василь', 'Лисенко', '+111111111', 3),
    (10, 'Оксана', 'Мельник', '+222222222', 2),
    (11, 'Андрій', 'Романов', '+333333333', 3),
    (12, 'Ірина', 'Кравчук', '+555555555', 2),
    (13, 'Павло', 'Бойко', '+777777777', 3),
    (14, 'Тетяна', 'Левченко', '+888888888', 2),
    (15, 'Віталій', 'Григоренко', '+999999999', 3);

INSERT INTO EmployeeInfo (EmployeeID, BirthDate, MaritalStatus, Address)
VALUES
    (1, '1990-05-15', 'Одружений', 'м. Київ, вул. Польова, 123'),
    (2, '1985-08-22', 'Неодружена', 'м. Львів, вул. Мінська, 456'),
    (3, '1995-02-10', 'Одружений', 'м. Харків, вул. Тростова, 789'),
    (4, '1992-11-03', 'Неодружена', 'м. Одеса, вул. Культурна, 234'),
    (5, '1988-07-20', 'Одружений', 'м. Дніпро, вул. Львівська, 567'),
    (6, '1993-09-18', 'Неодружена', 'м. Хмельницький, вул. Нова, 890'),
    (7, '1987-04-12', 'Одружений', 'м. Рівне, вул. Справжня, 123'),
    (8, '1991-01-25', 'Неодружена', 'м. Тернопіль, вул. Мікла, 456'),
    (9, '1994-06-08', 'Одружений', 'м. Луцьк, вул. Ліська, 789'),
    (10, '1990-03-30', 'Неодружена', 'м. Івано-Франківськ, вул. Загальна, 234'),
    (11, '1996-10-17', 'Одружений', 'м. Запоріжжя, вул. Велика, 567'),
    (12, '1989-12-01', 'Неодружена', 'м. Суми, вул. Далека, 890'),
    (13, '1993-02-28', 'Одружений', 'м. Чернігів, вул. Близька, 123'),
    (14, '1986-03-09', 'Неодружена', 'м. Кропивницький, вул. Форт, 456'),
    (15, '1992-09-05', 'Одружений', 'м. Миколаїв, вул. Парусів, 789');
