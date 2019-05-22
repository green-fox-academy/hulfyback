SHOW DATABASES;

CREATE DATABASE IF NOT EXISTS material_review;

USE material_review;

CREATE TABLE IF NOT EXISTS customers (
  id INT auto_increment PRIMARY KEY,
  name VARCHAR(30) not null,
  age SMALLINT,
  gender enum("F", "M")  
);
  
CREATE TABLE IF NOT EXISTS meals (
  id INT auto_increment PRIMARY KEY,
  name VARCHAR(30) not null,
  price INT not null
);

CREATE TABLE IF NOT EXISTS orders (
  id INT auto_increment PRIMARY KEY,
  date timestamp,
  customer_id INT,
  meal_id INT,
  FOREIGN KEY (customer_id) REFERENCES customers(id),
  FOREIGN KEY (meal_id) REFERENCES meals(id)
);

SHOW TABLES;

INSERT INTO customers VALUES (null, "Barna", 25, "M");

INSERT INTO customers (name, age, gender) 
VALUES 
  ("Suvi", 26, "M"),
  ("Alex", 23, "M"),
  ("Egg", 31, "M"),
  ("Andrea", 18, "F");
  
SELECT * FROM customers;

DELETE FROM customers WHERE id = 3;

INSERT INTO meals (name, price) 
VALUES 
  ("hamburger", 999),
  ("Gyros", 499),
  ("pencakes", 499),
  ("Salad", 1490),
  ("Chocolate cake", 999),
  ("Muffins", 1199);
  
INSERT INTO orders (date, customer_id, meal_id)
VALUES
  (NOW(), 1, 2),
  (NOW(), 1, 1),
  (NOW(), 2, 3),
  (NOW(), 2, 4),
  (NOW(), 4, 3);
  
SELECT name FROM customers WHERE age <= 26;

SELECT name FROM customers WHERE age BETWEEN 23 AND 26;

SELECT COUNT(*) FROM orders WHERE customer_id = 1;

SELECT COUNT(*) 
FROM customers c, orders o 
WHERE c.name = "Suvi" AND o.customer_id = c.id;

SELECT gender, COUNT(*)
FROM customers
GROUP BY gender;

SELECT date FROM orders o 
JOIN meals m ON o.meal_id = m.id 
WHERE m.name = "Gyros";

UPDATE customers SET age = 50 WHERE name = "Suvi";

ALTER TABLE customers CHANGE age customer_age TINYINT UNSIGNED;

#show the structure of a table withoud values
DESCRIBE cUstomers;

#disable safe updates
SET sql_safe_updates = 0;