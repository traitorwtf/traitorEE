<%@ page import="something.HelloClass" %><%--
  Created by IntelliJ IDEA.
  User: traitorwtf
  Date: 20.04.2017
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>traitor's page 2</title>
</head>
<body>
<jsp:include page="Header.html" />
<br>
<br>
<h3>Hello Java Web!</h3>
<h1> <%= HelloClass.sayHello("traitor")%></h1>
<br/>
<p style="color: cadetblue"> New registered account is: <%= request.getParameter("firstName")%>
    <%= request.getParameter("lastName")%></p>
</body>
</html>
