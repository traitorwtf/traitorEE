<%@ page import="AnimePage.Anime" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="../WEB-INF/jspf/left_menu.jspf"%>

<ul class="content">
    <% String genreID = null;
    try {
       genreID = request.getParameter("genre_id");
    }catch (Exception e){
        e.printStackTrace();
    }
    %>

    <h1>code is here</h1>
    <jsp:useBean id="animeList" class="AnimePage.AnimeList" scope="page"/>
    <%
        for (Anime anime : animeList.getAnimeByGenre(genreID)) {
    %>
    <li><%=anime.toString()%></li>
    <%}%>
</ul>

