DROP TABLE IF EXISTS users;
CREATE TABLE users(
  id  int(11) NOT NULL  auto_increment PRIMARY KEY,
  email VARCHAR(60),
  first_name VARCHAR(56),
  last_name VARCHAR(56)
);

DROP TABLE IF EXISTS estates;
CREATE TABLE estates(
  id  int(11) NOT NULL  auto_increment PRIMARY KEY,
  name VARCHAR(60),
  dir VARCHAR(60),
  phone VARCHAR(15),
  mail VARCHAR (40),
  web_site VARCHAR (40)
);

DROP TABLE IF EXISTS owners;
CREATE TABLE owners(
  id  int(11) NOT NULL  auto_increment PRIMARY KEY,
  name VARCHAR(60),
  dir VARCHAR(60),
  email VARCHAR(40)
);