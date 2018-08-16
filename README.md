# Spring boot app to call stored procedure 

1. Run below sql script in Mysql work bench

 create database test;
 use test;
 CREATE TABLE employee (
    emp_id int NOT NULL AUTO_INCREMENT,
    full_name varchar(255) NOT NULL,
    email varchar(255),
    address varchar(255),
    PRIMARY KEY (emp_id)
);

INSERT INTO employee (full_name,email,address)
VALUES ('Narayana B','nary@gmail.com','hyderbad');

INSERT INTO employee (full_name,email,address)
VALUES ('Naveen B','naveen@gmail.com','Bangalore');

 DELIMITER //
 CREATE PROCEDURE getAllEmployees()
   BEGIN
   SELECT *  FROM employee;
   END //
 DELIMITER ;
 
 
 2. Now run take this app into eclipse and run "mvn clean install "
 3. Run SpringBootSpApplication.java file . You will see full names printed in the console.
 
 
Happy coding !! 

Narayana Bojja 
