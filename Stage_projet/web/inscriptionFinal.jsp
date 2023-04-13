<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscription</title>
        <link href="css/inscriptionCSS.css" rel="stylesheet" type="text/css" />
        <script src="http://code.jquery.com/jquery-1.12.0.min.js"></script>
        <script src="http://cdn.jsdelivr.net/jquery.validation/1.14.0/jquery.validate.min.js"></script>

    </head>
    <body class="couleur">
        <div class="formulaire">
            <div class="contenu">
                <a href= "index.jsp"><img height="60"  width="80" src="images/logo.PNG"/></a>
                <h1 class="h1">BIENVENUE</h1>
                <p>Entrez les informations suivantes :</p>
                <form method="POST" id="inscription" onsubmit="return checkPasswordMatch()" action="InscriptionController">
                    <div class="inputInscription">
                        <div>
                            <select name="selection" onchange="toggleLabels(this.value)">
                                <option value="0">Choisissez une option</option>
                                <option value="1">Étudiant</option>
                                <option value="2">Professeur</option>
                                <option value="3">Entreprise</option>
                            </select>
                            <br><br>
                            <label class="col-sm-4 control-label" id="prenom" style="display: none;">
                                <input placeholder="Prénom ou Nom entreprise" type="text" class="form-control" id="prenom" for="prenom" name="prenom" required>
                            </label>
                            <label class="col-sm-4 control-label" id="nom" style="display: none;">
                                <input placeholder="Nom" type="text" class="form-control" id="nom" for="nom" name="nom" required>
                            </label>
                            <label class="col-sm-4 control-label" id="telephone" style="display: none;">
                                <input placeholder="Telephone" type="tel" class="form-control" id="telephone" for="telephone" name="telephone" required>
                            </label>
                            <label class="col-sm-4 control-label" id="adresse" style="display: none">
                                <input placeholder="Adresse" type="text" class="form-control" id="adresse" for="adresse" name="adresse" required>
                            </label>

                        </div>
                        <div>
                            <input placeholder="Email" type="email" class="form-control" id="email" for="email" name="email" required>
                        </div>
                        <div>
                            <input placeholder="Mot de passe (4 caracteres min)" type="password" class="form-control" id="password" minlength="6" for="pwd" name="password" required>
                            <input placeholder="Confirmer mot de passe" type="password" id="confirm_password" required>
                        </div>
                    </div>
                    <br>
                    <input type="checkbox" name="condition" value="Agree">
                    <a class="condition" href="https://www.canada.ca/en/transparency/terms.html">J'accepte les conditions de services</a>
                    <br>
                    <input class="bouton" type="submit" name="next" value="Suivant">
                    <br>
                    <p>Déjà inscrit ?</p>
                    <a href="connexion.jsp">Connectez-vous</a> 

                </form>

                <script src="js/formulaire3.js"></script>

            </div>
        </div> 
    </body>
</html>
