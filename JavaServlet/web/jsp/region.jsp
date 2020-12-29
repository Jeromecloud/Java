<%--
  Created by IntelliJ IDEA.
  User: jeromecloud
  Date: 20.12.24
  Time: 15:39
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/jsp/navigation.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>城市区域管理</title>
</head>
<body>
<form action="/Region/add" method="post">
    新增城市：<input type="text" name="name">
    <input type="submit" value="提交"><br>
</form>
    <table>
        <thead>
            <tr>
                <th>城市</th>
            </tr>
        </thead>
        <c:forEach items="${list}" var="item">
            <td>${item.name}</td>
            <button value="修改"></button>
        </c:forEach>
    </table>
</body>
</html>
