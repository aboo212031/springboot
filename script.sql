CREATE DATABASE IF NOT EXISTS store_api;
USE store_api;

CREATE TABLE users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE addresses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    street VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    zipcode VARCHAR(255) NOT NULL,
    user_id BIGINT NOT NULL,
    CONSTRAINT addresses_users_id_fk FOREIGN KEY (user_id) REFERENCES users (id)
);

-- Insert users
INSERT INTO users (name, email, password) VALUES 
('Alice', 'alice@example.com', 'password1'),
('Bob', 'bob@example.com', 'password2');

-- Insert addresses
INSERT INTO addresses (street, city, zipcode, user_id) VALUES 
('123 Main St', 'New York', '10001', 1),
('456 Elm St', 'Los Angeles', '90001', 2);
