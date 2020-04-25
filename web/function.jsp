<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户界面</title>
<link rel="stylesheet"  type="text/css"  href="add.css">
</head>
<body class="my" background = "2.jpg">
		<form action="mainServlet" method="get">
         		 <input type="checkbox" name ="T" value="4">个人账户信息<br>
         		 
         		 <input type="checkbox" name ="T"  value="1">存款<br>
         		 
         		 <input type="checkbox" name ="T"  value="2">取款<br>
         		 
         		 <input type="checkbox" name ="T"  value="3">转账<br>
         		
         		 <input type="checkbox" name ="T"  value="5">退出<br>
         		 
         		 <input type="submit" value="确定">
         		 
   		</form>
</body>
</html>