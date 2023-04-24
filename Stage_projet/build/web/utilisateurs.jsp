<%@page import="com.stage.model.entities.Prof"%>
<%@page import="com.stage.model.entities.Etudiant"%>
<%@page import="com.stage.model.entities.Entreprise"%>
<%@page import="com.stage.model.entities.Administrateur"%>

<%@page import="java.util.ArrayList"%>
<%  
    ArrayList<Administrateur> listeAdministrateurs = (ArrayList)request.getAttribute("listeAdministrateurs");
    Administrateur  administrateur = (Administrateur)request.getAttribute("administrateur");

    ArrayList<Entreprise> listeEntreprises = (ArrayList)request.getAttribute("listeEntreprises");
    Entreprise  entreprise = (Entreprise)request.getAttribute("entreprise");

    ArrayList<Etudiant> listeEtudiants = (ArrayList)request.getAttribute("listeEtudiants");
    Etudiant etudiant = (Etudiant)request.getAttribute("etudiant");

    ArrayList<Prof> listeProfs = (ArrayList)request.getAttribute("listeProfs");
    Prof prof = (Prof)request.getAttribute("prof");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <title>Afficher utilisateur</title>
     
         <link rel="stylesheet" href="">
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <div>
            <div class="center">
                
                <h4>Chercher un utilisateur par nom</h4>
                <form action="utilisateurController" method="get"> 
                    <input type="search" name="nom">
                    <input type="submit"  value="nom" />
                </form>
            </div>

            <div class="droite">
                <h4>Filter les utilisateurs par role</h4>
                <form action="utilisateurController" method="get">
                   <input type="radio" name="typeUtilisateur" value="Admin"/> <label>Administrateur </label> <br>
                  <input type="radio" name="typeUtilisateur" value="Entreprise"/> <label>Entreprise</label><br>
                  <input type="radio" name="typeUtilisateur" value="Etudiant"/> <label>Etudiant</label> <br><!-- comment -->
                  <input type="radio" name="typeUtilisateur" value="Prof"/> <label>Prof</label><br><!-- comment -->
                   <input type="submit"  value="roles" />
                </form>
            </div>
        </div>
         <h4>Liste des utilisateurs</h4>
         
    <h2>Liste des administrateurs</h2>
    <table style="width:79%">
        <tr>
           <th> Id </th>
           <th> Username </th>
           <th> Nom </th>
           <th> Prenom </th>
           <th> Email </th>
           <th> Password </th>
        </tr>
        <%if(administrateur!=null) {%>
        <tr>
           <td> <%=administrateur.getIdAdmin() %> </td>
           <td> <%=administrateur.getUsernameAdmin() %> </td>
           <td> <%=administrateur.getNomAdmin() %> </td>
           <td> <%=administrateur.getPrenomAdmin() %> </td>
           <td> <%=administrateur.getEmailAdmin() %> </td>
           <td> <%=administrateur.getPasswordAdmin() %> </td>
        </tr>
        <% }else { 
        for(Administrateur admin : listeAdministrateurs){%>
            <tr>
                <td> <%=admin.getIdAdmin() %> </td>
                <td> <%=admin.getUsernameAdmin() %> </td>
                <td> <%=admin.getNomAdmin() %> </td>
                <td> <%=admin.getPrenomAdmin() %> </td>
                <td> <%=admin.getEmailAdmin() %> </td>
                <td> <%=admin.getPasswordAdmin() %> </td>
            </tr>  
        <% } } %>
    </table>
    
    <h2>Liste des entreprises</h2>
    <table style="width:79%">
        <tr>
           <th> Id </th>
           <th> Nom </th>
           <th> Téléphone </th>
           <th> Adresse %> </th>
           <th> Email %> </th>
           <th> Password %> </th>
        </tr>
        <%if(entreprise!=null) {%>
        <tr>
           <td> <%=entreprise.getIDInc() %> </td>
           <td> <%=entreprise.getNomInc() %> </td>
           <td> <%=entreprise.getTelephone() %> </td>
           <td> <%=entreprise.getAdresse() %> </td>
           <td> <%=entreprise.getEmail() %> </td>
           <td> <%=entreprise.getPasswordInc() %> </td>
        </tr>
        <% }else { 
        for(Entreprise inc : listeEntreprises){%>
            <tr>
                <td> <%=inc.getIDInc() %> </td>
                <td> <%=inc.getNomInc() %> </td>
                <td> <%=inc.getTelephone() %> </td>
                <td> <%=inc.getAdresse() %> </td>
                <td> <%=inc.getEmail() %> </td>
                <td> <%=inc.getPasswordInc() %> </td>
            </tr>
        <% } } %>
    </table>
    
    <h2>Liste des étudiants</h2>
    <table style="width:79%">
        <tr>
           <th> Id </th>
           <th> Nom </th>
           <th> Prenom </th>
           <th> Email </th>
           <th> Password </th>
           <th> Statut stage </th>
           <th> Numero stage </th>
           <th> retention </th>
        </tr>
        <%if(etudiant!=null) {%>
        <tr>
           <td> <%=etudiant.getId() %> </td>
           <td> <%=etudiant.getNom() %> </td>
           <td> <%=etudiant.getPrenom() %> </td>
           <td> <%=etudiant.getEmail() %> </td>
           <td> <%=etudiant.getPassword() %> </td>
           <td> <%=etudiant.getStatusStage() %> </td>
           <td> <%=etudiant.getNumeroStage() %> </td>
           <td> <%=etudiant.getRetenir() %> </td>
        </tr>
        <% }else { 
        for(Etudiant etud : listeEtudiants){%>
            <tr>
                <td> <%=etud.getId() %> </td>
                <td> <%=etud.getNom() %> </td>
                <td> <%=etud.getPrenom() %> </td>
                <td> <%=etud.getEmail() %> </td>
                <td> <%=etud.getPassword() %> </td>
                <td> <%=etud.getStatusStage() %> </td>
                <td> <%=etud.getNumeroStage() %> </td>
                <td> <%=etud.getRetenir() %> </td>
            </tr>  
        <% } } %>
    </table>
    
    <h2>Liste des professeurs</h2>
    <table style="width:79%">
        <tr>
           <th> Id </th>
           <th> Nom </th>
           <th> Prenom </th>
           <th> Email </th>
           <th> Password </th>
        </tr>
        <%if(prof!=null) {%>
        <tr>
           <td> <%=etudiant.getId() %> </td>
           <td> <%=etudiant.getNom() %> </td>
           <td> <%=etudiant.getPrenom() %> </td>
           <td> <%=etudiant.getEmail() %> </td>
           <td> <%=etudiant.getPassword() %> </td>
        </tr>
        <% }else { 
        for(Etudiant etud : listeEtudiants){%>
            <tr>
                <td> <%=etud.getId() %> </td>
                <td> <%=etud.getNom() %> </td>
                <td> <%=etud.getPrenom() %> </td>
                <td> <%=etud.getEmail() %> </td>
                <td> <%=etud.getPassword() %> </td>
            </tr>  
        <% } } %>
    </table>
      <jsp:include page="pied.jsp"/>
    </body>
</html>
