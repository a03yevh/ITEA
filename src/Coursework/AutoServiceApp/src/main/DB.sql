DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS Orders;
DROP TABLE IF EXISTS Order_Details;

CREATE TABLE Customer(
                         id INTEGER NOT NULL AUTO_INCREMENT,
                         full_name VARCHAR(255) NOT NULL,
                         phone VARCHAR(255) NOT NULL,
                         PRIMARY KEY (id)
);

CREATE TABLE Order_Details(
                              id INTEGER NOT NULL AUTO_INCREMENT,
                              id_order INTEGER REFERENCES Orders(id) ON DELETE CASCADE ON UPDATE CASCADE,
                              information  VARCHAR(255) NOT NULL,
                              status  VARCHAR(255) NOT NULL,
                              order_date DATETIME NOT NULL,
                              PRIMARY KEY (id)
);

CREATE TABLE Orders(
                       id INTEGER NOT NULL AUTO_INCREMENT,
                       id_customer INTEGER REFERENCES Customer(id) ON DELETE CASCADE ON UPDATE CASCADE,
                       PRIMARY KEY (id)
);

INSERT INTO Customer(full_name,phone)
VALUES
    ('Олег Іванов','+380967945555'),
    ('Степан Бандера','+380979379992'),
    ('Ілон Маск','+380968051234'),
    ('Богдан Хмельницький','+380961234567'),
    ('Сергій Миронов','+380501259122');

INSERT INTO Orders(id_customer)
VALUES
    (1),
    (2),
    (3),
    (4),
    (2),
    (1);

INSERT INTO Order_Details(id_order,information,status,order_date)
VALUES
    (1,'Очікує деталі','Очікування',curdate()),
    (2,'Деталі доставлені та встановлені','Закрито',curdate()),
    (3,'Деталі доставлені та встановлюються','В роботі',curdate()),
    (4,'Деталі доставлені та встановлені','Виконано',curdate()),
    (5,'Очікує деталі','Очікування',curdate()),
    (6,'Деталі доставлені та встановлюються','В роботі',curdate());