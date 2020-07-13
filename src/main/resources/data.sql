DROP TABLE IF EXISTS products;


CREATE TABLE products (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    type VARCHAR(250) NOT NULL,
    price DOUBLE NOT NULL,
    store_address VARCHAR(250) DEFAULT NULL,
    properties VARCHAR(250) DEFAULT NULL
);

INSERT INTO products (type, properties, price, store_address) VALUES
    ('phone','color:grön',277.00,'Blake gränden, Karlskrona'),
    ('subscription','gb_limit:50',415.00,'Odell gatan, Stockholm'),
    ('subscription','gb_limit:10', 202.00,'Fausto vägen, Karlskrona');