<%--
  Created by IntelliJ IDEA.
  User: traitorwtf
  Date: 19.04.2017
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="something.HelloClass" %>
<html>
  <head>
    <title>traitor's page!</title>
  </head>
  <body>

  <h3>Registration form</h3>

  <br/>

  <form action="testEE.jsp" style="border: 5px solid grey; padding: 10px; width: 200px; ">
    First name <br>
    <input type="text" name="firstName"> <br>
    Last name <br>
    <input type="text" name="lastName"> <br><br>
    <select name="countryList">
      <option>Russia</option>
      <option>North Korea</option>
      <option>Japan</option>
      <option>South Korea</option>
    </select> <br><br>
    <input type="radio" name="sex" value="male">Male </input>
    <input type="radio" name="sex" value="female">Female</input>
    <br><br>
    Choose languages: <br>
    <input type="checkbox" name="language" value="Ru">Ru</input>
    <input type="checkbox" name="language" value="En">En</input>
    <input type="checkbox" name="language" value="Jp">Jp</input>
    <br><br>
    <input type="submit" name="Register">
  </form>

  <a href="/traitorsServlet"> Move to a servlet</a>

  </body>
</html>
