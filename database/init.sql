-- Create database and tables
CREATE DATABASE IF NOT EXISTS restful_crud_app;

USE restful_crud_app;

-- Create DBA user
CREATE USER IF NOT EXISTS 'dba_user'@'localhost' IDENTIFIED BY 'SecurePassword123';
GRANT ALL PRIVILEGES ON *.* TO 'dba_user'@'localhost';
FLUSH PRIVILEGES;

-- Create second user with limited permissions
CREATE USER IF NOT EXISTS 'limited_user'@'localhost' IDENTIFIED BY 'MyP@ssw0rd';
GRANT SELECT, INSERT, UPDATE, DELETE ON restful_crud_app.* TO 'limited_user'@'localhost';
FLUSH PRIVILEGES;

-- Drop tables if they exist
DROP TABLE IF EXISTS log;
DROP TABLE IF EXISTS item;
DROP TABLE IF EXISTS category;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS role;

-- Create role table
CREATE TABLE role (
    id INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(15),
    is_admin BOOLEAN NOT NULL DEFAULT FALSE
);

-- Create user table
CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    role_id INT NOT NULL DEFAULT 2,
    name VARCHAR(30),
    username VARCHAR(5) UNIQUE,
    password VARCHAR(50),
    FOREIGN KEY (role_id) REFERENCES role(id)
);

-- Create category table
CREATE TABLE category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(50)
);

-- Create item table
CREATE TABLE item (
    id INT AUTO_INCREMENT,
    user_id INT,
    last_update DATE,
    category_id INT NOT NULL DEFAULT 0,
    PRIMARY KEY (id, category_id),
    FOREIGN KEY (user_id) REFERENCES user(id),
    FOREIGN KEY (category_id) REFERENCES category(id)
);

-- Create log table
CREATE TABLE log (
    date DATE,
    username VARCHAR(255),
    action VARCHAR(255),
    table_name VARCHAR(255)
);
