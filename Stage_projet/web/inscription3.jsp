
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
                <h1 class="h1">À QUELQUES PAS DU BOUT!<h1>
                    <p>Finissons en donant votre email et mot de passe</p>
                <form method="post" id="inscription3" action="">    
                    <select>
                        <option>Étudiant</option>
                        <option>Professeur</option>
                        <option>Entreprise</option>
                    </select>
                      <label id=da style='display: none;'>
                        <p>DA</p>
                        <input type=text>
                      </label>
                    
                      <label id=statusStage style='display: none;'>
                        <p>Status de votre stage</p>
                        <input type=text>
                      </label>
                    
                      <br>

                      <label id=retention style='display: none;'>
                        <p>Retention</p>
                        <input type=text>
                      </label>
                    
                      <label id=numeroStage style='display: none;'>
                        <p>Numero de votre stage</p>
                        <input type=text>
                      </label>

                      <label id=idProf style='display: none;'>
                        <p>Votre id</p>
                        <input type=text>
                      </label>
                    
                      <label id=telephone style='display: none;'>
                        <p>Téléphone</p>
                        <input type=text>
                      </label>
                    
                      <label id=contacte style='display: none;'>
                        <p>Contacte</p>
                        <input type=text>
                      </label>
                   
                    <div class="navigation">
                        <br>
                        <a hRef="inscription2.jsp" class="bouton">Revenir</a>
                        <br>
                        <input class="bouton" type="submit" name="next" value="Suivant">
                    </div>
                </form>
                <script src="js/formulaire3.js"></script>    
            </div>
        </div> 
    </body>
</html>
