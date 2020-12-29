<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" type="text/css" >
</head>
<body >
    <%--登录框 外框--%>
    <div id="login-outerbox">
        <%--登录框内部--%>
        <div id="login-innerbox">
            <h1>用户登录</h1>
            <form action="/LoginServlet"  method="post" >
                用户名：<input type="text" name="user"value=""><br><br>
                密码：  <input type="password" name="password"value=""><br><br>
                <input type="submit"value="登录"name="login">
                <input type="button" name="register" value="注册" onclick="window.open('/jsp/register.jsp')">
            </form>
        </div>
    </div>

</body>
</html>