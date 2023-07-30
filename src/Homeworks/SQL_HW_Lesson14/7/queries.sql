CREATE DATABASE opt;

USE opt;

CREATE TABLE Suppliers (
  SupplierID SERIAL PRIMARY KEY,
  SupplierName VARCHAR(100) NOT NULL,
  SupplierContact VARCHAR(100) NOT NULL
);

CREATE TABLE Staff (
  StaffID SERIAL PRIMARY KEY,
  StaffName VARCHAR(100) NOT NULL,
  StaffPosition VARCHAR(100) NOT NULL,
  StaffContact VARCHAR(100) NOT NULL
);

CREATE TABLE Customers (
  CustomerID SERIAL PRIMARY KEY,
  CustomerName VARCHAR(100) NOT NULL,
  CustomerContact VARCHAR(100) NOT NULL
);

CREATE TABLE Products (
  ProductID SERIAL PRIMARY KEY,
  ProductName VARCHAR(100) NOT NULL,
  SupplierID INTEGER REFERENCES Suppliers(SupplierID)
);

CREATE TABLE Orders (
  OrderID SERIAL PRIMARY KEY,
  CustomerID INTEGER REFERENCES Customers(CustomerID),
  OrderDate DATE NOT NULL
);

CREATE TABLE OrderItems (
  OrderItemID SERIAL PRIMARY KEY,
  OrderID INTEGER REFERENCES Orders(OrderID),
  ProductID INTEGER REFERENCES Products(ProductID),
  Quantity INTEGER NOT NULL
);

INSERT INTO Suppliers (SupplierName, SupplierContact)
VALUES
    ('Фермерське господарство "Золоте зерно"', 'zolote_zerno@gmail.com'),
    ('ТОВ "Екопродукт"', 'ekoprodukt@ukr.net'),
    ('Кооператив "Укроп"', 'ukrop_coop@i.ua');

INSERT INTO Staff (StaffName, StaffPosition, StaffContact)
VALUES
    ('Ірина Ковальова', 'Менеджер', 'iryna.kovalova@mail24.com'),
    ('Олександр Петренко', 'Помічник', 'oleksandr.petrenko@i.ua'),
    ('Людмила Іванова', 'Складський робітник', 'lyudmyla.ivanova@s123.ua');

INSERT INTO Customers (CustomerName, CustomerContact)
VALUES
    ('ТОВ "Смаколик"', 'info@smakolik.com.ua'),
    ('Фірма "Полісся"', 'polissya.firm@gmail.com'),
    ('ПП "Агропродукт"', 'agroprod.pp@ukr.net');

INSERT INTO Products (ProductName, SupplierID)
VALUES
    ('Молоко "Здорове"', 1),
    ('Хліб "Селянський"', 1),
    ('Олія соняшникова "Сонечко"', 2),
    ('М`ясо свинини "Свіже"', 3);

INSERT INTO Orders (CustomerID, OrderDate)
VALUES
    (1, '2023-07-01'),
    (2, '2023-07-15'),
    (3, '2023-07-20');

INSERT INTO OrderItems (OrderID, ProductID, Quantity)
VALUES
    (1, 1, 50),
    (1, 2, 30),
    (2, 3, 20),
    (3, 4, 40);
