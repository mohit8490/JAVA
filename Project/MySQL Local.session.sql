DROP DATABASE atm_system;
CREATE DATABASE atm_system;
USE atm_system;


CREATE TABLE users (
    cid INT PRIMARY KEY,
    cname VARCHAR(50),
    pin INT,
    balance DOUBLE,
    status VARCHAR(10) DEFAULT 'ACTIVE',
    daily_withdraw DOUBLE DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE manager (
    mid INT PRIMARY KEY,
    password VARCHAR(20)
);

INSERT INTO manager VALUES (1,'admin123');

CREATE TABLE transactions (
    tid INT AUTO_INCREMENT PRIMARY KEY,
    cid INT,
    type VARCHAR(10),
    amount DOUBLE,
    tdate TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE bank (
    bank_balance DOUBLE,
    total_transactions INT
);

INSERT INTO bank VALUES (100000,0);
