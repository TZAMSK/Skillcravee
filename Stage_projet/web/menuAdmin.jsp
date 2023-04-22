
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/menuAdmin.css" rel="stylesheet" type="text/css" />
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
                                    href="emploi.jsp">Emploi
                                </a>
                            </li>

                            <li>
                                <a
                                    href="utilisateurController">Utilisateurs
                                </a>
                            </li>
                            <li>
                                <a
                                    href="inscriptionFinal.jsp">Inscription
                                </a>
                            </li>
                            <li>
                                <div class="dropdown">
                                    <button class="dropbtn">Connexion</button>
                                    <div class="dropdown-content">
                                        <a href="EtudiantLog.jsp">Etudiant</a>
                                        <a href="ProfLog.jsp"> Professeur</a> 
                                        <a href="EntrepriseLog.jsp">Entreprise</a>
                                        <a href="adminLog.jsp">Administration</a>                                        
                                    </div>
                                </div>
                            </li>
                             
                            <li> 
                                <div class ="language-switcher">
                                    <select id="language-select">
                                        <option value ="fr">Français</option>
                                        <option value ="en">English</option>
                                    </select> 
                                    <script>
                                        const languageSwitcher = document.getElementById('language-select')
                                        languageSwitcher.addEventListener('change', function(){
                                            const selectedLanguage = languageSwitcher.value;
                                            window.location.href = '/' + selectedLanguage + '/';
                                        });
                                        </script>
                                </div>
                                
                             <% if( session.getAttribute("nom")!=null) { %>
                               <li>
                                <a
                                    href="deconnexionController">Quitter
                                </a>
                            </li>
                            <%}%>
                        </ul>

                    </nav>

                </div>
            </div>
        </header>
    </body>
</html>
