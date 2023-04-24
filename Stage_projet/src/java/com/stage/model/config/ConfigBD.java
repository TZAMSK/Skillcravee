package com.stage.model.config;


public interface ConfigBD {
           //  Définir l’url de connexion avec le nom de la base donnée
	public final static String URL = "jdbc:mysql://localhost:3306/stagedb?zeroDateTimeBehavior=CONVERT_TO_NULL";
        //utilisateur de la bd
        public final static String USER ="root";
        //mot de passe de la bd
        public final static String PASSWORD ="#Tzamsk2003";
         // le driver mysql
        public final static String DRIVER="com.mysql.cj.jdbc.Driver";
}
