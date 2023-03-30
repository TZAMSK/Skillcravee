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
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `stagedb` DEFAULT CHARACTER SET utf8mb4;
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
FOREIGN KEY (entreprise_id) REFERENCES entreprise(id),
FOREIGN KEY (professeur_id) REFERENCES professeur(id)
);

INSERT INTO stagedb.admin(id,nom,prenom,email,username,password) VALUES
(1,'DESJARDINS','PIERRE','pierre.desjardins@gmail.com', 'admin','pass123')