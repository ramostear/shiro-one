<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>shiro-login</title>
</head>
<body>
	<p style="margin: 100px 0 0 50px;font-family: inherit;font-size: 16px;color: gray;">shiro-login  <font style="color: red;">${error}</font><br></p>
	<hr>
	<form action="" method="post" style="background-color: gray;font-size: 18px;color:#fff;width: 300px;margin:10px auto;padding:5px;border-radius:5px">
		username:<input type="text" name="username" style="margin: 10px 0"> 
		password:<input type="password" name="password" style="margin: 10px 0"><br>
		<input type="submit" value="login">
	</form>
	<hr>
</body>
</html>