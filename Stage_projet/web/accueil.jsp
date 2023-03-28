
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
        <link href="css/accueilCSS.css" rel="stylesheet" type="text/css" />
    </head>
    <body id='accueil'>
         <main class="page_principal">
                  <% if( request.getAttribute("deconnexion")!=null) { %>
                      <center><b><font color=red> <%=request.getAttribute("deconnexion")  %></font><b></center>
               <%}%>
                 <% if( session.getAttribute("nom")!=null) { %>
        <marquee>    Bienvenues <span class="rouge">  <%=session.getAttribute("nom")  %>  <%=session.getAttribute("prenom")  %></span></marquee>
        <%} else{%>


        <%}%>
        
        <div class="bordure_recherche" class="centrer_recherche">
                <table>
                    <tr>
                        <td>
                            <input type="text" placeholder="Poste de travail" class="recherche">
                        </td>
                        <td style="flex:right">
                            <a href="FormulaireRecherche.php"><img src="images/loupe.png" alt="loupe"></a>
                        </td>
                    </tr>
                </table>
        </div>
        
        <!--<h5><a href="">PUBLIER VOTRE CV</a></h5>-->
        
        <div class="general">
            <div class="travail">
                <div class="nom">
                    <h6>Nom travail</h6>
                    <p>Id travail</p>
                </div>
                <p>Entreprise</p>
                <p>Type travail</p>
                <p>Type poste</p>
                <p>Salaire($)</p>
                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
                    Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit
                    amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
            </div>
            
            <div class="droite">
                <div>
                    <h6>Nom travail</h6>
                    <p>Id travail</p>
                </div>
                <p>Entreprise</p>
                <p>Type travail</p>
                <p>Type poste</p>
                <p>Salaire($)</p>
                <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. 
                    Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit
                    amet quam egestas semper. Aenean ultricies mi vitae est. Mauris placerat eleifend leo.</p>
            </div>
        </div>
        
        </main>
    </body>
</html>
