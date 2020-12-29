<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<% String name = request.getSession().getAttribute("user").toString();%>

<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/index.css">
</head>
<body>
    <%--头部--%>
    <div class="header">
        <div class="logo">租房系统</div>
        <div class="login">
            <%--    <span><a href="/jsp/login.jsp">登陆</a></span>--%>
            <span>欢迎：<%=name %></span>
            <span>|</span>
            <%--    <span><a href="/jsp/register.jsp">注册</a></span>--%>
            <span><a href="">注销</a></span>
        </div>
    </div>
<%--导航栏--%>
<div class="navigation">
    <ul>
        <li class="first">
            <a href="javascript:void(0)">首页</a>
        </li>

        <li>
            <a href="/Region/query">城市区域管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>城市管理</li>--%>
            <%--        <li>区域管理</li>--%>
            <%--      </ul>--%>
        </li>

        <li>
            <a href="javascript:void(0)">房源管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>短租</li>--%>
            <%--        <li>合租</li>--%>
            <%--        <li>整租</li>--%>
            <%--        <li>公寓</li>--%>
            <%--        <li>写字楼</li>--%>
            <%--      </ul>--%>
        </li>

        <li>
            <a href="javascript:void(0)">看房预约管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--      </ul>--%>
        </li>

        <li>
            <a href="javascript:void(0)">委托管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--      </ul>--%>
        </li>

        <li>
            <a href="javascript:void(0)">配置管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--      </ul>--%>
        </li>
        <li>
            <a href="javascript:void(0)">权限管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--      </ul>--%>
        </li>
        <li>
            <a href="javascript:void(0)">角色管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--      </ul>--%>
        </li>
        <li>
            <a href="javascript:void(0)">后台用户管理</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--      </ul>--%>
        </li>
        <li>
            <a href="javascript:void(0)">操作日志</a>
            <%--      <ul class="second-navigation">--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--        <li>二级菜单</li>--%>
            <%--      </ul>--%>
        </li>
    </ul>
</div>
</body>
</html>
