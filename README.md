# Spring-MVC
It is a simple Spring MVC based Web Application.
Things done in this project are data transfer from UI to controller and vice versa.
Saving data into DB using hibernatetemplate the data which is coming from UI
Spring 4.3.6
Tomcat 8.5
Hibernate5
MYsql
Mysql tables used for this project:
Run below script in Mysql workbench before running this application.
CREATE DATABASE mydb;
use mydb;

CREATE TABLE Registration(
    id INT NOT NULL AUTO_INCREMENT,
   firstName VARCHAR(100) NOT NULL,
   lastName VARCHAR(40) NOT NULL,
    email VARCHAR(40) NOT NULL,
    
    password VARCHAR(40) NOT NULL,
    PRIMARY KEY (id)
    );


