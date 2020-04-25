<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>取款界面</title>
<link rel="stylesheet"  type="text/css"  href="add.css">
</head>
<body class="my" background = "2.jpg">  
       <form action="takeCountServlet" method="get">
          	账&nbsp户&nbsp&nbsp卡&nbsp&nbsp号:<input name="cardid" value=""><br>
          	<br>
          	币&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp种:<input name="moneystyle"><br>
          	<br>
          	取&nbsp款&nbsp&nbsp金&nbsp&nbsp额:<input name="money"><br>
          	
          	&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="submit" value="确认">
          
        </form>	

</body>
</html>