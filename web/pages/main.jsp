<%@ page import="AnimePage.Anime" %>
<%@ page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="../WEB-INF/jspf/left_menu.jspf"%>



<div class="book_list">
    <h3>All Anime</h3>
    <table cellpadding="30" style="font-size: 12px;">

        <jsp:useBean id="animeList" class="AnimePage.AnimeList" scope="page"/>

        <% ArrayList<Anime> list = animeList.getAllAnime();
            session.setAttribute("currentAnimeList", list);
            for (Anime anime : list) {
        %>
        <tr>
            <td style="width:400px;height: 100px;">
                <p style="color:#378de5 ;font-weight: bold; font-size: 15px;"> <%=anime.getName()%></p>
                <br><strong>Год выхода :</strong> <%=anime.getData()%>
                <br><strong>Жанр :</strong> <%=anime.getGenre()%>
                <br><strong>Студия :</strong> <%=anime.getStudio()%>
                <br><strong>Позиция :</strong> <%=anime.getPosition()%>
                <br><strong>Средний рейтинг :</strong> <%=anime.getRating()%>
                <br><strong>Количество серий :</strong> <%=anime.getSeries()%>
                <p style="margin:10px;"> <a href="#">Краткое описание</a></p>
            </td>
            <td style="width:250px;height: 200px;">
                <img src="<%=request.getContextPath()%>/PictureReader?index=<%=list.indexOf(anime) %>" height="250" width="200" alt="Обложка"/>
            </td>
        </tr>
        <%}%>


    </table>
</div>