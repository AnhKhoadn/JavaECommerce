<%@page import="bo.cdbo"%>
<%@page import="bo.loaibo"%>
<%@page import="dao.cddao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.cdbean"%>
<%@page import="bean.loaibean"%>
<%@page import="dao.loaidao"%>
<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
		<script src='https://www.google.com/recaptcha/api.js'></script>
	
</head>
<body>
	<nav class="header header--inline">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="htController">Trang chủ</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="htgioController">Giỏ hàng</a></li>
				
				<li><a href="lichsu.jsp">Lịch sử mua hàng </a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="thoat.jsp"><span
						class="glyphicon glyphicon-user"></span> LogOut</a></li>
				<li><a href="ktdnController"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>

	<table>
		<form action="ktdnController" method="post">

			<div class="container">
			<div class="col-sm-6" style="margin-left: 25%">
				<label for="uname"><b>Username</b></label> <br>
				<input class="form-control" type="text" placeholder="Enter Username" name="txtun" required> 
				<label for="psw"><b>Password</b></label> <br>
				<input class="form-control" type="password" placeholder="Enter Password" name="txtpass" required>
								         <div class="g-recaptcha" style="margin-left:30px" data-sitekey="6LeVx5UjAAAAADtB67tJQsd6VO-gZ2xhCoq1gyLc" data-callback="verifyRecaptchaCallback" data-expired-callback="expiredRecaptchaCallback"></div>
				
				<%
				if (request.getParameter("kt") != null) {
				%>
				<div class="alert alert-danger" role="alert">Username or
					Password không đúng</div>
				<%
				}
				%>
				<span style="margin-top: 10px" class="psw">Bạn chưa có tài khoản? <a
					href="khachhangController">Đăng ký?</a></span>
				<button class="btn btn-primary mb-3" style="margin-top:70px" type="submit">Login</button>
				
			</div>
		</div>
	</div>
		</form>
	</table>
</body>
</html>