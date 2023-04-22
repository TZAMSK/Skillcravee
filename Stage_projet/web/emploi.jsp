<%-- 
    Document   : emploi
    Created on : 22-Apr-2023, 1:29:18 PM
    Author     : phili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/accueilCSS.css" rel="stylesheet" type="text/css" />
        <title>Types d'Emplois</title>
    </head>
    <body id='accueil'>
         <main class="page_principal">
             <div class="bordure_recherche" class="centrer_recherche">
                <table>
                    <tr>
                        <td>
                            <input type="text" placeholder="Poste de travail" class="recherche">
                        </td>
                        <td style="flex:right">
                            <a href=""><img src="images/loupe.png" alt="loupe"></a>
                        </td>
                    </tr>
                </table>
        </div>
        
        <!--<h5><a href="">PUBLIER VOTRE CV</a></h5>-->
        
        <div class="general">
            <div class="travail">
                <div class="nom">
                    <h6>Nom travail: </h6>
                    <p>Id travail: </p>
                </div>
                <p>Entreprise: </p>
                <p>Type travail: </p>
                <p>Type poste: </p>
                <p>Salaire($): </p>
                <p>Description: </p>
            </div>
            
            <div class="droite">
                <div class = "nom">
                    <h6>Nom travail</h6>
                    <p>Id travail</p>
                </div>
                <p>Entreprise: </p>
                <p>Type travail: </p>
                <p>Type poste: </p>
                <p>Salaire($): </p>
                <p>Description: </p>
            </div>
        </div>
        
        </main>
    </body>
</html>
