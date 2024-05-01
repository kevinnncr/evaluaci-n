CREATE TABLE IF NOT EXISTS users(
    id SERIAL,
    nameUser VARCHAR(100) NOT NULL,
    address VARCHAR(100) NOT NULL,
    dni INT NOT NULL,
    PRIMARY KEY (id)
);
