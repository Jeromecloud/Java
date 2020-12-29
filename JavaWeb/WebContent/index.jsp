<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<style>
	*{
		padding:0;
		margin:0;
		font-family:"微软雅黑";
	}
	/*  导航栏 */
	.header{
		height:60px;
		background:#458fce;
	}
	.header .logo{
		color:#fff;
		display:inline-block;
		line-height:60px;
		font-size:30px;
		font-weight:400;
		width:300px;
		vertical-align: top;
		text-align:center;
	}
	ul{
		display:inline-block;
	}
	.header ul li{
		list-style:none;
		float:left;
		margin-left:10px;
		width: 100px ;
    	line-height:60px;
    	display:inline-block;
    	text-align: center ;
    	cursor: pointer ;
    	color:#fff;
    	font-size:20px;
	}
	.header ul li.first{
		margin-left:50px;
	}
	.header ul li:hover{
		background:#74b0e2;
	}
	a{
		color:#fff;
		text-decoration:none;
	}
	.login{
		display:inline-block;
		line-height:60px;
		vertical-align: top;
		float:right;
		margin-right:20px;
		color:#fff;
	}
	/*  banner */
	.banner {
	    height: 380px ;
	    overflow: hidden ;
	    background: #ccc;
	}
</style>
</head>
<body>
	<div class="header">
		<div class="logo">铅尘可喜</div>
		<ul>
			<li class="first"><a href="javascript:void(0)">首页</a></li>
			<li><a href="javascript:void(0)">故事</a></li>
			<li><a href="javascript:void(0)">专题</a></li>
			<li><a href="javascript:void(0)">某年某月</a></li>
			<li><a href="javascript:void(0)">联系</a></li>
		</ul>
		<div class="login">
    		<span><a href="javascript:void(0)">登陆</a></span>  
		    <span>|</span> 
		    <span><a href="javascript:void(0)">注册</a></span></div>
		</div>
	<div class="banner">
		
	</div>
	<%-- <%	out.println("Hello JSP"); %> --%>
</body>
</html>