<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>登录页面</title>
		<link rel="stylesheet"  type="text/css"  href="add.css">
</head>
<body class="my" background = "2.jpg">
		<form action="loginServlet" method="get">
          账号:<input name="uname" value=""><br>
          <br>
          密码:<input name="pwd" value=""><br>
          <br>
          &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="登陆">
          &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="退出"><br>
   		</form>

</body>
</html>