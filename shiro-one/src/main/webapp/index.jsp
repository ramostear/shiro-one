<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
 #top{
 text-align: right;
 
 }
 a{
  text-decoration: none;
  color:white;
  background-color: purple; 
  border-radius:3px;
  padding:2px;
 }
</style>
</head>
<body>
<div id="top">
	<shiro:user>
		欢迎你：<shiro:principal></shiro:principal> 
	</shiro:user>
	<shiro:guest>你还没有登录,请<a href="/shiro/login">登录</a></shiro:guest>
	<shiro:user><a href="/shiro/logout">退出</a></shiro:user>
</div>
<hr>
<shiro:user>
<a href="/shiro/user/list.jsp">用户列表</a> | <a href="/shiro/user/add.jsp">添加用户</a> | <a href="/shiro/admin">系统管理</a>
</shiro:user>
</body>
</html>