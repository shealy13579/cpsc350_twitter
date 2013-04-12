

DROP DATABASE IF EXISTS spytter;
CREATE DATABASE spytter;
USE spytter;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
   id int NOT NULL AUTO_INCREMENT,
  first_name varchar(25),
  last_name varchar(25),
  ranking varchar(25),
  description varchar(300),
  PRIMARY KEY  (id)
);

DROP TABLE IF EXISTS tweets;
CREATE TABLE tweets (
  id int NOT NULL AUTO_INCREMENT,
  user_id int,
  tweet varchar(120),
  PRIMARY KEY  (id),
  FOREIGN KEY (user_id) REFERENCES users (id)
);

DROP TABLE IF EXISTS followers;
CREATE TABLE followers (
  id int NOT NULL AUTO_INCREMENT,
  follower_ID int,
  following_ID int,
  PRIMARY KEY (id),
  FOREIGN KEY (follwer_ID) REFERENCES users (id),
  FOREIGN KEY (follwint_ID) REFERENCES users (id),

);

