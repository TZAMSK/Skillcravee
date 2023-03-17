
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscription</title>
        <link href="css/inscriptionCSS.css" rel="stylesheet" type="text/css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.3/dist/jquery.validate.min.js"></script>
    </head>
    <body class="couleur">
        <div class="formulaire">
            <div class="contenu">
                <a href= "index.jsp"><img height="60"  width="80" src="images/logo.PNG"/></a>
                <h1 class="h1">BIENVENUE<h1>
                    <p>Entrez votre nom d'utilisateur, prénom et nom d'utilisateur</p>
                    <form method="post" id="inscription" action="inscription2.jsp">
                        <input placeholder="Prénom" type="text" class="form-control" id="prenom" for="prenom" name="prenom">
                        <input placeholder="Nom" type="text" class="form-control" id="nom" for="nom" name="nom">
                        <input placeholder="Email" type="text" class="form-control" id="email" for="email" name="email">
                        <input placeholder="Username" type="text" class="form-control" id="username" for="username" name="username">

                        <br>
                        <input type="checkbox" name="condition" value="Agree">
                        <a class="condition" href="https://www.canada.ca/en/transparency/terms.html">J'accepte les conditions de services</a>
                        <br>
                        <input class="bouton" type="submit" name="next" value="Suivant">
                        <br>
                        <p>Déjà inscrit ?</p>
                        <a href="connexion.jsp">Connectez-vous</a> 

                    </form>

                    <script src="js/formulaire.js"></script>



            </div>
        </div> 
    </body>
</html>
