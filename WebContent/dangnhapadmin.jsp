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
	<title>Login Admin</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<style>
body {font-family: Arial, Helvetica, sans-serif;}
form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password] {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}

button {
  background-color: #04AA6D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}

img.avatar {
  width: 40%;
  border-radius: 50%;
}

.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
}
</style>
	
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

				<ul class="nav navbar-nav navbar-right">
					<li><a href="thoat.jsp"><span
							class="glyphicon glyphicon-user"></span> LogOut</a></li>
					<li><a href="ktdnController"><span
							class="glyphicon glyphicon-log-in"></span> Login</a></li>
				</ul>
			</div>
		</nav>
	
					<table >
	<form action="dangnhapadminController" method="post">
							
  <div class="container">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="txtun" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="txtpass" required>
 	 <div class="g-recaptcha" style="margin-left:30px" data-sitekey="6LeVx5UjAAAAADtB67tJQsd6VO-gZ2xhCoq1gyLc" data-callback="verifyRecaptchaCallback" data-expired-callback="expiredRecaptchaCallback"></div>
    
       <%  if (request.getParameter("kt")!=null) {%>
							<div class="alert alert-danger" role="alert" > Username or Password không đúng </div>
      <%  }%>
	<button class="btn btn-primary mb-3" style="margin-top:15px" type="submit">Login</button>				
    
    <hr>
      <span class="psw">Bạn chưa có tài khoản? <a href="khachhangController">Đăng ký?</a></span>
    
  </div>
  
	</form>
	</table>
	</body>
	</html>