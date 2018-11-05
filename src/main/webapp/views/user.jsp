<%--
  Created by IntelliJ IDEA.
  User: Alex
  Date: 05/11/2018
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
    <h1>Hello from user</h1>

    <%--Java code gets inserted--%>
<%
    String userName = (String)request.getAttribute("userName");
    out.println("<h1>Hello " + userName + "</h1>");
%>
</body>
</html>
