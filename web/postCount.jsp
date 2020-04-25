<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转账界面</title>
<link rel="stylesheet"  type="text/css"  href="add.css">
</head>
<body class="my" background = "2.jpg">
<form action="postCountServlet" method="post">
          	转出账/卡号:<input name="id_num1"><br>
         
          	存&nbsp出&nbsp&nbsp户&nbsp&nbsp名:<input name="name"><br>
          	
          	转入账/卡号:<input name="id_num2"><br>
         	
          	转&nbsp入&nbsp&nbsp户&nbsp&nbsp名:<input name="name"><br>
          	
          	币&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp种:<input name="moneystyle"><br>
          	
          	转&nbsp账&nbsp&nbsp金&nbsp&nbsp额:<input name="money"><br>
          	
          	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="确认">
        </form>	

</body>
</html>