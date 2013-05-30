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
  city VARCHAR(40),
  neighborhood VARCHAR (40),
  street VARCHAR(40),
  phone VARCHAR(15),
  mail VARCHAR (40),
  web_site VARCHAR (40)
);

DROP TABLE IF EXISTS owners;
CREATE TABLE owners(
  id  int(11) NOT NULL  auto_increment PRIMARY KEY,
  first_name VARCHAR(60),
  last_name VARCHAR(30),
  city VARCHAR(40),
  neighborhood VARCHAR(40),
  street VARCHAR(40),
  email VARCHAR(40)
);

DROP TABLE IF EXISTS estates_owners;
CREATE TABLE estates_owners(
  id  int(11) NOT NULL  auto_increment PRIMARY KEY,
  estate_id int(11) NOT NULL,
  owner_id int(11) NOT NULL
);

DROP TABLE IF EXISTS buildings;
CREATE TABLE buildings(
id int(11) NOT NULL auto_increment PRIMARY KEY,
type VARCHAR(15),
city VARCHAR(40),
neighborhood VARCHAR (40),
street VARCHAR(40),
price float(50),
description VARCHAR (200),
sale VARCHAR (3),
rental VARCHAR(3),
owner_id int(11)
);
