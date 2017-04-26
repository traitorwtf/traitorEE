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
<h1> <%= HelloClass.sayHello("traitor")%></h1>
<h3>Hello Java Web!</h3>
<p style="color: cadetblue"> New registered account is: <%= request.getParameter("firstName")%>
    <%= request.getParameter("lastName")%></p>
<p style="color: coral"> Alternative way: ${param.get("firstName")}  ${param.get("lastName")}</p>

<p style="color: cadetblue"> Country: <%= request.getParameter("countryList")%></p>
<p style="color: cadetblue"> Sex: <%= request.getParameter("sex")%></p>
<%! String getLanguages(String[] langs){
    String result = "";
    for (String x: langs) {
        result+= "<li style='color: cadetblue'> "+ x+ " ";
    }
    return result;
}%>
<p style="color: cadetblue"> Languages: <%= getLanguages(request.getParameterValues("language"))%></p>
<br><br>
<h1>DB check</h1>
<h3> <%= HelloClass.check() %>  </h3>
</body>
</html>
