/* 
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
/**
* Author:  phili
* Created: 12-Mar-2023
*/

 

CREATE SCHEMA IF NOT EXISTS `stagedb` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `stagedb` ;

 

-- Création de la table des étudiants
CREATE TABLE IF NOT EXISTS `stagedb`. etudiant (
  id INT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  statusStage BOOLEAN,
  numeroStage INT,
  retenir BOOLEAN,
  password VARCHAR(50) NOT NULL
);

 

-- Création de la table de l'administration
CREATE TABLE administration (
  id INT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  username VARCHAR(100) NOT NULL,
  password VARCHAR(50) NOT NULL
);

 

-- Création de la table des entreprises
CREATE TABLE entreprise (
  id INT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  adresse VARCHAR(100),
  telephone VARCHAR(20),
  email VARCHAR(100) NOT NULL,
  password VARCHAR(50) NOT NULL
);

 

-- Création de la table des professeurs
CREATE TABLE professeur (
  id INT PRIMARY KEY,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(50) NOT NULL
);

 

-- Création d'une table pour stocker les emplois
CREATE TABLE emploi (
  id INT PRIMARY KEY,
  titre VARCHAR(100) NOT NULL,
  description TEXT,
  entreprise_id INT,
  professeur_id INT,
  date_debut DATE,
  date_fin DATE,
  salaire DECIMAL(10, 2),
  //FOREIGN KEY (entreprise_id) REFERENCES entreprise(id),
  //FOREIGN KEY (professeur_id) REFERENCES professeur(id)
);

 

 

INSERT INTO stagedb.admin(prenom, nom,email,password) VALUES
('PIERRE', 'DESJARDINS', 'pierre.desjardins@gmail.com', 'pass123')