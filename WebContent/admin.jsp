<%@page import="bean.dangnhapadminbean"%>
<%@page import="bean.khachhangbean"%>
<%@page import="bo.cdbo"%>
<%@page import="bo.loaibo"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.cdbean"%>
<%@page import="dao.cddao"%>
<%@page import="bean.loaibean"%>
<%@page import="dao.loaidao"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	
<nav class="header header--inline">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="ht1Controller">Danh sách</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="QuanLyAdminController">Quản lí CD</a></li>
      
       <li><a href="xacnhanController">Xác nhận chuyển tiền</a></li>
        
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="logoutController"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      <li>
      <%if(session.getAttribute("admin")==null){ %>
      <a href="dangnhapadminController">
          <span class="glyphicon glyphicon-log-in"></span>
	       Login
       </a></li>
       <%} else{  %>
       <a href="#">
          <span class="glyphicon glyphicon-log-in"></span>
	      Hi <%dangnhapadminbean admin =(dangnhapadminbean)session.getAttribute("admin");
	         out.print(admin.getTenDangNhap());%>
       </a></li>
       <%} %>
    </ul>
  </div>
</nav>
	

			
				
</body>
</html>