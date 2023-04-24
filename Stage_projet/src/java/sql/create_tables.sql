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


INSERT INTO `stagedb`.`professeur`(idProf , nom, prenom, email, password) VALUES
(1, 'emile', 'lerouge', 'emile@gmail.com','pass123'),
(2, 'Doe', 'John', 'johndoe1@example.com','password123'),
(3, 'Smith', 'Jane', 'janesmith2@example.com', 'password456'),
(4, 'Johnson', 'Michael', 'michaeljohnson3@example.com', 'password789'),
(5, 'Lee', 'Anna', 'annalee4@example.com','password111'),
(6, 'Kim', 'David', 'davidkim5@example.com', 'password222'),
(7, 'Garcia', 'Maria', 'mariagarcia6@example.com', 'password333'),
(8, 'Brown', 'William', 'williambrown7@example.com', 'password444'),
(9, 'Martinez', 'Jose', 'josemartinez8@example.com', 'password555'),
(10, 'Miller', 'Jessica', 'jessicamiller9@example.com', 'password666'),
('Davis', 'Kevin', 'kevindavis10@example.com', 'password777');

INSERT INTO `stagedb`.`administration`(nom, prenom, email, username, password) VALUES
('DESJARDINS', 'PIERRE', 'pierre.desjardins@gmail.com', 'Pdesjardins', 'pass123'),
('Smith', 'John', 'john.smith@example.com', 'jsmith', 'password123'),
('Doe', 'Jane', 'jane.doe@example.com', 'jdoe', 'password456'),
('Williams', 'Robert', 'robert.williams@example.com', 'rwilliams', 'password789');

-- Insert some sample rows into the "emploi" table
INSERT INTO `stagedb`.`emploi`(id,titre, description, idInc, date_debut, date_fin, salaire) VALUES
(1,'Developper','Developper des site web et Application',2001, '2023-06-01', '2024-01-31','40000.00-90000.00'),
(2,'Analyste','Verifier le fonctionnement des site web et Application',2002, '2023-05-01', '2023-12-31','50000.00-90000.00'),
(3,'Chef','Occuper des taches du groupe et faire le plan du projet',2003, '2023-09-01', '2024-03-15','30000.00-80000.00'),
(4, 'Coordonnateur des ressources humaines', "Aide à l'embauche et aux relations avec les employés", 2003, '2023-06-15', '2023-12-15', '55000'),
(5, 'Représentant du service à la clientèle', 'Fournir une assistance aux clients par téléphone et par e-mail', 2005, '2023-05-01', '2023-11-01', '40000-60000'),
(6, 'Chef de projet', 'Gérer et superviser des projets de la conception à la réalisation', 2003, '2023-07-01', '2023-12-31', '65000'),
(7, 'Associé aux ventes', 'Vendre des produits et services aux clients', 2001, '2023-05-15', '2023-11-15', '35000-50000'),
(9, 'Comptable', 'Gérer les dossiers financiers et les transactions', 2003, '2023-06-15', '2023-12-15', '50000'),
(10, 'Développeur web', 'Concevoir et développer des sites Web et des applications Web', 2001, '2023-05-01', '2023-10-31', '55000-90000');

INSERT INTO `stagedb`.`entreprise`(idInc, nom, address, telephone, email, password) VALUES
(2001, 'EA', '123 Main St, Anytown, USA', '123456789','ea@gmial.com', 'ea123'),
(2002, 'Instagram', '456 Elm St, Anytown, USA', '987654321','insta@gmail.com', 'insta123'),
(2003, 'Snapchat', '789 Oak St, Anytown, USA', '555-9012','snap@gmail.com','snap123'),
(2004,'ABC Corporation', '123 Main St, Anytown, USA', '555-1234', 'abc@example.com', 'password123'),
(2005, 'XYZ Enterprises', '456 Oak St, Anytown, USA', '555-5678', 'xyz@example.com', 'password456'),
(2006, 'Acme Industries', '789 Maple St, Anytown, USA', '555-9012', 'acme@example.com', 'password789');