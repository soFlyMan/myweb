<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@page import="com.entity.*" %>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="header_top">
		    <div class="col-sm-3 logo"><a href="index.jsp"><img src="images/logo.png" alt=""/></a></div>
		    
		    <div class="col-sm-6 nav">
			  <ul>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="论坛"><a href="movie.jsp"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="电影"><a href="movie.jsp"> </a> </span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="视频"><a href="movie.jsp"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="游戏"><a href="movie.jsp"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="电视剧"><a href="movie.jsp"> </a></span></li>
				 <li><span class="simptip-position-bottom simptip-movable" data-tooltip="更多"><a href="movie.jsp"> </a></span></li>
			 </ul>
			 
			</div>
	<%
			String login_user = (String)request.getSession().getAttribute("user");
	%>
	<%
		if (login_user == null) {
	%>
			<div class="col-sm-3 header_right">
			   <ul class="header_right_box">
				 <li><img src="images/p1.png" alt=""/></li>
				 <li><p><a href="login.jsp"id="youke">游客</a></p></li>
				 <li class="last"><i class="edit"> </i></li>
				 
				 <div class="clearfix"> </div>
				 
			   </ul>
			</div>
			
			
			<%
		}else{
	%>
			
				<div class="col-sm-3 header_right">
			   <ul class="header_right_box">
				 <li><img src="images/p1.png" alt=""/></li>
				 <li><p><a href="login.jsp">${user}</a></p></li>
				 <li class="last"><i class="edit"> </i></li>
				 <button onclick="logout()"><a>退出</a></button>
				 <div class="clearfix"> </div>
			   </ul>
			   
			</div>
			
			<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
			<SCRIPT type="text/javascript">
				function logout() {
					alert("注销成功");
					location.href="LogoutServlet";
				}
			</SCRIPT>
	<% 
	}
	%>		
			
			
			<div class="clearfix"> </div>
	      </div>
	      
</body>
</html>