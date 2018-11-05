<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  dto.User: Ryan Alexander
  Date: 05/11/2018
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dto.User</title>
</head>
<body>
    <h1>Hello from user</h1>

    <%--Java code gets inserted--%>
<%
    List<String> names = (List<String>) request.getAttribute("names");
    for (String name: names) {
        out.println("<h1>Hello " + name + "</h1>");
    }
%>
</body>
</html>
