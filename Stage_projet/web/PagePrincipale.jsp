<%-- 
    Document   : PagePrincipale
    Created on : 22-Apr-2023, 2:10:59 PM
    Author     : phili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="css/style.css">
        <title>Accueil</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"/>
        <%@include file="accueil.jsp"%>
        <jsp:include page="pied.jsp"/>
    </body>
</html>

