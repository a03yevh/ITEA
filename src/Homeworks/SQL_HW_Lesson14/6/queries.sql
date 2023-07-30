CREATE DATABASE cars_database;
USE cars_database;

CREATE TABLE cars (
    id INT AUTO_INCREMENT PRIMARY KEY,
    brand VARCHAR(255) NOT NULL,
    model VARCHAR(255) NOT NULL,
    engine_volume FLOAT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    max_speed INT
);

INSERT INTO cars (brand, model, engine_volume, price, max_speed)
VALUES
    ('Toyota', 'Corolla', 1.6, 25000.00, 180),
    ('Honda', 'Civic', 1.8, 27000.00, 190),
    ('Ford', 'Focus', 1.5, 23000.00, 170),
    ('Volkswagen', 'Golf', 2.0, 28000.00, 200),
    ('BMW', '3 Series', 2.0, 35000.00, 220);