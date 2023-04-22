<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
        

        
        </main>
    </body>
</html>
