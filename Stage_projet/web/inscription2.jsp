<%-- 
    Document   : connexion2
    Created on : Mar 11, 2023, 7:27:59 PM
    Author     : alikh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/inscriptionCSS.css" rel="stylesheet" type="text/css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
    </head>
    <body class="couleur">
        <div class="formulaire">
            <div class="contenu">
                <img height="35"  width="90" src="images/logo.PNG"/>
                <h1 class="h1">PRESQUE LÀ!<h1>
                    <p>Maintenant, donnez votre email et mot de passe</p>
                <form method="post" id="inscription2" action="inscription3.jsp">    
                    <input placeholder="Adresse E-mail" type="text" class="form-control" id="email" for="email"  name="email">
                    <input placeholder="Mot de passe" type="password" class="form-control" id="pwd" for="pwd"  name="pwd">
                    <input placeholder="À nouveau" type="password" class="form-control" id="pw2" for="pw2"  name="pw2">
                    <div class="navigation">
                        <br>
                        <a hRef="inscription.jsp" class="bouton">Revenir</a>
                        <br>
                        <input class="bouton" type="submit" name="next" value="Suivant">
                    </div>
                </form>
                <script src="js/formulaire2.js"></script>
            </div>
        </div> 
    </body>
</html>
