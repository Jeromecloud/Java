<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <%String path = request.getContextPath();%>
    <form action="TestServlet" method="GET">
        网址名：<input type="text" name="name">
        <br />
        网址：<input type="text" name="url" />
        <input type="submit" value="提交" />
    </form>
    <a href="WEB-INF/jsp/city_region/city.jsp">城市</a>
    <% out.println("your IP address is " + request.getRemoteAddr());%>
</body>
</html>