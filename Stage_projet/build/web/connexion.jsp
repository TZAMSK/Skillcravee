
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="css/connexionCSS.css" rel="stylesheet" type="text/css" />
    <title>Connexion</title>
</head>
<body class="couleur">
    <div class="formulaire">
        <div class="contenu">
            <a href= "index.jsp"><img src="images/logo.PNG"/></a>
            <form method="POST" action="#">
            <h1 class="h1">CONTENT DE VOUS REVOIR!<h1>
                <p>Mettez vos identifiants pour continuer</p>
                <input placeholder="Username" type="text" class="form-control" id="email"  name="username">
                <input placeholder="Password" type="password" class="form-control" id="password"  name="password">
                <input type="submit" id="submit" name="submit" value="LOGIN" class="btn-login"/>
            <br>
            <p>Pas de compte?</p>
            <a href="inscriptionFinal.jsp">Créer une!</a>
        </div>
    </div> 
            </form>
</body>
</html>
