<%@ page import="Anime.GenreList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Аниме база</title>
        <link href="../css/style_main.css" rel="stylesheet" type="text/css">
    </head>
    <body>

        <div class="container">


            <div class="header">
                <img src="../images/H8F81.jpeg" alt="Место для логотипа" width="100%" height="90"/>

                <form class="search_form" name="search_form" method="POST">
                    <img src="../images/search.jpg"/> 
                    <input type="text" name="search_String" value="" size="100" />
                    <input type="submit" value="Поиск" name="search_button" />
                    <select name="search_option">
                        <option>Название</option>
                        <option>Жанр</option>
                    </select>
                </form>
            </div>




            <div class="sidebar1">
                <h4>Список жанров:</h4>
                <ul class="nav">
                <% GenreList genreList = new GenreList();
                    for (String genre : genreList.getGenre()) {
                %>
                    <li><a href="4"> <%=genre%> </a></li>
                    <%}%>
                </ul>
                <p>&nbsp;</p>
            </div>




            <div class="content">
                <h1>&nbsp;</h1>
                <p>&nbsp;</p>
            </div>


                    
        </div><!-- end .container -->
                
    </body>
</body>

</body>
</html>
