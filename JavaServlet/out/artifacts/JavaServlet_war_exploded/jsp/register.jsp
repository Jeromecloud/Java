<%--
  Created by IntelliJ IDEA.
  User: 周胖胖
  Date: 20.12.21
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户页面</title>
</head>
<body>
<form action = "/RegisterServlet" method = "POST">
    用户名:<input type = "text" name = "user"><br>
    密码:<input type = "password" name = "password"><br>
    <input type = "submit" value = "注册">
</form>
</body>
</html>
