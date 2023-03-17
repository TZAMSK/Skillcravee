
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/menuCSS.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <header style="background: white">
            <div class='tete'>
                <div class="banniere">
                    <table>
                        <tr>
                            <th><a href="index.jsp"><img id="logo" src="images/logo.PNG" alt="logo" /></a></th>
                            <th><h1 id="titre">Skillcravee</h1></th>
                        </tr>
                    </table>
                </div>
                <div id='droite'>
                    <nav>
                        <ul id='liste'>
                            <li class="active"><a href="index.jsp">Accueil</a></li>


                            <li>
                                <a
                                    href="connexion.jsp">Téléchargez CV
                                </a>
                            </li>

                            <li>
                                <a
                                    href="utilisateurController">Utilisateurs
                                </a>
                            </li>
                            <li>
                                <a
                                    href="inscription.jsp">Inscription
                                </a>
                            </li>
                            <li>
                                <a
                                    href="connexion.jsp">Connexion
                                </a>
                            </li>

                             <% if( session.getAttribute("nom")!=null) { %>
                               <li>
                                <a
                                    href="deconnexionController">Quitter
                                </a>
                            </li>
                            <%}%>

                            <li>
                                <a
                                    href="administrationConcontroller">Administration
                                </a>
                            </li>

                        </ul>

                    </nav>

                </div>
            </div>
        </header>
    </body>
</html>
