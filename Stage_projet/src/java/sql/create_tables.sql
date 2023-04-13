/* 
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
* Author:  phili
* Created: 12-Mar-2023
*/
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;

CREATE SCHEMA IF NOT EXISTS `stagedb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `stagedb`;

-- Create the "etudiant" table
CREATE TABLE IF NOT EXISTS etudiant (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  statusStage BOOLEAN,
  numeroStage INT,
  retenir BOOLEAN,
  password VARCHAR(50) NOT NULL
);

-- Create the "administration" table
CREATE TABLE IF NOT EXISTS administration (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  username VARCHAR(100) NOT NULL,
  password VARCHAR(50) NOT NULL
);

-- Create the "entreprise" table
CREATE TABLE IF NOT EXISTS entreprise (
  idInc INT AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  address VARCHAR(100),
  telephone VARCHAR(20),
  email VARCHAR(100) NOT NULL,
  password VARCHAR(50) NOT NULL
);

-- Create the "professeur" table
CREATE TABLE IF NOT EXISTS professeur (
  idProf INT AUTO_INCREMENT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(50) NOT NULL
);

-- Create the "emploi" table
CREATE TABLE IF NOT EXISTS emploi (
  id INT PRIMARY KEY,
  titre VARCHAR(100) NOT NULL,
  description TEXT,
  idInc INT,
  date_debut DATE,
  date_fin DATE,
  salaire VARCHAR(50),
  CONSTRAINT emploi_ibfk_1
	FOREIGN KEY (idInc) REFERENCES entreprise(idInc)
	ON DELETE CASCADE
	ON UPDATE CASCADE
) ENGINE=InnoDB;

INSERT INTO `stagedb`.`administration`(nom, prenom, email, username, password) VALUES
('DESJARDINS', 'PIERRE', 'pierre.desjardins@gmail.com', 'Pdesjardins', 'pass123');

-- Insert some sample rows into the "emploi" table
INSERT INTO `stagedb`.`emploi`(id,titre, description, idInc, date_debut, date_fin, salaire) VALUES
(1,'Developper','Developper des site web et Application',2001, '2023-06-01', '2024-01-31','40000.00-90000.00'),
(2,'Analyste','Verifier le fonctionnement des site web et Application',2002, '2023-05-01', '2023-12-31','50000.00-90000.00'),
(3,'Chef','Occuper des taches du groupe et faire le plan du projet',2003, '2023-09-01', '2024-03-15','30000.00-80000.00');

INSERT INTO `stagedb`.`entreprise`(idInc, nom, address, telephone, email, password) VALUES
(2001, 'EA', '123 Main St, Anytown, USA', '123456789','ea@gmial.com', 'ea123'),
(2002, 'Instagram', '456 Elm St, Anytown, USA', '987654321','insta@gmail.com', 'insta123'),
(2003, 'Snapchat', '789 Oak St, Anytown, USA', '555-9012','snap@gmail.com','snap123');